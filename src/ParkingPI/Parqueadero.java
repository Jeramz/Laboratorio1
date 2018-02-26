/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingPI;

import javax.swing.JOptionPane;
/**
 *
 * @author Jesús Ramírez
 */
public class Parqueadero {
    
    String parqueadero[][];
    int autosIngresados;
    int autosRetirados;
    int autosParqueados;
    int dineroParqueos;
    
    public Parqueadero(){
        parqueadero=new String[6][6];
        for(int i=0;i<parqueadero.length;i++){
            for(int j=0;j<parqueadero.length;j++){
                parqueadero[i][j]="_";
            }
        }
    }
    
    public void addIngresados(){
        autosIngresados+=1;
        autosParqueados+=1;
    }
    
    public int getIngresados(){
        return autosIngresados;
    }
    public void addRetirados(){
        autosRetirados+=1;
        autosParqueados-=1;
    }
    public int getRetirados(){
        return autosRetirados;
    }
    
    public int getParqueados(){
        return autosParqueados;
    }
    
    public void addDineroParqueos(int dinero){
        dineroParqueos+=dinero;
    }
    
    public int getDineroParqueos(){
        return dineroParqueos;
    }
    
    
    public boolean hayEspacio(String tipoAuto){
        boolean respuesta=false;
        if(tipoAuto.equals("carga")){
            for(int i=0;i<1;i++){
                for(int j=0;j<3;j++){
                    if(parqueadero[i][j].equals("_")){
                        respuesta=true;
                    }
                }
            }
        }
        if(tipoAuto.equals("pasajeros")){
            for(int i=0;i<6;i++){
                for(int j=3;j<6;j++){
                    if(parqueadero[i][j].equals("_")){
                        respuesta=true;
                    }
                }
            }
        }
        return respuesta;
    }
    
    public void ingresarAuto(String tipoAuto){
        switch(tipoAuto){
            case "carga":
                if(this.hayEspacio(tipoAuto)){
                    for(int i=0;i<1;i++){
                        for(int j=0;j<3;j++){
                            if(parqueadero[i][j].equals("_")){
                                String placa=JOptionPane.showInputDialog("Ingrese numero de placa: ");
                                parqueadero[i][j]=placa;
                                break;
                            }
                        }
                    }
                }else{
                JOptionPane.showMessageDialog(null, "No espacio disponible para este tipo de auto");
                }
                break;
        
            case "pasajeros":
                boolean ingresar=false;
                if(this.hayEspacio(tipoAuto)){
                    for(int i=0;i<parqueadero.length;i++){
                        for(int j=0;j<parqueadero.length;j++){
                            if(parqueadero[i][j].equals("_")){
                                if(i==0 && j<3){  
                                }else{
                                String placa=JOptionPane.showInputDialog("Ingrese numero de placa: ");
                                parqueadero[i][j]=placa;
                                ingresar=true;
                                break;
                                }
                            }
                        }
                        if(ingresar){
                            break;
                        }
                    }
                }else{
                JOptionPane.showMessageDialog(null, "No espacio disponible para este tipo de auto");
                }
                break;
        }
    }
    
    public String consultarAuto(String placa){
        String resultado="El auto buscado no se encuentra en el parqueadero";
        for(int i=0;i<parqueadero.length;i++){
            for(int j=0;j<parqueadero.length;j++){
                if(parqueadero[i][j].equals(placa)){
                    resultado=parqueadero[i][j];
                }
            }
        }
        return resultado;
    }
    
    public String imprimirParqueadero(){
        String resultado="";
        
        for(int i=0;i<parqueadero.length;i++){
            for(int j=0;j<parqueadero.length;j++){
                resultado+=parqueadero[i][j] + " ";
            }
            resultado+="\n";
        }
        return resultado;
    }
    
    public String retirarAuto(String placa, int horasParqueo){
        String resultado="El auto buscado no se encuentra en el parqueadero";
        for(int i=0;i<parqueadero.length;i++){
            for(int j=0;j<parqueadero.length;j++){
                if(parqueadero[i][j].equals(placa)){
                    parqueadero[i][j]="_";
                    resultado="El auto ha sido retirado.\n Total a pagar: " + this.tarifa(horasParqueo);
                }
            }
        }
        return resultado;
    }
    
    public int tarifa(int horasParqueo){
        int totalPagar=1500;
        for(int i=0;i<=horasParqueo;i++){
            if(i>2){
                totalPagar+=1000;
            }
        }
        this.addDineroParqueos(totalPagar);
        return totalPagar;
    }
    
    public String arqueoCaja(){
        String respuesta= "La cantidad de autos ingresados fue de: " + this.getIngresados() + "\n" +
                          "La cantidad de autos parqueados es de: " + this.getParqueados() + "\n" +
                          "La cantidad de autos retirados es de: " +  this.getRetirados() + "\n" + 
                          "La cantidad de dinero recaudado fue de: " + this.getDineroParqueos();
        
        return respuesta;
    }
    
}
