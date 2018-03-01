/*
  Clase Estudiante: le asigna valores al codigo, nombre, plan de estudio y calificación de 
  un estudiante y del mismo modo, los retorna.

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package GestionDeMatriculas;


public class Estudiante {
    
    String codigo;
    String nombre;
    String planEstudio;
    double calificacion;
    
    //constructor
    public Estudiante(){
    }
    
    //le asigna un valor a codigo 
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    //retorna el codigo del estudiante
    public String getCodigo(){
        return codigo;
    }
    
    //le asigna un valor a nombre 
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    //retorna el nombre del estudiante
    public String getNombre(){
        return nombre;
    }
    
    //le asigna un valor a planEstudio
    public void setPlanEstudio(String planEstudio){
        this.planEstudio=planEstudio;
    }
    
    //retorna el plan de estudio de un estudiante
    public String getPlanEstudio(){
        return planEstudio;
    }
    
    //le asigna un valor a notasEstudiantes
    public void setNotasEstudiante(double nota){
        calificacion=nota;
    }
    
    //retorna las notas de un estudiante
    public double getNotasEstudiante(){
        return calificacion;
    }
}
