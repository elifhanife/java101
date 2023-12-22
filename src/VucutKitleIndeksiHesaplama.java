import java.util.InputMismatchException;
import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
            double boy = scan.nextDouble();
            System.out.print("Lütfen kilonuzu giriniz : ");
            double kilo = scan.nextDouble();
            double vki = kilo / (boy * boy);
            System.out.print("Vücut Kitle İndeksiniz : " + vki);
        } catch (InputMismatchException e){
            System.out.print("Boyunuzu girerken nokta yerine virgül kullanın.");
        }
    }
}
