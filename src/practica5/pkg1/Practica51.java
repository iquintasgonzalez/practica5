/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Practica51 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)
    {
        System.out.println("Sistema financiero");

        Cuenta c = new Cuenta( Cuenta.Tipo.AHORRO, 100, .05 );
        System.out.println( c );

        c.ingresa( 50 );
        c.ingresa( 120 );
        c.aplicaInteres();
        System.out.println( c );

        Prestamo p = new Prestamo( 12, 10000, .10 );
        System.out.println( p );

        p.amortiza();
        p.amortiza();
        System.out.println( p );
        
        CuentaComisionReintregro ccr = new CuentaComisionReintregro(Cuenta.Tipo.AHORRO, 1000, 0.05);
        try {
            ccr.reintegra(100);
        } catch (Exception ex) {
            System.err.println("ERROR" + ex.getMessage());
        }
        System.out.println(ccr);
    
        Empleado em = new Empleado("ines", 1000, c,Cuenta.Tipo.AHORRO,500,0.05);
        System.out.println(em);
        em.ingresaSalario();
        System.out.println(em);
    }
}
    

