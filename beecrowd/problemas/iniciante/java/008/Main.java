import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int salhora = scanner.nextInt();
        double horas = scanner.nextDouble();

        double sal = salhora * horas;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n", sal);
    }
 
}