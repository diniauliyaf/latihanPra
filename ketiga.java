import java.util.Scanner;

public class ketiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jenis Kelamin = ");
        String jenisKelamin = input.nextLine();
        System.out.print("berat badan = ");
        double beratBadan = input.nextDouble();
        System.out.print("Tinggi Badan = ");
        double tinggiBadan = input.nextDouble();

        // rumus
        double tbMeter = tinggiBadan / 100;
        double total = (beratBadan / (tbMeter * tbMeter));

        System.out.printf("%.2f", total);
        kategori(jenisKelamin, total);
    }

    public static void kategori(String jenisKelamin, double total) {
         switch (jenisKelamin){
            case "Pria" :
                 if (total < 20.50){
                    System.out.println( ", Kurus");
                }
                else if (total > 20.50 && total < 26.99){
                    System.out.println(", Ideal");
                }
                else if (total >= 27.00){
                    System.out.println(", Gemuk");
                }
                else{
                    System.out.println("Maaf Inputan Salah");
                }
            break;
            
            case "Wanita":
                if (total < 18.50){
                    System.out.println(", Kurus");
                }
                else if (total > 18.50 && total < 24.99){
                     System.out.println(", Ideal");
                }
                else if (total >= 25.00){
                    System.out.println(", Gemuk");
                }
                else {
                    System.out.println("Maaf inputan salah.");
                }
                break;
                 }
                }
}
