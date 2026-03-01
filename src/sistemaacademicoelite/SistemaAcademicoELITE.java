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

public static void listarEstudiantes() {
    System.out.println("\n── Lista de Estudiantes ──");
    if (estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes registrados.");
        return;
    }
    for (int i = 0; i < estudiantes.size(); i++) {
        Estudiante e = estudiantes.get(i);
        System.out.printf("[%d] Código: %-5s | %s %s | Edad: %d | Semestre: %d%n",
            i + 1, e.getCodigo(), e.getNombre(), e.getApellido(), e.getEdad(), e.getSemestre());
    }
}

public static void buscarEstudiante() {
    System.out.println("\n── Buscar Estudiante ──");
    String codigo = leerTexto("Código a buscar: ");
    Estudiante e = encontrarEstudiante(codigo);
    if (e == null) {
        System.out.println("⚠ Estudiante no encontrado.");
    } else {
        System.out.println("✔ Encontrado: " + e);
    }
}

public static void actualizarEstudiante() {
    System.out.println("\n── Actualizar Estudiante ──");
    String codigo = leerTexto("Código del estudiante a actualizar: ");
    Estudiante e = encontrarEstudiante(codigo);
    if (e == null) {
        System.out.println(" Estudiante no encontrado.");
        return;
    }
    System.out.println("Datos actuales: " + e);
    e.setNombre(leerTexto("Nuevo nombre (" + e.getNombre() + "): "));
    e.setApellido(leerTexto("Nuevo apellido (" + e.getApellido() + "): "));
    e.setEdad(leerInt("Nueva edad (" + e.getEdad() + "): "));
    e.setSemestre(leerInt("Nuevo semestre (" + e.getSemestre() + "): "));
    System.out.println(" Estudiante actualizado.");
}

public static void eliminarEstudiante() {
    System.out.println("\n── Eliminar Estudiante ──");
    String codigo = leerTexto("Código del estudiante a eliminar: ");
    Estudiante e = encontrarEstudiante(codigo);
    if (e == null) {
        System.out.println(" Estudiante no encontrado.");
        return;
    }
    estudiantes.remove(e);
    System.out.println(" Estudiante eliminado.");
}

 private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }

    private static int leerInt(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int val = Integer.parseInt(sc.nextLine().trim());
                return val;
            } catch (NumberFormatException ex) {
                System.out.println("Por favor ingrese un número entero.");
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                double val = Double.parseDouble(sc.nextLine().trim());
                return val;
            } catch (NumberFormatException ex) {
                System.out.println("Por favor ingrese un número decimal.");
            }
        }
    }

private static Estudiante encontrarEstudiante(String codigo) {
        for (Estudiante e : estudiantes)
            if (e.getCodigo().equalsIgnoreCase(codigo)) return e;
        return null;
    }

    private static boolean existeEstudiante(String codigo) {
        return encontrarEstudiante(codigo) != null;
    }

    private static Asignatura encontrarAsignatura(String codigo) {
        for (Asignatura a : asignaturas)
            if (a.getCodigo().equalsIgnoreCase(codigo)) return a;
        return null;
    }

    private static boolean existeAsignatura(String codigo) {
        return encontrarAsignatura(codigo) != null;
    }

    private static Nota encontrarNota(String codEst, String codAsig) {
        for (Nota n : notas)
            if (n.getEstudiante().getCodigo().equalsIgnoreCase(codEst) &&
                n.getAsignatura().getCodigo().equalsIgnoreCase(codAsig))
                return n;
        return null;
    }

}



}
