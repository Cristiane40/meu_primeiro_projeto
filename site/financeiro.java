import java.util.Scanner;

public class financeiro {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "o número informado foi: ");

        double numero = scanner.nextDouble();
        System.out.println("o número informado foi "+ numero);

   }

}      

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe duas notas para o cálculo: ");
        System.out.println("Informe a 1º nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a 2º nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média calculada foi: %.2f%n", media);

        scanner.close();

    }



