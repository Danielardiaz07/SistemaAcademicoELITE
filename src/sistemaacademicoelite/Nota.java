/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademicoelite;

/**
 *
 * @author vanes
 */
public class Nota {
    private Estudiante estudiante;
    private Asignatura asignatura;
    private double valor;
    private String periodo;
    
    public Nota() {
    }

    public Nota(Estudiante estudiante, Asignatura asignatura, double valor, String periodo) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.valor = valor;
        this.periodo = periodo;
    }
    
    public Estudiante getEstudiante() { 
        return estudiante; }
    public Asignatura getAsignatura() { 
        return asignatura; }
    public double getValor() { 
        return valor; }
    public String getPeriodo() { 
        return periodo; }
    
    public void setEstudiante(Estudiante estudiante) { 
        this.estudiante = estudiante; }
    public void setAsignatura(Asignatura asignatura) { 
        this.asignatura = asignatura; }
    public void setValor(double valor) { 
        this.valor = valor; }
    public void setPeriodo(String periodo) { 
        this.periodo = periodo; }
    
    @Override
    public String toString() {
        return "Nota{" +
               "estudiante=" + (estudiante != null ? estudiante.getCodigo() : "null") +
               ", asignatura=" + (asignatura != null ? asignatura.getCodigo() : "null") +
               ", valor=" + valor +
               ", periodo='" + periodo + '\'' + '}';
    }
}
