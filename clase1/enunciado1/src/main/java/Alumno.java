import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Alumno implements Comparable{
    private String nombre;
    private String apellido;
    private int edad;
    private int[] notas;

    public Alumno(String nombre, String apellido, int edad, int[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = notas;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    public float calcularPromedio(){
        int sum = 0;
        for (int nota: notas) {
            sum += nota;
        }
        return (float) sum / notas.length;
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;
        return getApellido().compareTo(a.getApellido());
    }
}
