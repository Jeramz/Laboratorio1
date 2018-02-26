/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalaComputadores;

import javax.swing.JOptionPane;
/**
 *
 * @author Jesús Ramírez
 */
public class SalaComputadores {
    
    String equipos[];
    
    public SalaComputadores(){
        equipos= new String[30];
        
        for(int i=0;i<equipos.length;i++){
            equipos[i]="L";
        }
    }
    
    public void asignarEquipo(int equipo){
        if(equipos[equipo].equals("L")){
        equipos[equipo]="X";
        JOptionPane.showMessageDialog(null, "El equipo se ha registrado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "El equipo ya ha sido registrado con anterioridad");
        }
    }
    
    public void cancelarTurno(int equipo){
        if(equipos[equipo].equals("X")){
            equipos[equipo]="L";
            JOptionPane.showMessageDialog(null, "El turno ha sido cancelado con exito");

        }else{
            JOptionPane.showMessageDialog(null, "El equipo escogido se encuentra libre en estos momentos.");
        }
    }
    
    public String listarEquipos(){
        String resultado="";
        for(int i=0;i<equipos.length;i++){
            resultado+= equipos[i] + " ";
        }
        return resultado;
    }
    
    public String equiposDisponibles(){
        
        int resultado=0;
        String listadoPC="";
        
        for(int i=0;i<equipos.length;i++){
            if(equipos[i].equals("L")){
                resultado+=1;
            }
        }
        
        return listadoPC = "Hay "+ resultado + " equipos disponibles" + "\n" + this.listarEquipos();
    }
    
    public String turnosAsignados(){
        int resultado=0;
        String listadoPC="";
        
        for(int i=0;i<equipos.length;i++){
            if(equipos[i].equals("X")){
                resultado+=1;
            }
        }
        return listadoPC=  "Hay " + resultado + " equipos asignados actualmente\n" + this.listarEquipos();
    }
   
    
}
