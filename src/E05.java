import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lenght = Double.parseDouble(scan.nextLine());
        double wight = Double.parseDouble(scan.nextLine());
        double wardrobe = Double.parseDouble(scan.nextLine());
         double hallArea = lenght*wight*10000;
        double wardrobeArea = wardrobe*wardrobe*10000;
        double benchArea = hallArea/10;
        double freeSpace = hallArea-wardrobeArea-benchArea;
        double dancers = Math.floor(freeSpace/7040);
        System.out.printf("%.0f", dancers);
    }
}
