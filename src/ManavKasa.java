import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        final double armut = 2.14, elma = 3.67, domates = 1.11,
                muz = 0.95, patlican = 5.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        double armutKilo = scan.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        double elmaKilo = scan.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        double domatesKilo = scan.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        double muzKilo = scan.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlicanKilo = scan.nextDouble();
        double toplam = armutKilo * armut + elmaKilo * elma +
                domatesKilo * domates + muzKilo * muz + patlicanKilo * patlican;
        System.out.print("Toplam tutar : " + toplam + " TL");
    }
}
