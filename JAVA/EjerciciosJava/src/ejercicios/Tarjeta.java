package ejercicios;

public class Tarjeta {

	private String entidademisora;
	private int numero;
	private String fecha;
	private String titular;
	private boolean activa;

	public Tarjeta() {
		this.entidademisora = "";
		this.numero = 0;
		this.fecha = "";
		this.titular = "";
		this.activa = false;
	}

	public Tarjeta(String entidademisora, int numero, String fecha, String titular) {
		this.entidademisora = entidademisora;
		this.numero = numero;
		this.fecha = fecha;
		this.titular = titular;
		this.activa = false;
	}

    public void activarTarjeta() {
        if (!activa) {
            activa = true;
            System.out.println("La tarjeta ha sido activada.");
        } else {
            System.out.println("La tarjeta ya está activa.");
        }
    }
    
    public void anularTarjeta() {
    	if (activa) {
    		activa = false;
    		System.out.println("La tarjeta ha sido anulada");
    	} else {
    		System.out.println("La tarjeta ya estaba anulada");
    	}
    }
    
    public void pagar(double cantidad) {
    	if (activa) {
    		System.out.println("El pago ha sido realizado, cantidad total: " + cantidad + "€.");
    	} else {
    		System.out.println("La tarjeta no esta activada, imposible realizar el pago.");
    	}
    }

	public String getEntidademisora() {
		return entidademisora;
	}

	public void setEntidademisora(String entidademisora) {
		this.entidademisora = entidademisora;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    

}
