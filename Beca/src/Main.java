import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

     // Creacion de objeto "C"
        Beca C= new Beca();
        C.setCarreras("-Ing. De Sistemas \n"+"-Ing. Civil \n"+"-Ing. Mecánica \n"+"-Ing. Electrónica");

     // Creacion de objeto "p1"
        Beca p1 = new Beca();
        System.out.println("Cantidad de hermanos del estudiante :");
        p1.hermanos = teclado.nextInt();
        System.out.println("Edad del estudiante :");
        p1.edad = teclado.nextInt();
        System.out.println("Salario del salario :");
        p1.salario = teclado.nextInt();

    // Condiciones if anidadas
        if (p1.hermanos >= 3) {
            if (p1.edad >= 15) {
                if (p1.edad <= 30) {
                    if (p1.salario == 0) {
                        System.out.println("El estudiante Aplica para la Beca\n Opciones de Carreras :");
                        System.out.println(C.getCarreras());
                    } else {
                        System.out.println("El estudiante No aplica para la Beca");
                    }
                } else {
                    System.out.println("El estudiante No aplica para la Beca");
                }
            } else {
                System.out.println("El estudiante No aplica para la Beca");
            }
        } else {
            System.out.println("El estudiante No aplica para la Beca");
        }
    }
}