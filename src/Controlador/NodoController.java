/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Lista;
import Vista.frmIngresoPacientes;
import Vista.frmListaPacientes;
import Vista.frmPrincipal;

/**
 *
 * @author umg
 */
public class NodoController implements ActionListener {
    
    //levantar formulario principal 
    frmPrincipal VistaPrincipal;
    frmIngresoPacientes IngresoPacientes;
    frmListaPacientes ListaPacientes;
    Lista nuevaLista;
    

    public NodoController(frmPrincipal VistaPrincipal, frmIngresoPacientes IngresoPacientes, frmListaPacientes ListaPacientes, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.IngresoPacientes = IngresoPacientes;
        this.ListaPacientes = ListaPacientes;
        this.nuevaLista = nuevaLista;
        
        //poner a la escucha los botones
        this.VistaPrincipal.btnAgregarPaciente.addActionListener(this);
        this.VistaPrincipal.btnLista.addActionListener(this);
        
        
        //levantar vista principal
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }

   
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == this.VistaPrincipal.btnAgregarPaciente)    
    {
        //abrir la vista nodos
        //poner a la escucha los botones apilar y encolar
        this.IngresoPacientes.btnAgregarPaciente.addActionListener(this);
        
        //levantar el formulario vista nodos
        this.IngresoPacientes.setLocationRelativeTo(null);
        this.IngresoPacientes.setVisible(true);
    }
    if(e.getSource() ==this.IngresoPacientes.btnAgregarPaciente){
        String Paciente = this.IngresoPacientes.txtNombre.getText()+ " "+this.IngresoPacientes.txtApellidos.getText();
        this.nuevaLista.Apilar(Paciente);
        this.ListaPacientes.txtLista.setText(this.nuevaLista.Listar());
        
        this.IngresoPacientes.txtApellidos.setText("");
        this.IngresoPacientes.txtNombre.setText("");
        

                
    }
    if(e.getSource()==this.VistaPrincipal.btnLista)
    {
        this.ListaPacientes.setVisible(true);
    }
    
    }
    
}
