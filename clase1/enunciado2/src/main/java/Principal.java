import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;
        while (op != 2) {
            System.out.println("Menú de Opciones");
            System.out.println("1-Ingresar un numero para saber si es capicua");
            System.out.println("2-salir");

            System.out.print("Ingrese su opción: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("Ingrese un numero entero");
                int nro = sc.nextInt();
                int falta, inverso = 0, cifra;
                falta = nro;
                while (falta!=0) {
                    cifra = falta % 10;
                    inverso = inverso * 10 + cifra;
                    falta /=  10;
                }

                if(nro == inverso){
                    System.out.println("El numero ingresado Es capicua");
                }else{
                    System.out.println("EL numero ingresado No es capicua");
                }
            }
        }



    }
}
