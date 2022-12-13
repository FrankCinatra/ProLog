package ejercicioBiPredicate;

/**
 *
 * @author Grijalva
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    public Empleado(String nombre,int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
