/*
  Clase CalculadoraDeMatrices: Le asigna un valor aleatorio a cada posición de una matriz dada, 
  imprime una matriz ingresada, realiza la multiplicación entre dos matrices ingresadas,
  realiza la suma entre dos matrices ingresadas, realiza la transpuesta de una matriz dada.

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package Matriz;

import java.lang.Math;

public class CalculadoraDeMatrices {
    
    
    //Constructor
    public CalculadoraDeMatrices(){
        
        }
    
    public void generarMatriz(int[][] matriz1){
        //le asigna valores aleatorios a un matriz de 3x3 ingresada
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
            matriz1[i][j]=(int)(Math.random()*10)+1;
        }
        }
    }
    
    public String imprimirMatriz(int [][] matriz1){
        //imprime una matriz ingresada de 3x3, retorna un String
        String resultado="";
  
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                resultado+=Integer.toString(matriz1[i][j])+ " ";
            }
            resultado+="\n";
        }
        return resultado;
    }
    
    public String multiplicarMatrices(int [][] matriz1, int[][] matriz2){
        //Multiplica dos matrices 3x3 ingresadas, la operación se guarda en la matriz resultado, retorna un String
        int[][] resultado;
        resultado=new int [3][3];
   
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                for (int k = 0; k < matriz1.length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return this.imprimirMatriz(resultado);
    }
    
    public String sumarMatrices(int[][] matriz1, int[][] matriz2){
        //Suma dos matrices 3x3 ingresadas, la operación se guarda en la matriz resultado, retorna un String
        int[][] resultado;
        resultado=new int [3][3];
        
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
                resultado[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        return this.imprimirMatriz(resultado);
    }
    
    public String transpuesta(int[][] matriz1){
        //la entra una matriz y calcula su transpuesta, retorna un String de la matriz resultante
        int[][] resultado;
        resultado=new int [3][3];
        
        for(int i=0;i<matriz1.length;i++){ 
            for(int j=0;j<matriz1.length;j++){
                resultado[j][i]=matriz1[i][j];
            }
        }
        
        return this.imprimirMatriz(resultado);
    }
}
