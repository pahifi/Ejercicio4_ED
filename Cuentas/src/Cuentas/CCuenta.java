package Cuentas;

public class CCuenta {

/**
 * variables encapsuladas de la clase cuenta
 * @param nombre nombre del usuario de la cuenta
 * @paramm cuenta numero de cuenta del usuario
 * @param saldo saldo disponible en la cuenta
 * @param tipoInteres tipo de interes de la cuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * Metodos getter y setter de los atributos de la cuenta
 * @return
 */
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
/**
 * metodos constructores de la clase cuenta
 */
	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * metodo que permite conocer el saldo de la cuenta
 * @return
 */
    public double estado()
    {
        return saldo;
    }
/**
 * Metodo que permite actualizar el saldo de la cuenta con una cantidad
 * @param cantidad Cantidad de dinero con el que actualizamos la cuenta
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Metodo que permite retirar dinero de la cuenta
 * @param cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
