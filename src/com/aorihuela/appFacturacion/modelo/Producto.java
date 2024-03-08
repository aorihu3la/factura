package com.aorihuela.appFacturacion.modelo;

public class Producto {
    private Integer idProducto;
    private String nombre;
    private Double precio;
    private static Integer ultimoIdProducto;



    // inicio getters and seters

    public Integer getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    // inicio de constructores

    public Producto() {
        this.idProducto = ++ultimoIdProducto;
    }


    // inicio metodos


}
