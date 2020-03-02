import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int chif = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());
        int gofrets = Integer.parseInt(scan.nextLine());
        //⦁	Торта - 45 лв.
        //⦁	Гофрета - 5.80 лв.
        //⦁	Палачинка - 3.20 лв.
        double pricePerDay = cakes*45+pancakes*5.8+gofrets*3.2;
        double totalPrice = pricePerDay*days*chif;
        System.out.printf("%.2f",totalPrice*7/8);
    }
}
