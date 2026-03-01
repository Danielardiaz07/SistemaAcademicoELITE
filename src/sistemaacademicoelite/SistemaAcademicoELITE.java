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
            System.out.println("     SISTEMA ACADÉMICO  - MENÚ     ");
            System.out.println("  1. Estudiantes  ");
            System.out.println("  2. Asignaturas  ");
            System.out.println("  3. Notas  ");  
            System.out.println("  0. Salir ");
            
            
        }
        private static void procesarOpcion(int opcion) {
    switch (opcion) {
        case 1: menuEstudiantes();  break;
        case 2: menuAsignaturas();  break;
        case 3: menuNotas();        break;
        case  0: break;
        default: System.out.println(" Opción no válida.");
    } 
    }
    
    private static void menuEstudiantes() {
    int op;
    do {
      
        System.out.println("    GESTIÓN DE ESTUDIANTES  ");
        
        System.out.println("  1. Registrar estudiante  ");
        System.out.println("  2. Listar estudiantes  ");
        System.out.println("  3. Buscar estudiante ");
        System.out.println("  4. Actualizar estudiante ");
        System.out.println("  5. Eliminar estudiante  ");
        
        System.out.println("  0. Volver al menú principal ");
       
        op = leerInt("Seleccione una opción: ");
        switch (op) {
            case 1: registrarEstudiante();  break;
            case 2: listarEstudiantes();    break;
            case 3: buscarEstudiante();     break;
            case 4: actualizarEstudiante(); break;
            case 5: eliminarEstudiante();   break;
            case 0: break;
            default: System.out.println(" Opción no válida.");
        }
    } while (op != 0);
}


private static void menuAsignaturas() {
    int op;
    do {
        
        System.out.println("    GESTIÓN DE ASIGNATURAS     ");      
        System.out.println(" 1. Registrar asignatura      ");
        System.out.println(" 2. Listar asignaturas   ");
        System.out.println(" 3. Buscar asignatura ");
        System.out.println(" 4. Actualizar asignatura  ");
        System.out.println(" 5. Eliminar asignatura   ");
        System.out.println(" 0. Volver al menú principal  ");
      
        op = leerInt("Seleccione una opción: ");
        switch (op) {
            case 1: registrarAsignatura();  break;
            case 2: listarAsignaturas();    break;
            case 3: buscarAsignatura();     break;
            case 4: actualizarAsignatura(); break;
            case 5: eliminarAsignatura();   break;
            case 0: break;
            default: System.out.println(" Opción no válida.");
        }
    } while (op != 0);
}


private static void menuNotas() {
    int op;
    do {
        System.out.println("          GESTIÓN DE NOTAS            ");
        System.out.println("  1. Registrar nota  ");
        System.out.println("  2. Listar notas   ");
        System.out.println("  3. Buscar nota     ");
        System.out.println("  4. Actualizar nota ");
        System.out.println("  5. Eliminar nota");
        System.out.println("  0. Volver al menú principal ");
       
        op = leerInt("Seleccione una opción: ");
        switch (op) {
            case 1: registrarNota();  break;
            case 2: listarNotas();    break;
            case 3: buscarNota();     break;
            case 4: actualizarNota(); break;
            case 5: eliminarNota();   break;
            case 0: break;
            default: System.out.println(" Opción no válida.");
        }
    } while (op != 0);
}
    
public static void registrarEstudiante() {
    System.out.println("\n── Registrar Estudiante ──");
    String codigo = leerTexto("Código: ");
    if (existeEstudiante(codigo)) {
        System.out.println(" Ya existe un estudiante con ese código.");
        return;
    }
    String nombre   = leerTexto("Nombre: ");
    String apellido = leerTexto("Apellido: ");
    int    edad     = leerInt("Edad: ");
    int    semestre = leerInt("Semestre: ");
    estudiantes.add(new Estudiante(codigo, nombre, apellido, edad, semestre));
    System.out.println(" Estudiante registrado correctamente.");
}











}
