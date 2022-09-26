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
public class Tienda {
    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    private double DineroEnCajas;
    private int CantidadTotal;
    private double valorDeLaVentas;

    public Tienda(double DineroEnCajas, int CantidadTotal, double valorDeLaVentas) {
        this.DineroEnCajas = DineroEnCajas;
        this.CantidadTotal = CantidadTotal;
        this.valorDeLaVentas = valorDeLaVentas;
    }

    public Producto getP1() {
        return p1;
    }

    public void setP1(Producto p1) {
        this.p1 = p1;
    }

    public Producto getP2() {
        return p2;
    }

    public void setP2(Producto p2) {
        this.p2 = p2;
    }

    public Producto getP3() {
        return p3;
    }

    public void setP3(Producto p3) {
        this.p3 = p3;
    }

    public Producto getP4() {
        return p4;
    }

    public void setP4(Producto p4) {
        this.p4 = p4;
    }

    public double getDineroEnCajas() {
        return DineroEnCajas;
    }

    public void setDineroEnCajas(double DineroEnCajas) {
        this.DineroEnCajas = DineroEnCajas;
    }

    public int getCantidadTotal() {
        return CantidadTotal;
    }

    public void setCantidadTotal(int CantidadTotal) {
        this.CantidadTotal = CantidadTotal;
    }

    public double getValorDeLaVentas() {
        return valorDeLaVentas;
    }

    public void setValorDeLaVentas(double valorDeLaVentas) {
        this.valorDeLaVentas = valorDeLaVentas;
    }
   
    
}
