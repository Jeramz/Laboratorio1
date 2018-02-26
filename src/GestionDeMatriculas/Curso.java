/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeMatriculas;

import java.util.ArrayList;
/**
 *
 * @author Jesús Ramírez
 */
public class Curso {
    
    String codigo;
    String nombre;
    String numeroCreditos;
    Estudiante miEstudiante = new Estudiante();//objeto tipo estudiante
    ArrayList estudiantesCurso = new ArrayList();
    
    
    public Curso(){
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getCreditos(){
        return numeroCreditos;
    }
    
    public void setCreditos(String creditos){
        this.numeroCreditos=creditos;
    }
    
    public void matricularEstudiante(Estudiante estudiante){
        estudiantesCurso.add(estudiante);
    }
    
    public void AsignarNota(String codigoEstudiante, double nota){
        for(int i=0;i<estudiantesCurso.size();i++){
            Estudiante estudiante= (Estudiante) estudiantesCurso.get(i);
            if(estudiante.getCodigo().equals(codigoEstudiante)){
                
                estudiante.setNotasEstudiante(nota);  
                estudiantesCurso.set(i, estudiante);
            }
        }
    }
    
    public String listarEstudiantes(){
        String respuesta="";
        for(int i=0; i<estudiantesCurso.size();i++){
            Estudiante estudiante=(Estudiante) estudiantesCurso.get(i);
            respuesta+=estudiante.getCodigo() + " " + 
                       estudiante.getNombre() + " " +
                       estudiante.getPlanEstudio() + " " + 
                       estudiante.getNotasEstudiante() + "\n";
        }
        return respuesta;
    }
    
    public double promedioEstudiantes(){
        double respuesta=0;
        for(int i=0;i<estudiantesCurso.size();i++){
            Estudiante estudiante=(Estudiante) estudiantesCurso.get(i);
            respuesta+=estudiante.getNotasEstudiante() / estudiantesCurso.size();
        }
        return respuesta;
    }
    
    public String mejorEstudiante(){
        String respuesta="";
        double mejorNota=0;
        for(int i=0;i<estudiantesCurso.size();i++){
            Estudiante estudiante=(Estudiante) estudiantesCurso.get(i);
            if(estudiante.getNotasEstudiante() > mejorNota){
                mejorNota=estudiante.getNotasEstudiante();
                respuesta="El mejor estudiante fue \n" + estudiante.getCodigo() + " " + estudiante.getNombre() + " con una nota de: " + mejorNota;
            }
        }
        return respuesta;
    }
}
