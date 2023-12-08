package DataMahasiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        List<mahasiswabaru> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Tambah Data Mahasiswa Baru (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("NIM: ");
            String nim = input.nextLine();
            
            System.out.print("Umur: ");
            int umur = input.nextInt();
            input.nextLine();
            
            mahasiswabaru mahasiswa = new mahasiswabaru(nama, nim, umur);
            daftarMahasiswa.add(mahasiswa);
        }
        System.out.println("Daftar Mahasiswa: ");
        for (mahasiswabaru mahasiswa : daftarmahasiswa) {
            System.out.println(mahasiswa);
        }
    }
}
