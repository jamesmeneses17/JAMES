
package com.mycompany.tallergranero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListaVentas {
    private List <Venta> ventaList;
    private Map<String,Double>total;
    private double totalGeneral;

    public ListaVentas(List<Venta> ventaList) {
        this.ventaList = ventaList;
         this.total=new HashMap<>();
        this.totalGeneral=0.0;
    }
    public ListaVentas(){
        this.ventaList= new ArrayList<>();
        this.total=new HashMap<>();
        this.totalGeneral = 0.0; 
    }
    public void addVentaToList(Venta v){
        this.ventaList.add(v);
    }
 
    public void showList(){
        for (Venta v: this.ventaList){
            v.showInfo();
        }
    } 
   
     
       
    /*public void generarTotal(ListaArticulos listaArticulos){
        for (Venta venta : ventaList){
            venta.calcularTotal(listaArticulos);
            String codigo = venta.getCodigo();
            
        }
     
}*/
     public void generarTotal(ListaArticulos listaArticulos){
        for (Venta venta : ventaList){
            venta.calcularTotal(listaArticulos);
            String codigo = venta.getCodigo();
            if (total.containsKey(codigo)){
                total.put(codigo, total.get(codigo)+venta.getSubtotal());   
            }else {
                total.put(codigo, venta.getSubtotal());
            }
            totalGeneral+=venta.getSubtotal();
        }
                System.out.println("totales por codigo: ");
        for (Map.Entry<String, Double> entry : total.entrySet()){
        System.out.println("Código: " + entry.getKey() + " Total: " + entry.getValue());
      } 
      System.out.println("  ");
      System.out.println("Total General: "+totalGeneral);
} 
     
     
      public   static Date convertirFecha(String fecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("MM-dd-yy");
        Date date = formato.parse(fecha);
        // devolvemos el objeto Date
        return date;
    }
      
       


    
}
