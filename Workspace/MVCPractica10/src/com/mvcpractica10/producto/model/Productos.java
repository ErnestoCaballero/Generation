package com.mvcpractica10.producto.model;

public class Productos {
	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	private int existenciaProducto;
	
	
	public Productos() {}
	
	public Productos(int idProducto, String nombreProducto, double precioProducto, int existenciaProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.existenciaProducto = existenciaProducto;
	}



	public int getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}



	public String getNombreProducto() {
		return nombreProducto;
	}



	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}



	public double getPrecioProducto() {
		return precioProducto;
	}



	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}



	public int getExistenciaProducto() {
		return existenciaProducto;
	}



	public void setExistenciaProducto(int existenciaProducto) {
		this.existenciaProducto = existenciaProducto;
	}

	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", existenciaProducto=" + existenciaProducto + "]";
	}
	
}
