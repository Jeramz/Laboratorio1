/*
  Clase Parqueadero: Le asigna un valor aleatorio a cada posición de una matriz dada, 
  imprime una matriz ingresada, realiza la multiplicación entre dos matrices ingresadas,
  realiza la suma entre dos matrices ingresadas, realiza la transpuesta de una matriz dada.

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package ParkingPI;

import javax.swing.JOptionPane;

public class Parqueadero {
    
    String parqueadero[][];
    int autosIngresados;
    int autosRetirados;
    int autosParqueados;
    int dineroParqueos;
    
    
    //constructor
    public Parqueadero(){
        parqueadero=new String[6][6];
        for(int i=0;i<parqueadero.length;i++){
            for(int j=0;j<parqueadero.length;j++){
                parqueadero[i][j]="_";
            }
        }
    }
    
    //suma 1 al contador de autos ingresados y al contador de autos parqueados
    public void addIngresados(){
        autosIngresados+=1;
        autosParqueados+=1;
    }
    
    //retorna la cantidad de autos ingresados
    public int getIngresados(){
        return autosIngresados;
    }
    
    //suma 1 al contador de autos retirados y resta 1 al contador de autos parqueados
    public void addRetirados(){
        autosRetirados+=1;
        autosParqueados-=1;
    }
    
    //retorna la cantidad de autos retirados
    public int getRetirados(){
        return autosRetirados;
    }
    
    //retorna la cantidad de autos parqueados
    public int getParqueados(){
        return autosParqueados;
    }
    
    //le ingresa un entero (dinero) y se suma al contador de dineroParqueos 
    public void addDineroParqueos(int dinero){
        dineroParqueos+=dinero;
    }
    
    //retorna la cantidad de dinero recaudado por parqueos
    public int getDineroParqueos(){
        return dineroParqueos;
    }
    
    
    //le ingresa un String (tipo de auto) y retorna true si hay espacio en el parqueadero
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
    
    //le ingresa un string (tipo de auto), ingresa un auto en el parqueadero si hay espacio
    public void ingresarAuto(String tipoAuto){
        switch(tipoAuto){
            case "carga":
                if(this.hayEspacio(tipoAuto)){
                    for(int i=0;i<1;i++){
                        for(int j=0;j<parqueadero.length;j++){
                            if(parqueadero[i][j].equals("_")){
                                String placa=JOptionPane.showInputDialog("Ingrese numero de placa: ");
                                if(placa.equals(this.consultarAuto(placa))){
                                    JOptionPane.showMessageDialog(null, "Ya hay un auto con ese numero de placa en el parqueadero.");
                                }else{
                                parqueadero[i][j]=placa;
                                }
                                this.addIngresados();
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
                    for(int i=1;i<parqueadero.length;i++){
                        for(int j=0;j<parqueadero.length;j++){
                            if(parqueadero[i][j].equals("_")){
                                String placa=JOptionPane.showInputDialog("Ingrese numero de placa: ");
                                if(placa.equals(this.consultarAuto(placa))){
                                    JOptionPane.showMessageDialog(null, "Ya hay un auto con ese numero de placa en el parqueadero.");
                                }else{
                                parqueadero[i][j]=placa;
                                }
                                ingresar=true;
                                this.addIngresados();
                                break;
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
    
    //le ingresa un String (placa del auto), si existe, retorna el puesto en el parqueadero en el que se encuentra el auto 
    public String consultarAuto(String placa){
        String resultado="El auto buscado no se encuentra en el parqueadero";
        int posicion=1;
        for(int i=0;i<parqueadero.length;i++){
            for(int j=0;j<parqueadero.length;j++){
                if(parqueadero[i][j].equals(placa)){
                    resultado="El auto con placas: " + parqueadero[i][j] + " se encuentra en el puesto " + posicion;
                }
                posicion+=1;
            }
        }
        return resultado;
    }
    
    //imprime de una forma visual, el parqueadero
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
    
    //le ingresa un string(placa) y cantidad de horas de parqueo, retira un auto del parqueadero
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
        this.addRetirados();
        return resultado;
    }
    
    //calcula la cantidad de dinero a pagar segun las horas que haya pasado un auto dentro del parqueadero
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
    
    //imprime la cuenta de cuantos autos han ingresado y salido del parqueadero en el dia, indica la cantidad de autos parqueados actualmente
    // indica la cantidad de dinero recaudado por termino de parqueos.
    public String arqueoCaja(){
        String respuesta= "La cantidad de autos ingresados fue de: " + this.getIngresados() + "\n" +
                          "La cantidad de autos parqueados es de: " + this.getParqueados() + "\n" +
                          "La cantidad de autos retirados es de: " +  this.getRetirados() + "\n" + 
                          "La cantidad de dinero recaudado fue de: " + this.getDineroParqueos();
        
        return respuesta;
    }
    
}
