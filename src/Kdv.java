import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz:");
        tutar = inp.nextDouble();

         kdvTutar = tutar * kdvOran;
         kdvliTutar = tutar + kdvTutar;

         System.out.println("KDV'siz tutar : "+ tutar);
         System.out.println("KDV oranı : "+ kdvOran);
         System.out.println("KDV tutarı : "+ kdvTutar);
         System.out.println("KDV'li tutar : "+ kdvliTutar);



    }
}
