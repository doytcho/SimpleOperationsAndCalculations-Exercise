import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        System.out.printf("%.2f",usd*1.79549);
    }
}
