/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

import java.lang.Math;
/**
 *
 * @author Jesús Ramírez
 */
public class CalculadoraDeMatrices {
    
    
    public CalculadoraDeMatrices(){
        
        }
    
    public void generarMatriz(int[][] matriz1){
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
            matriz1[i][j]=(int)(Math.random()*10)+1;
        }
        }
    }
    
    public String imprimirMatriz(int [][] matriz1){
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
