/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author umg
 */
public class Paciente {
    String Nombre;
    String Paciente;

    public Paciente(String Nombre, String Paciente) {
        this.Nombre = Nombre;
        this.Paciente = Paciente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }
    
    
    
    
    
}
