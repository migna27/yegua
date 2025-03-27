/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.yegua.entidades;

import java.util.List;
import mx.itson.yegua.enums.Categoria;
import mx.itson.yegua.enums.TipoVenta;

/**
 *
 * @author Miguel
 */
public class Venta {

    /**
     * @return the categoria
     */
    
    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the articulos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the tipoventa
     */
    public TipoVenta getTipoventa() {
        return tipoventa;
    }

    /**
     * @param tipoventa the tipoventa to set
     */
    public void setTipoventa(TipoVenta tipoventa) {
        this.tipoventa = tipoventa;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
   private double subtotal;
   private List<Articulo> articulos;
   private double descuento;
   private TipoVenta tipoventa;
   private double total;
   
   
   
   
    public void calcularSubtotal(){
    //if (tipoventa == TipoVenta.CONTADO);
   double subtotalCalculado = 0;
   
   for (Articulo articulo : this.articulos){
    if(tipoventa == TipoVenta.CREDITO && articulo.getCategoria() != Categoria.ALIMENTOS){
       subtotalCalculado += articulo.getPrecio()*1.30;
    } else {
    subtotalCalculado += articulo.getPrecio() * 1.30;
    }
    if( tipoventa == TipoVenta.CONTADO){
      subtotalCalculado += articulo.getPrecio();
    }
    }
    this.subtotal = subtotalCalculado;
    }
    
   public void calculartotal(){
   if (subtotal > 5000){
   total = subtotal*0.97;
   } else {
   total = subtotal;   }
   
   }
}
