import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Para değerini girin: ");
        double kdvsiz = scan.nextDouble();
        double kdv = kdvsiz * 0.18;
        kdv = kdvsiz<=1000 && kdvsiz>=0 ? kdvsiz * 0.18 : kdvsiz * 0.08;
        double kdvli = kdvsiz + kdv;
        System.out.println("KDV'siz Fiyat: " + kdvsiz);
        System.out.println("KDV'li Fiyat: " + kdvli);
        System.out.print("KDV tutarı: " + kdv);
    }
}
