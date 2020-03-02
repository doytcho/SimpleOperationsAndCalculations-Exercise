import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
double x1 = Double.parseDouble(scan.nextLine());
double y1 = Double.parseDouble(scan.nextLine());
double x2 = Double.parseDouble(scan.nextLine());
double y2 = Double.parseDouble(scan.nextLine());
double lenght = Math.abs(x2-x1);
double widght = Math.abs(y2-y1);
double area = lenght*widght;
double perimeter = (lenght+widght)*2;
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",perimeter);
    }
}
