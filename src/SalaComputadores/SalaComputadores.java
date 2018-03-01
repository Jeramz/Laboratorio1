/*
  Clase SalaComputadores: Crea una sala con 30 equipos disponibles, asgina un turno en el 
  numero de equipo ingresado, cancela un turno en el numero de equipo ingresado, permite 
  conocer el numero de computadores asignados y el numero de computadores libres

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package SalaComputadores;

import javax.swing.JOptionPane;

public class SalaComputadores {
    
    String equipos[];  //Matriz que guarda los equipos de la sala
    
    //Constructor
    public SalaComputadores(){
        equipos= new String[30]; //inicializa la matriz
        
        for(int i=0;i<equipos.length;i++){ //Ciclo que reorre la matriz y le asigna a cada posición el String L (libre)
            equipos[i]="L";
        }
    }
    
    public void asignarEquipo(int equipo){  
        //Asigna un equipo, le entra el numero del equipo y cambia el String L (libre) del equipo por una X (asignado),
        //Si el equipo ya estaba asignado, imprime un mensaje
        if(equipos[equipo].equals("L")){
        equipos[equipo]="X";
        JOptionPane.showMessageDialog(null, "El equipo se ha registrado con exito");
        }else{
            JOptionPane.showMessageDialog(null, "El equipo ya ha sido registrado con anterioridad");
        }
    }
    
    public void cancelarTurno(int equipo){
        //Cancla un turno, le ntra el numero del equipo y cambia el String X (Asignado) del equipo por una L(libre),
        //si el quipo ya etaba libre, imprime un mensaje
        if(equipos[equipo].equals("X")){
            equipos[equipo]="L";
            JOptionPane.showMessageDialog(null, "El turno ha sido cancelado con exito");

        }else{
            JOptionPane.showMessageDialog(null, "El equipo escogido se encuentra libre en estos momentos.");
        }
    }
    
    public String listarEquipos(){
        //Retorna un String que reprsenta todos los equipos de a sala y su estado
        String resultado="";
        for(int i=0;i<equipos.length;i++){
            resultado+= equipos[i] + " ";
        }
        return resultado;
    }
    
    public String equiposDisponibles(){
        //Retorna un Sring que dice cuantos equipos hay disponibles en una sala e imprime los computadores 
        //que hay n sta para una mejor visuaización 
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
        //Retorna un Sring que dice cuantos equipos hay Asignados en una sala e imprime los computadores 
        //que hay n sta para una mejor visuaización 
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
