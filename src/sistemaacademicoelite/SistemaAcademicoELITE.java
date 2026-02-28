/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademicoelite;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DANIELA ROJAS
 */
public class SistemaAcademicoELITE {

    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private static ArrayList<Nota> notas = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    
    private static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do{
            mostrarMenu();
            opcion= leerInt("Selecionar una opcion: ");
            procesarOpcion(opcion);
        }while (opcion !=0);
        System.out.println("¡BAYYY!");
        sc.close();
        
        public static void mostrarMenu(){
            System.out.println("SISTEMA ACADEMICO MENU");
            System.out.println(" --ESTUDIANTES--");
            System.out.println("  1. Registrar estudiante ");
            System.out.println("  2. Listar estudiantes ");
            System.out.println("  3. Buscar estudiante ");
            System.out.println("  4. Actualizar estudiante ");
            System.out.println("  5. Eliminar estudiante ");
            System.out.println(" --ASIGNATURAS--");
            System.out.println("  6. Registrar asignatura ");
            System.out.println("  7. Listar asignaturas ");
            System.out.println("  8. Buscar asignatura ");
            System.out.println("  9. Actualizar asignatura ");
            System.out.println(" 10. Eliminar asignatura ");
            System.out.println(" --NOTAS--");
            System.out.println("║ 11. Registrar nota");
            System.out.println("║ 12. Listar notas ");
            System.out.println("║ 13. Buscar nota ");
            System.out.println("║ 14. Actualizar nota ");
            System.out.println("║ 15. Eliminar nota  ");
            System.out.println("0. Salir");
            
        }
        private static void procesarOpcion(int opcion) {
    switch (opcion) {
        case  1: registrarEstudiante();  break;
        case  2: listarEstudiantes();    break;
        case  3: buscarEstudiante();     break;
        case  4: actualizarEstudiante(); break;
        case  5: eliminarEstudiante();   break;
        case  6: registrarAsignatura();  break;
        case  7: listarAsignaturas();    break;
        case  8: buscarAsignatura();     break;
        case  9: actualizarAsignatura(); break;
        case 10: eliminarAsignatura();   break;
        case 11: registrarNota();        break;
        case 12: listarNotas();          break;
        case 13: buscarNota();           break;
        case 14: actualizarNota();       break;
        case 15: eliminarNota();         break;
        case  0: break;
        default: System.out.println("⚠ Opción no válida.");
    }
       
        
        
        
    }
    
    
    
}
