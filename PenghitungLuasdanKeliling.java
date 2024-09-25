import java.util.Scanner;

public class PenghitungLuasdanKeliling {

    //Persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    //Persegi Panjang
    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    //Lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih bangun datar\n");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        System.out.print("Masukkan Pilihan Anda:");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1: // Persegi
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Luas Persegi: " + hitungLuasPersegi(sisi));
                System.out.println("Keliling Persegi: " + hitungKelilingPersegi(sisi));
                break;
            case 2: // Persegi Panjang
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                System.out.println("Luas Persegi Panjang: " + hitungLuasPersegiPanjang(panjang, lebar));
                System.out.println("Keliling Persegi Panjang: " + hitungKelilingPersegiPanjang(panjang, lebar));
                break;
            case 3: // Lingkaran
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                System.out.println("Luas Lingkaran: " + hitungLuasLingkaran(jariJari));
                System.out.println("Keliling Lingkaran: " + hitungKelilingLingkaran(jariJari));
                break;
            default:
                System.out.println("Pilihan Anda tidak valid!.");
                System.exit(0);
        }
    }
}




