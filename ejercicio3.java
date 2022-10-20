import java.util.Scanner;

public class ejercicio3 {
    public static void main(String args[]){
        int numero = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = input.nextInt();
        int doble = mostrarDoble(numero);

        System.out.println("El doble del numero es: " + doble);
    }

    public static int mostrarDoble(int numero){
        return numero * 2;
    }
}
