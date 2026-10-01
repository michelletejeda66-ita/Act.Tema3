import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Ingresa la base del rectangulo: ");
        base = entrada.nextDouble();

        System.out.print("Ingresa la altura del rectangulo: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("El area del rectangulo es: " + area);
    }
}
