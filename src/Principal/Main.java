/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controlador.NodoController;
import Modelo.Lista;
import Vista.frmIngresoPacientes;
import Vista.frmListaPacientes;
import Vista.frmPrincipal;

/**
 *
 * @author umg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmIngresoPacientes AgregarPacientes = new frmIngresoPacientes(VistaPrincipal,true);
        frmListaPacientes Lista = new frmListaPacientes(VistaPrincipal, true);
        Lista NuevaLista = new Lista();
        
        //levatnar el controlador
        NodoController NuevoControlador = new NodoController(VistaPrincipal, AgregarPacientes,Lista,NuevaLista);
    }
    
}
