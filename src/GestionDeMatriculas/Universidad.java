/*
  Clase Universidad: Agrega un curso dado, retorna un curso dado, lista los estudiantes matriculados a 
  un curso dado, matricula a un estudiante en un curso dado, asigna la nota a un estudiante en un curso 
  dado retorna el promedio de los estudiantes de un curso, retorna al mejor estudiante de un curso dado

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */
package GestionDeMatriculas;
import java.util.ArrayList;

public class Universidad {
    Curso micurso=new Curso();//objeto tipo curso
    ArrayList cursos=new ArrayList(); //ArrayList que almacena objetos del tipo curso

    //Constructor
    public Universidad(){
    }
    
    //Agraga un curso al Arraylist
    public void agregarCurso(Curso curso){
     cursos.add(curso);
    }
    
    
    //le entra un String (nombre del curso) y retorna el objeto curso si se encuentra en el ArrayList
    public Curso getCurso(String nombre){
        Curso respuesta=new Curso();
        for (int i=0; i< cursos.size(); i++){
              Curso curso= (Curso) cursos.get(i);
              if(curso.getNombre().equals(nombre)){
             cursos.set(i, curso); 
             respuesta=(Curso)cursos.get(i);
            }
        }
     return respuesta;
    }
    
    //le ingresa un objeto curso, retorna un String con la lista de estudiantes que hacen parte de este
    public String listarEstudiantesCurso(Curso curso){
        return curso.listarEstudiantes();
    }
    
    //le entra un objeto curso y un objeto estudiante, matricula al estudiante en el curso dado
    public void matricularEstudianteCurso(Curso curso, Estudiante estudiante){
        curso.matricularEstudiante(estudiante);
    }
    
    //le entra un String (codigo), un objeto curso y una nota, le asigna una nota a un estudiante en un determinado curso
    public void asignarNotaCurso(String codigo, Curso curso, double nota){
        curso.AsignarNota(codigo, nota);
    }
    
    //le entra un objeto curso, retorna el promedio de notas de el curso dado
    public double promedioEstudianteCurso(Curso curso){
        return curso.promedioEstudiantes();
    }
    
    //le entra un curso, retorna un String (estudiante con la mejor nota del curso)
    public String mejorEstudianteCurso(Curso curso){
        return curso.mejorEstudiante();
    }

}