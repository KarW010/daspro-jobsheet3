import java.util.Scanner;
public class Siakad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS;
        double nilaiAkhir;

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai tugas:");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}