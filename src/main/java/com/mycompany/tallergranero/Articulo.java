package com.mycompany.tallergranero;

public class Articulo {
    private String codigo;
    private String nombre;
    private long cantidad;
    private double valorCompra;
    private double valorVenta;
    private Categoria categoria;
    private double ganancia;

    public Articulo() {
    }

    public Articulo(String codigo, String nombre, long cantidad, double valorCompra, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
        this.valorVenta = valorVenta;
        this.categoria = categoria;
        this.ganancia = 0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    public void showInfo(){
        System.out.println( "Codigo: "+this.getCodigo() );
        System.out.println("Categoria: "+this.getCategoria().getCodigo());
        System.out.println( "Nombre Producto: " +this.getNombre() );
        //System.out.println( "Categoria: "+this.getCategoria().getCodigo() );

        System.out.println( "Cantidad en bodega: " +this.getCantidad() );
        System.out.println( "Valor de bodega :  "+ this.getValorCompra() );
        System.out.println("Valor Venta pa el cliente:  "+this.getValorVenta());
        //System.out.println("Valor Venta "+ this.getValorVenta());
        System.out.println("  ");
    }
    
  /* public void setValorVenta(ListaCategorias listaCategorias){
        for (Categoria c: listaCategorias.categoriaList){
            if(this.getCategoria().getCodigo().equals(c.getCodigo())){
                this.ganancia = this.valorCompra * c.getGanancia() + this.valorCompra;
            } 
        } 
       }*/
     public void setValorVenta(ListaCategorias listaCategorias){
         this.valorVenta = this.valorCompra * (1+ this.categoria.getGanancia());
    }
    
    
    
}
