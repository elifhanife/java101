import java.util.Scanner;
import java.lang.Math;

public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Dik kenarlarının uzunluğu girilen bir dik üçgenin
            hipotenüsünün uzunluğunu bulan program.
        System.out.print("Dik kenar a'nın uzunluğunu girin: ");
        double a = scan.nextDouble();
        System.out.print("Dik kenar b'nin uzunluğunu girin: ");
        double b = scan.nextDouble();
        System.out.print("Hipotenüsün uzunluğu: " + Math.sqrt(a*a+b*b));
        */

        // Üç kenar uzunluğu girilen üçgenin alanını bulan program.
        System.out.print("a kenarının uzunluğunu girin: ");
        double a = scan.nextDouble();
        System.out.print("b kenarının uzunluğunu girin: ");
        double b = scan.nextDouble();
        System.out.print("c kenarının uzunluğunu girin: ");
        double c = scan.nextDouble();
        double u = (a + b + c)/2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print("Üçgenin alanı: " + alan);
    }
}
