/*
  Clase GestionMatriculas: Menú para el usuario 

  Autor: Jesus Ramirez-1731388  Samuel Velasco-1731295 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - samuel.velasco@correounivalle.edu.co
  fecha: 27 febrero 2018
 */

package GestionDeMatriculas;

import javax.swing.JOptionPane;


public class GestionMatriculas {

    
    public static void main(String[] args) {
        
        int estado;
        
        Universidad miuniversidad=new Universidad();
        
        do{
            estado=Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opción: " + 
                                                                    "\n 1. Agregar curso" + 
                                                                    "\n 2. Matricular estudiante " +                                                                    
                                                                    "\n 3. Agregar nota estudiante" +    
                                                                    "\n 4. Listar estudiantes de un curso"  +
                                                                    "\n 5. Nota promedio de un curso" +
                                                                    "\n 6. Mejor estudiante de un curso" +
                                                                        "\n 7. Salir" ));
            switch(estado){
                
                case 1: 
                    String codigo=JOptionPane.showInputDialog("codigo del curso: ");
                    String nombre=JOptionPane.showInputDialog("nombre del curso: ");
                    String creditos=JOptionPane.showInputDialog("creditos del curso: ");
                    
                    Curso curso=new Curso();
                    curso.setCodigo(codigo);
                    curso.setNombre(nombre);
                    curso.setCreditos(creditos);
                    
                    miuniversidad.agregarCurso(curso);
                    
                    break;
                    
                case 2:
                    codigo=JOptionPane.showInputDialog("codigo del estudiante: ");
                    nombre=JOptionPane.showInputDialog("nombre del estudiante: ");
                    creditos=JOptionPane.showInputDialog("Plan de estudios del estudiante: ");
                    String nombreCurso=JOptionPane.showInputDialog("Digite nombre del curso a matricular: ");
                    Estudiante estudiante=new Estudiante();
                    
                    estudiante.setCodigo(codigo);
                    estudiante.setNombre(nombre);
                    estudiante.setPlanEstudio(creditos);
                    
                    miuniversidad.matricularEstudianteCurso(miuniversidad.getCurso(nombreCurso), estudiante);
                    
                    break;
                    
                case 3:
                    codigo=JOptionPane.showInputDialog("codigo del estudiante: ");
                    nombreCurso=JOptionPane.showInputDialog("Ingrese nombre del curso: ");
                    double nota=Double.parseDouble(JOptionPane.showInputDialog("nota del estudiante: "));
                    
                    miuniversidad.asignarNotaCurso(codigo,miuniversidad.getCurso(nombreCurso) , nota);
                    
                    JOptionPane.showMessageDialog(null, "La nota ha sido registrada con exito");
                    
                    break;
                    
                case 4: 
                    nombreCurso=JOptionPane.showInputDialog("ingrese nombre del curso: ");
                    JOptionPane.showMessageDialog(null, miuniversidad.listarEstudiantesCurso(miuniversidad.getCurso(nombreCurso)));
                    
                    break;
                    
                case 5:
                    nombreCurso=JOptionPane.showInputDialog("Ingrese nombre del curso: ");
                    JOptionPane.showMessageDialog(null, "El promedio de los estudiantes en el curso es de: " + miuniversidad.promedioEstudianteCurso(miuniversidad.getCurso(nombreCurso)));
                    
                    break;
                    
                case 6:
                    nombreCurso=JOptionPane.showInputDialog("Ingrese nombre del curso: ");
                    JOptionPane.showMessageDialog(null,miuniversidad.mejorEstudianteCurso(miuniversidad.getCurso(nombreCurso)));
                    
                    break;
            }
        
       
        
        
        }while(estado!=7);
    }
    
}