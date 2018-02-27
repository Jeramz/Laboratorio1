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
public class ParkingPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parqueadero miParqueadero=new Parqueadero();
        int estado;
        
        do{
            estado=Integer.parseInt(JOptionPane.showInputDialog("Menú\n1.Ingresar auto"+
                                                                    "\n2.Consultar auto"+
                                                                    "\n3.Visualizar parqueadero"+
                                                                    "\n4.Retirar auto"+
                                                                    "\n5.Arqueo de caja"+
                                                                    "\n6.Cerar"));
            
            switch(estado){
                case  1:
                    String tipoAuto=JOptionPane.showInputDialog("Que tipo de auto va a parquear: \n 'carga'  'pasajeros'");
                    miParqueadero.ingresarAuto(tipoAuto);
                    break;
                    
                case 2:
                    String placa=JOptionPane.showInputDialog("Ingrese el numero de la placa del auto:");
                    JOptionPane.showMessageDialog(null, miParqueadero.consultarAuto(placa));
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,miParqueadero.imprimirParqueadero());
                    break;
                    
                case 4:
                    placa=JOptionPane.showInputDialog("Ingrese el numero de la placa del auto:");
                    int horasParqueo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas que el carro estuvo parqueado:"));
                    JOptionPane.showMessageDialog(null, miParqueadero.retirarAuto(placa, horasParqueo));
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, miParqueadero.arqueoCaja());
                    break;
            }
            
            
        }while(estado!=6);
    }  
}
