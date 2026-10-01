import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioBruto;
        double porcentajeImpuestos;
        double deducciones;
        double impuesto;
        double salarioNeto;

        System.out.print("Ingresa el salario bruto mensual: ");
        salarioBruto = entrada.nextDouble();

        System.out.print("Ingresa el porcentaje de impuestos: ");
        porcentajeImpuestos = entrada.nextDouble();

        System.out.print("Ingresa las deducciones adicionales: ");
        deducciones = entrada.nextDouble();

        impuesto = salarioBruto * (porcentajeImpuestos / 100);

        salarioNeto = salarioBruto - impuesto - deducciones;

        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}