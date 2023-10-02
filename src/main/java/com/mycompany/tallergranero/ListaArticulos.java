package com.mycompany.tallergranero;

import java.util.ArrayList;
import java.util.List;


public class ListaArticulos {
    private List<Articulo> articuloList;

    public ListaArticulos(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }
      public ListaArticulos() {
        articuloList = new ArrayList<>();
    }

     public void addArticuloToList(Articulo a){
        this.articuloList.add(a);

    }
       public void generarGanancias(ListaCategorias listaCategorias){
        for(Articulo a: articuloList){
            a.setValorVenta(listaCategorias);
        }
    }
        public void showList(){
        for (Articulo articulo :articuloList){
            articulo.showInfo();
        }
    }
        public List<Articulo> getArticuloList() {
        return articuloList;
    }
        
          // metodo para buscar un articulo
    
    Articulo getArticuloByCodigo(String codigo){
        for (Articulo a: articuloList) {
            if (a.getCodigo().compareToIgnoreCase(codigo)==0){
                return a;
            }
        }return null;
    }
    
    
}
