import java.util.Scanner;

public class Ratarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahSiswa = 1;
        double nilaiSiswa, total = 0.0, Ratarata = 0.0;
        
        System.out.println("masukkan jumlah siswa: ");
        jumlahSiswa = input.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            nilaiSiswa = input.nextDouble();

            total += nilaiSiswa;

            Ratarata = total / jumlahSiswa;
        }
        System.out.println("----------------------------------------");
        System.out.println("Total nilai siswa adalah: " + jumlahSiswa+" siswa adalah "+ total);
        System.out.println("Rata-rata nilai siswa adalah: " + jumlahSiswa+" siswa adalah "+ Ratarata);
        System.out.println("----------------------------------------");
input.close();
}
}
