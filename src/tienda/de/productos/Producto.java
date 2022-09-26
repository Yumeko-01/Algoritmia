/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.de.productos;

/**
 *
 * @author jostin-medina
 */
public class Producto {
    private String nombre;
    private int tipo;
    private double cantidad;
    private double cantidadMinimo;
    private int PrecioBase;
    private int ProductosVendidos;

    public Producto(String nombre, int tipo, double cantidad, int PrecioBase, int ProductosVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.PrecioBase = PrecioBase;
        this.ProductosVendidos = ProductosVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidadMinimo() {
        return cantidadMinimo;
    }

    public void setCantidadMinimo(double cantidadMinimo) {
        this.cantidadMinimo = cantidadMinimo;
    }

    public int getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(int PrecioBase) {
        this.PrecioBase = PrecioBase;
    }

    public int getProductosVendidos() {
        return ProductosVendidos;
    }

    public void setProductosVendidos(int ProductosVendidos) {
        this.ProductosVendidos = ProductosVendidos;
    }
    
    
}
