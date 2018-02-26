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
public class Universidad {
    Curso micurso=new Curso();//objeto tipo curso
    ArrayList cursos=new ArrayList();

public Universidad(){
}

public void agregarCurso(Curso curso){
    cursos.add(curso);
}

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

public String listarEstudiantesCurso(Curso curso){
    return curso.listarEstudiantes();
}

public void matricularEstudianteCurso(Curso curso, Estudiante estudiante){
    curso.matricularEstudiante(estudiante);
}

public void asignarNotaCurso(String codigo, Curso curso, double nota){
    
            curso.AsignarNota(codigo, nota);
        
}

public double promedioEstudianteCurso(Curso curso){
    return curso.promedioEstudiantes();
}

public String mejorEstudianteCurso(Curso curso){
    return curso.mejorEstudiante();
}

}