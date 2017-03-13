/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg1;

/**
 *
 * @author alumno
 */
public class Empleado extends Cuenta{
    private String nombre;
    private double salario;
    Cuenta cuenta;

    public Empleado(String nombre, double salario, Cuenta cuenta, Tipo tipo, double s, double i) {
        super(tipo, s, i);
        this.nombre = nombre;
        this.salario = salario;
        this.cuenta = cuenta;
    }
    
    public void ingresaSalario(){
        cuenta.ingresa(salario);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", cuenta=" + cuenta + '}';
    }

}
