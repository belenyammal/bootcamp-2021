import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = -1;
        while (op != 2) {
            System.out.println("Menú de Opciones");
            System.out.println("1-Ingresar un numero para realizar la conversion de decimal a binario");
            System.out.println("2-salir");
            System.out.print("Ingrese su opción: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("ingrese el numero decimal que quiere convertir a binario: ");
                int decimal = sc.nextInt();
                int exp = 0, resto;
                int binario = 0;

                while(decimal>0){
                    resto = decimal % 2;
                    binario +=  resto * Math.pow(10, exp);
                    exp++;
                    decimal /= 2;
                }

                System.out.println("el decimal convertido a binario es: " + binario);
            }
        }


    }
}
