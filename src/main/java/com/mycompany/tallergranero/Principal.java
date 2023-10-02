package com.mycompany.tallergranero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// aplicando lo de herencia 
public class Principal extends ListaVentas {
    public static void main(String[] args) {
        ListaCategorias categorias= new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0-A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0-B","Aseo",0.15));
        
        ListaArticulos articulos = new ListaArticulos();
        Categoria c;
        c= categorias.getCategoriaByCodigo("0-A");
        articulos.addArticuloToList(new Articulo ("001","arroz",50,2500,c));
        articulos.addArticuloToList(new Articulo ("002","cafe",40,300,c));
        
        c= categorias.getCategoriaByCodigo("0-B");
        articulos.addArticuloToList(new Articulo ("003","limpido",40,300,c));
        articulos.addArticuloToList(new Articulo ("004","JABON",40,400,c));
        articulos.generarGanancias(categorias);
        //articulos.showList();

       
       try {
           
       ListaVentas ventas = new ListaVentas();
        Articulo a;
        a= articulos.getArticuloByCodigo("001");
        ventas.addVentaToList(new Venta ("0-A",a,"Arroz",6,convertirFecha("03-12-2004")));
        
        a= articulos.getArticuloByCodigo("002");
        ventas.addVentaToList(new Venta ("0-B",a,"Arroz",6,convertirFecha("04-12-2004")));
        
        // llamado a metodo para calcular totales
        ventas.generarTotal(articulos);
        ventas.showList();
           
       }catch(ParseException e){
           System.out.println("");
        
    }
        
    }
   
} 

