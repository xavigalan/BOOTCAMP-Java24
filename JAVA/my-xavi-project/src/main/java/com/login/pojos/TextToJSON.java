package com.login.pojos;

public class TextToJSON {
	private String palabra1 = "";
	private String palabra2 = "";

	public String getPalabra1() {
		return palabra1;
	}

	public void setPalabra1(String palabra1) {
		this.palabra1 = palabra1;
	}

	public String getPalabra2() {
		return palabra2;
	}

	public void setPalabra2(String palabra2) {
		this.palabra2 = palabra2;
	}

	public TextToJSON(String palabra1, String palabra2) {
		super();
		this.palabra1 = palabra1;
		this.palabra2 = palabra2;
	}

	public TextToJSON() {
		this("", "");
	}
}
