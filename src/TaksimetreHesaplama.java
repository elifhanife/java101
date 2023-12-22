import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        System.out.print("Mesafeyi girin (km): ");
        Scanner scan = new Scanner(System.in);
        double km = scan.nextDouble();
        final double acilis = 10.0;
        final double birimFiyat = 2.20;
        double tutar = acilis + km * birimFiyat;
        tutar = (tutar<=20.0) ? 20.0 : tutar ;
        System.out.print("Toplam tutar: " + tutar);
    }
}
