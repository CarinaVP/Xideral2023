package com.luv2code.web.jdbc;

public class Telefono {

	private int id;
	private String nombreTelefono;
	private String dueño;
	private String detalle;

	public Telefono(String nombreTelefono, String dueño, String detalle) {
		this.nombreTelefono = nombreTelefono;
		this.dueño = dueño;
		this.detalle = detalle;
	}

	public Telefono(int id, String nombreTelefono, String dueño, String detalle) {
		this.id = id;
		this.nombreTelefono = nombreTelefono;
		this.dueño = dueño;
		this.detalle = detalle;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreTelefono() {
		return nombreTelefono;
	}

	public void setNombreTelefono(String nombreTelefono) {
		this.nombreTelefono = nombreTelefono;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Telefono [id=" + id + ", nombreTelefono=" + nombreTelefono + ", dueño=" + dueño + ", detalle=" + detalle + "]";
	}	
}
