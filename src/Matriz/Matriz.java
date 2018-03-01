/*
  Clase Matriz: Menú para el usuario 

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package Matriz;

import javax.swing.JOptionPane;


public class Matriz {

    
    public static void main(String[] args) {
         
        int [][] matriz1;
        matriz1=new int[3][3];
        int [][] matriz2;
        matriz2=new int[3][3];
        
        CalculadoraDeMatrices calculadora=new CalculadoraDeMatrices();
        int estado;
        
        do{
            estado=Integer.parseInt(JOptionPane.showInputDialog("Menú\n1.Generar Matrices"+
                                                                    "\n2.Imprimir Matrices"+
                                                                    "\n3.Multiplicar"+
                                                                    "\n4.Sumar"+
                                                                    "\n5.Calcular transpuesta"+
                                                                    "\n6.Cerar"));
            
            switch(estado){
                case  1:
                    calculadora.generarMatriz(matriz1);
                    calculadora.generarMatriz(matriz2);
                    JOptionPane.showMessageDialog(null, "Las matrices han sido creadas con exito");
                    
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "Matriz 1:\n" + calculadora.imprimirMatriz(matriz1) +
                                                        "\nMatriz 2:\n" + calculadora.imprimirMatriz(matriz2));
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es:\n" + calculadora.multiplicarMatrices(matriz1, matriz2));
                    
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es: \n" + calculadora.sumarMatrices(matriz1, matriz2));
                    
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null,"La transpuesta de la matriz 1 es:\n" + calculadora.transpuesta(matriz1));
            }
        
        }while(estado!=6);
       
    }
    
}
