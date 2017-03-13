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
    
    public void aplicaInteres()
    {
         saldo -= getSaldo() * getInteres();
    }
    public String toString()
    {
        StringBuilder toret = new StringBuilder();

        toret.append( "Sacar dinero " );
        toret.append( saldo );
        toret.append( ": " );
        toret.append( super.toString() );

        return toret.toString();
    }
}
