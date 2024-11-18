package com.login.pojos;

public class TextToJSON {
	public String message = "";
	public Integer numero = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	// Constructor lleno
	public TextToJSON(String message, Integer numero) {
		super();
		this.message = message;
		this.numero = numero;
	}

	// Constructor vacío
	public TextToJSON() {
		super();
		this.message = "Valor por defecto";
		this.numero = 0;
	}
}
