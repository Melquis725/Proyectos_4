import java.util.Scanner;
public class Main {
    public static void main(String [] arg){
        Scanner teclado= new Scanner(System.in);
    // Creacion del objeto "p1"
        Operadores p1= new Operadores();

    // Se muestran las operaciones que se pueden realizar
        System.out.println("1- Suma  /  2- Resta  /  3- Multiplicacción  /  4- División");
        System.out.println("Seleccione la operación que desea realizar :");
        p1.Opcion= teclado.nextInt();

     // Puse el switch dentro de condicion if, para que ejecute error si no elije una de las opciones
        if(p1.Opcion <= 4){
            System.out.println("Ingrese el primer numero :");
            p1.num1= teclado.nextInt();
            System.out.println("Ingrese el segundo numero :");
            p1.num2= teclado.nextInt();

        switch(p1.Opcion){
            case 1:
            p1.n= p1.num1 + p1.num2;
            System.out.println("El resultado  de la Suma es :");
            System.out.println(p1.n);
            break;
            case 2:
            p1.n= p1.num1 - p1.num2;
            System.out.println("El resultado de la Resta es :");
            System.out.println(p1.n);
            break;
            case 3:
            p1.n= p1.num1 * p1.num2;
            System.out.println("El resultado de la Multiplicación es :");
            System.out.println(p1.n);
            break;
            case 4:
            p1.n= p1.num1 / p1.num2;
            System.out.println("El resultado de la Divición es :");
            System.out.println(p1.n);
            break;}
        }else{
            System.out.println("Error, por favor corrija su elección. ");
        }
    }
}

