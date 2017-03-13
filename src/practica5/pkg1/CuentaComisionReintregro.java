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
public class CuentaComisionReintregro extends Cuenta{
    
    public CuentaComisionReintregro(Tipo tipo, double s, double i) {
        super(tipo, s, i);
        
    }
    
    
    @Override
    public void reintegra(double v) throws Exception
    {
        if ( v > getSaldo() ) {
            throw new Exception( "saldo sobrepasado con: " + v );
        }

        saldo -= getSaldo() * getInteres();
    }
    
}
