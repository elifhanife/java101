import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunu girin: ");
        mat = scan.nextInt();
        System.out.print("Fizik notunu girin: ");
        fizik = scan.nextInt();
        System.out.print("Kimya notunu girin: ");
        kimya = scan.nextInt();
        System.out.print("Türkçe notunu girin: ");
        turkce = scan.nextInt();
        System.out.print("Tarih notunu girin: ");
        tarih = scan.nextInt();
        System.out.print("Müzik notunu girin: ");
        muzik = scan.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;
        System.out.println( ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        }
    }