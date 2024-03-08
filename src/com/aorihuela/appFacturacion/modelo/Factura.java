package com.aorihuela.appFacturacion.modelo;

import java.util.Date;

public class Factura {
    private Integer idFactura;
    private String descripcion;
    private Date fechaFactura;
    private Cliente cliente;
    private ItemFactura[] items;
    private Integer indiceItems;
    public static final Integer MAX_ITEMS = 10;
    private static Integer ultimoIdFactura;



//    inicio constructor


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.idFactura = ++ultimoIdFactura;
        this.fechaFactura = new Date();
    }

    //    inicio geters and srters
    public Integer getIdFactura() {
        return idFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

//    inicio metodos propios
    public void addItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public Double calcluarTotal(){
        Double total = 0d;
        for( ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder("Factura Nro. ");
        sb.append(idFactura).append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\tNro. Nif: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n#\tNombre\tUS$\tCant.\tTotal\n");
        return sb.toString();
    }

}
