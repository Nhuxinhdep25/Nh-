package bai3;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        boolean check1 = scanner.hasNextInt();
        boolean check2 = scanner.hasNextDouble();
        System.out.println("co token khong ? "+check1);
    }
    
}
