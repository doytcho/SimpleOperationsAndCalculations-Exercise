import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double wight = Double.parseDouble(scan.nextLine());
        double coverArea = (lenght+0.6)*(wight+0.6);
        double checkArea = lenght*lenght/4;
        double coverPrice = coverArea*7*count;
        double checkPrice = checkArea*9*count;
        System.out.printf("%.2f USD%n",coverPrice+checkPrice );
        System.out.printf("%.2f BGN",(coverPrice+checkPrice)*1.85);

    }
}
