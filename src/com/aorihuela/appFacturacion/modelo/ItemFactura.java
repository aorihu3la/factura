package com.aorihuela.appFacturacion.modelo;

public class ItemFactura {
    private Integer cantidad;
    private Producto producto;

//    Constructor

    public ItemFactura(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }


//    inicio geters and seters

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

//    Inicio de metodos propios
    public Double calcularImporte (){
        return this.cantidad * this.producto.getPrecio();
    }
}
