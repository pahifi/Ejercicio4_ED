package principal;

/**
 * @author pablo hilario
 * @version 1.0
 * @param cuenta1 Objeto de cla clase CCuenta creado para el usuario
 * @param saldoActual variable para mostrar el saldo de la cuenta del usuario
 */
import Cuentas.CCuenta;

public class Main {
/**
 * Clase principal de la aplicacion que ejecuta el metodo operativa cuenta 
 * donde podemos operar con la cuenta
 * @param args
 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta();
    }
/**
 * Metodo operativa_cuenta que permite la operacion con la cuenta ingresando y retirando efectivo
 */
	public static void operativa_cuenta() {
		float cantidad=0;
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
