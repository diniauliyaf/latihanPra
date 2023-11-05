import java.util.Scanner;

public class kedua{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat 1 = ");
        int A = input.nextInt();
        System.out.println("Masukkan bilangan bulat 2 = ");
        int B = input.nextInt();

        //menjumlahkan dua bilangan:
        int hasil = A + B;
        int ratusan = hasil / 100;
        int puluhan = (hasil % 100) / 10;
        int satuan = (hasil % 100) % 10;

        if(ratusan != 0) {
            if (ratusan == 1) {
                System.out.print("Seratus ");
            } else {
                System.out.print(angka(ratusan) + " ratus ");
            }
        }
    

        if (puluhan !=0) {
            if (puluhan == 1) {
                if (satuan == 1){
                    System.out.println("sepuluh");
                    return;
                } else if (satuan == 1) {
                    System.out.println("sebelas");
                    return;
                }
                System.out.println(angka(satuan) + " belas ");
                return;
            } else {
                    System.out.println(angkaPuluhan(puluhan)+ " ");
                }
            }
        if (satuan !=0) {
            System.out.println (angka(satuan));
            }

            System.out.println();
        }
        public static String angka (int x) {
            switch (x) {
                case 0:
                    return "nol";
                case 1:
                    return "satu";
                case 2:
                    return "dua";
                case 3:
                    return "tiga";
                case 4:
                    return "empat";
                case 5:
                    return "lima";
                case 6:
                    return "enam";
                case 7:
                    return "tujuh";
                case 8:
                    return "delapan";
                case 9:
                    return "sembilan";
                default:
                    return "";
            }
        }

    public static String angkaPuluhan(int x) {
            switch (x) {
                case 2:
                    return "dua puluh";
                case 3:
                    return "tiga puluh";
                case 4:
                    return "empat puluh";
                case 5:
                    return "lima puluh";
                case 6:
                    return "enam puluh";
                case 7:
                    return "tujuh puluh";
                case 8:
                    return "delapan puluh";
                case 9:
                    return "sembilan puluh";
                default:
                    return " ";
        

            }
        }
    }