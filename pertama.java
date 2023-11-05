import java.util.Scanner;

public class pertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan bilangan empat digit = ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.printf("%04d%n", hasil(a));
        System.out.printf("%04d%n", hasil(b));
        System.out.printf("%04d%n", hasil(c));
    }
    public static int hasil (int x){
        int digitPertama = x/1000;
        int sisaHitung = x % 1000;
        int digitKedua = sisaHitung % 100;
        sisaHitung = x % 100;
        int digitKetiga = sisaHitung / 10;
        int digitKeempat = sisaHitung % 10;

        digitPertama = (digitPertama + 5) % 10;
        digitKedua = (digitKedua + 5) % 10;
        digitKetiga = (digitKetiga + 5) % 10;
        digitKeempat = (digitKeempat + 5) % 10;

        int balik = digitKedua;
        digitKedua = digitKeempat;
        digitKeempat = balik;

        return digitPertama * 1000 + digitKedua * 100 + digitKetiga * 10 + digitKeempat;

    }
}
