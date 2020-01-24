import java.util.Scanner;
public class Beca {
    Scanner teclado = new Scanner(System.in);

    int hermanos;
    int edad;
    int salario;
    String carreras;

    public Beca() {
        hermanos = 0;
        edad = 0;
        salario = 0;
        carreras = "";
    }

    //Metodos Setter y Getter
    public void setCarreras(String carreras){
        this.carreras= carreras;
    }
    public String getCarreras(){
        return this.carreras;
    }
}