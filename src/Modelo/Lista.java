/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Lista {
Nodo primero;
Nodo Auxiliar;
String cadena = "";

public void Apilar()
{
    
}
public void Apilar(String Paciente)
{
    Nodo nuevoNodo = new Nodo(Paciente);
    if(primero == null)
    {
        primero = nuevoNodo;
    }
    else 
    {
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }
    JOptionPane.showMessageDialog(null, "Paciente agregado");
}

public String Listar()
{
 Auxiliar = primero;
 cadena = "";
 while(Auxiliar != null)
 {
     
     cadena = Auxiliar.Paciente +"\n"+cadena;
     Auxiliar = Auxiliar.siguiente;
     
 }
 return cadena;
}


}

