import org.json.JSONObject;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("belen", "yammal", 20, new int[]{8, 9, 10});
        Alumno a2 = new Alumno("agustin", "yammal", 21, new int[]{8, 5, 6});
        Alumno a3 = new Alumno("sofia", "brussa", 19, new int[]{5, 5, 6});
        Alumno a4 = new Alumno("pedro", "gomez", 23, new int[]{4, 2, 3});

        ArrayList<Alumno> alumnos = new ArrayList<>();

        Curso curso1 = new Curso("3k1", 6, alumnos);
        curso1.setAlumnos(a1);
        curso1.setAlumnos(a2);
        curso1.setAlumnos(a3);
        curso1.setAlumnos(a4);

        //1-calcular promedio
        System.out.println("1-El promedio del curso "+ curso1.getNombre()+ " es de: " + curso1.calcularPromedioCurso());

        //2-mostrar datos del curso
        System.out.println("2-Promedio del curso");
        System.out.println(curso1.toString());

        //3-listado de alumnos con nota promedio mayor a 6
        System.out.println("3-Alumnos con promedio mayor a 6");
        System.out.println(curso1.alumnosAprobados());

        //ordenar alumnos por apellido y nombre
        //ordena primero por apellido y si encuentra dos iguales lo ordena por nombre tambien
        System.out.println("4-Alumnos ordenados por apellido");
        curso1.ordenarAlumnos();
        System.out.println(curso1.toString());

        //salida mostrada en formato json
        System.out.println("5-muestra la salida en formato JSON");
        JSONObject jason = new JSONObject();
        jason.put("promedio del curso", curso1.calcularPromedioCurso());
        jason.put("promedio del curso", curso1.toString());
        jason.put("Alumnos con promedio mayor a 6", curso1.alumnosAprobados());
        curso1.ordenarAlumnos();
        jason.put("Listado ordenado", curso1.toString());
        System.out.println(jason.toString(0));
    }
}
