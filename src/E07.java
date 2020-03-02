import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double whiskeyPrice = Double.parseDouble(scan.nextLine());
        double beerLiters = Double.parseDouble(scan.nextLine());
        double wineLiters = Double.parseDouble(scan.nextLine());
        double rakiaLiters = Double.parseDouble(scan.nextLine());
        double whiskeyLiters = Double.parseDouble(scan.nextLine());

        double rakiaPrice = whiskeyPrice/2;
        double winePrice = whiskeyPrice/2*0.6;
        double beerPrice = whiskeyPrice/2*0.2;
        double totalPrice = whiskeyPrice*whiskeyLiters+rakiaLiters*rakiaPrice+wineLiters*winePrice+beerLiters*beerPrice;
        System.out.printf("%.2f",totalPrice);
    }
}
