package com.aorihuela.appFacturacion;

import com.aorihuela.appFacturacion.modelo.Cliente;
import com.aorihuela.appFacturacion.modelo.Factura;

import java.util.Scanner;

public class appMain {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Al","1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese descripcion de factura: ");
        String desc = sc.nextLine();

        Factura factura = new Factura(desc, cli);

        System.out.println(cli);
    }
}
