import java.util.Scanner;

public class DaireAlanVeCevreBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Yarıçapı girilen dairenin alan ve çevresini hesaplayan program.
        System.out.print("Yarıçapı girin: ");
        double r = scan.nextDouble();
        final double pi = 3.14;
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.print("Alan: " + alan + "\n" + "Çevre: " + cevre);
        */
        // Yarıçapı ve merkez açısının ölçüsü girilen daire diliminin
        //alanını bulan program.
        System.out.print("Yarıçapı girin: ");
        double r = scan.nextDouble();
        final double pi = 3.14;
        double alan = pi * r * r;
        System.out.print("Merkez açısının ölçüsünü girin: ");
        double a = scan.nextDouble();
        double dilimAlan = alan * a / 360.0;
        System.out.print("Daire diliminin alanı: " + dilimAlan);
    }

}
