/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeMatriculas;

/**
 *
 * @author Jesús Ramírez
 */
public class Estudiante {
    
    String codigo;
    String nombre;
    String planEstudio;
    double calificacion;
    
    public Estudiante(){
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPlanEstudio(String planEstudio){
        this.planEstudio=planEstudio;
    }
    
    public String getPlanEstudio(){
        return planEstudio;
    }
    
    public void setNotasEstudiante(double nota){
        calificacion=nota;
    }
    
    public double getNotasEstudiante(){
        return calificacion;
    }
}
