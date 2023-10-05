import java.util.Scanner;
public class PemilihanPercobaan108 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int angka = input08.nextInt();
        
        String hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}