/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioBiFunction;

/**
 *
 * @author Grijalva
 */
public class Empleado {
    String nombre;
    double Salario;

    public Empleado(String nombre, double Salario) {
        this.nombre = nombre;
        this.Salario = Salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    
}
