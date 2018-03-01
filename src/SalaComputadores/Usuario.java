/*
  Clase Usuario: Menú para el usuario

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package SalaComputadores;

import javax.swing.JOptionPane;

public class Usuario {


    public static void main(String[] args) {
        
        int estado; 
        
        SalaComputadores sala1=new SalaComputadores();
        SalaComputadores sala2=new SalaComputadores();
        SalaComputadores sala3=new SalaComputadores();
        
        do{
            estado=Integer.parseInt(JOptionPane.showInputDialog("Menú\n1.Asignar turno"+
                                                                    "\n2.Cancelar turno"+
                                                                    "\n3.Equipos disponibles"+
                                                                    "\n4.Turnos asignados"+
                                                                    "\n5.Cerrar"));
            switch(estado){
            
            case 1:
                
                int numeroSala=Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de la sala:"));
                if(numeroSala<1 || numeroSala>3){
                    JOptionPane.showMessageDialog(null, "La sala ingresada no existe");
                    break;
                }
                
                int numeroComputador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Computador:"));
                if(numeroComputador<1 || numeroComputador>30){
                    JOptionPane.showMessageDialog(null, "El computador ingresado no existe");
                    break;
                }
                
                switch(numeroSala){
                    
                    case 1: 
                        sala1.asignarEquipo(numeroComputador-1);
                        
                        break;
                    
                    case 2:
                        sala2.asignarEquipo(numeroComputador-1);
                        break;
                     
                    case 3:
                        sala3.asignarEquipo(numeroComputador-1);
                        break;
                }
                
                break;
                
            case 2:
                numeroSala=Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de la sala:"));
                if(numeroSala<1 || numeroSala>3){
                    JOptionPane.showMessageDialog(null, "La sala ingresada no existe");
                    break;
                }
                
                numeroComputador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del Computador:"));
                if(numeroComputador<1 || numeroComputador>30){
                    JOptionPane.showMessageDialog(null, "El computador ingresado se encuentra libre");
                    break;
                }
                
                switch(numeroSala){
                    
                    case 1: 
                        sala1.cancelarTurno(numeroComputador-1);
                        
                        break;
                    
                    case 2:
                        sala2.cancelarTurno(numeroComputador-1);
                        break;
                     
                    case 3:
                        sala3.cancelarTurno(numeroComputador-1);
                        break;
                }
                
                break;
                
            case 3:
                
                JOptionPane.showMessageDialog(null, "Sala 1\n" + sala1.equiposDisponibles() + "\n" +
                                                    "sala 2\n" + sala2.equiposDisponibles() + "\n" +
                                                    "sala 3\n" + sala3.equiposDisponibles());
                
                break;
                
            case 4:
                
                JOptionPane.showMessageDialog(null, "Sala 1\n" + sala1.turnosAsignados() + "\n" +
                                                    "sala 2\n" + sala2.turnosAsignados() + "\n" +
                                                    "sala 3\n" + sala3.turnosAsignados());
                
                break;
                
                
        }
          
    }while(estado!=5);
    
    }
}
