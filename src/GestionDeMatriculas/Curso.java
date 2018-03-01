/*
  Clase Curso: le asigna valores al codigo, nombre y numero de  creditos de
  un estudiante y del mismo modo, los retorna. Matricula a un estudiante en el curso
  le asigna la nota a un estudiante, lista los estudiantes matriculados al curso
  retorna el promedio de notas de un curso, imprime al mejor estudiante del curso.

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package GestionDeMatriculas;

import java.util.ArrayList;

public class Curso {
    
    String codigo;
    String nombre;
    String numeroCreditos;
    Estudiante miEstudiante = new Estudiante();//objeto tipo estudiante
    ArrayList estudiantesCurso = new ArrayList();//ArrayList que almacena objetos estudiante
    
    //constructor
    public Curso(){
    }
    
    //retorna el codigo del curso
    public String getCodigo(){
        return codigo;
    }
    
    //asigna un valor al codigo del curso
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    //retorna el nombre del curso
    public String getNombre(){
        return nombre;
    }
    
    //asigna un valor al nombre del curso
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    //retorna el numero de creditos de un curso
    public String getCreditos(){
        return numeroCreditos;
    }
    
    //asigna un valor a los creditos del curso
    public void setCreditos(String creditos){
        this.numeroCreditos=creditos;
    }
    
    //le ingresa un objeto estudiante, agrega a un estudiante a un curso dado
    public void matricularEstudiante(Estudiante estudiante){
        estudiantesCurso.add(estudiante);
    }
    
    //le ingresa un String (codigo del estudiante) y una nota, le asigna la nota a un estudiante dado
    public void AsignarNota(String codigoEstudiante, double nota){
        for(int i=0;i<estudiantesCurso.size();i++){
            Estudiante estudiante= (Estudiante) estudiantesCurso.get(i);
            if(estudiante.getCodigo().equals(codigoEstudiante)){
                
                estudiante.setNotasEstudiante(nota);  
                estudiantesCurso.set(i, estudiante);
            }
        }
    }
    
    //retorna un String que lista los estudiantes matriculados a un curso
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
    
    //retorna el promedio de notas de los estudiantes de un curso dado
    public double promedioEstudiantes(){
        double respuesta=0;
        for(int i=0;i<estudiantesCurso.size();i++){
            Estudiante estudiante=(Estudiante) estudiantesCurso.get(i);
            respuesta+=estudiante.getNotasEstudiante() / estudiantesCurso.size();
        }
        return respuesta;
    }
    
    //retorna un String que imprime al estudiante con mejor nota
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
