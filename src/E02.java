import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double radians = Double.parseDouble(scan.nextLine());
        double graduses = radians*180/Math.PI;
        System.out.printf("%.0f",graduses);
    }
}
