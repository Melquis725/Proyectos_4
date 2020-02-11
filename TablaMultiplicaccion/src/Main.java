import java.util.Scanner;

public class Main {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);

    // Creacion del objeto "operador"
    TDM operador = new TDM();

    System.out.println("Qué tabla desea calcular? ");
    operador.num = teclado.nextInt();
    System.out.println("Tabla Del "+ operador.num +" : ");

    for(int i= 1; i <= 12; i+= 1 ) {
        System.out.println(operador.num +" X "+ i +" = " +i*operador.num);
    }
}
    }