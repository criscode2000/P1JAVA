import java.util.Scanner;
public class Nose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);*/

       /*  System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);*/
        System.out.print("Ingrese tu nota: ");
        double nota = sc.nextDouble();
        if  (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bueno");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
