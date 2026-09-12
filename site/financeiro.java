import java.util.Scanner;
public class financeiro {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "o número informado foi: ");

        double numero = scanner.nextDouble();
        System.out.println("o número informado foi "+ numero);
        
        scanner.close();   
}
}
