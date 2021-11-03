import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

@Getter
@Setter
public class Curso {
    private String nombre;
    private int cantHoras;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombre, int cantHoras, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.cantHoras = cantHoras;
        this.alumnos = alumnos;
    }

    public void setAlumnos(Alumno a) {
        this.alumnos.add(a);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", cantHoras=" + cantHoras +
                ", alumnos=" + alumnos +
                '}';
    }

    public float calcularPromedioCurso() {
        int sum = 0;
        for (Alumno alumno: alumnos) {
            sum += alumno.calcularPromedio();
        }
        return (float) sum / alumnos.size();
    }

    public ArrayList<Alumno> alumnosAprobados() {
        ArrayList aprobados = new ArrayList<Alumno>();
        for (Alumno alumno: alumnos) {
            if (alumno.calcularPromedio() >= 6) {
                aprobados.add(alumno);
            }
        }
        return aprobados;
    }

    public void ordenarAlumnos() {

        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.size(); j++) {
                Collections.sort(alumnos, new Comparator() {

                    public int compare(Object o1, Object o2) {
                        Alumno p1 = (Alumno) o1;
                        Alumno p2 = (Alumno) o2;
                        int res =  p1.getApellido().compareToIgnoreCase(p2.getApellido());
                        if (res != 0)
                            return res;
                        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
                    }
                });
            }

        }


        /*
        ordena pero solo por apellido
        int n = alumnos.length;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int r = alumnos[i].compareTo(alumnos[j]);
                if( r > 0)
                {
                    Alumno aux = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = aux;
                }
            }
        }
        */


    }

}
