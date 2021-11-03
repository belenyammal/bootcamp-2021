import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class Curso {
    private String nombre;
    private int cantHoras;
    private ArrayList<Alumno> alumnos;


    public void setAlumnos(Alumno a) {
        this.alumnos.add(a);
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    public float calcularPromedioCurso() {
        int sum = 0;
        for (Alumno alumno: alumnos) {
            sum += alumno.calcularPromedio();
        }
        return (float) sum / alumnos.size();
    }

    public ArrayList<Alumno> alumnosAprobados() {

        return (ArrayList<Alumno>) alumnos.stream()
                .filter( a -> a.calcularPromedio() >=6)
                .collect(Collectors.toList());

    }

    //ordena primero por apellido y si encuentra dos iguales lo ordena por nombre tambien
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


    }

}
