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
        
        JOptionPane.showMessageDialog(null, miParqueadero.imprimirParqueadero());
        miParqueadero.ingresarAuto("carga");
        JOptionPane.showMessageDialog(null, miParqueadero.imprimirParqueadero());
        miParqueadero.ingresarAuto("carga");
        JOptionPane.showMessageDialog(null, miParqueadero.imprimirParqueadero());
        miParqueadero.ingresarAuto("carga");
        JOptionPane.showMessageDialog(null, miParqueadero.imprimirParqueadero());
        miParqueadero.ingresarAuto("carga");
        JOptionPane.showMessageDialog(null, miParqueadero.tarifa(10));
    }
    
}
