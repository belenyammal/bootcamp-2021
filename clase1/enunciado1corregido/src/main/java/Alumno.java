import lombok.*;

import java.util.Arrays;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private int[] notas;

    public float calcularPromedio(){
        int sum = 0;
        for (int nota: notas) {
            sum += nota;
        }
        return (float) sum / notas.length;
    }
}