import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

    // Creacion de objeto "P1"
        PDN P1 = new PDN();
         System.out.println("Ingrese la primera nota :");
          P1.nota1= teclado.nextInt();
          System.out.println("Ingrese la segunda nota :");
          P1.nota2= teclado.nextInt();
          System.out.println("Ingrese la tercera nota :");
          P1.nota3= teclado.nextInt();

          double suma= (P1.nota1 + P1.nota2 + P1.nota3) / 3;
     // Le puse Math.round  por si el resultado da en decimal y redondee apartir del " .5 "
          double promedio = Math.round(suma);

          if(promedio >= 75){
           System.out.println("El estudiente ha Aprovado");
          }else{
              System.out.println("El estudiante ha Reprovado");
          }
    }
}
