package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        // membuat input nama, nim, dan nilai
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        ArrayList<Double> nilai = new ArrayList<Double>();
        boolean stopInput = false;
        while (!stopInput) {
            System.out.print("Masukkan nilai mata kuliah (ketik selesai jika ingin berhenti): ");
            String inputNilai = scanner.nextLine();

            if (inputNilai.equalsIgnoreCase("selesai")) {
                stopInput = true;
            } else {
                try {
                    double nilaiMatkul = Double.parseDouble(inputNilai);
                    nilai.add(nilaiMatkul);
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
            }
        }

        // membuat objek Mahasiswa dengan inputan yang telah dimasukkan
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, nilai);

        // menambahkan data mahasiswa ke dalam ArrayList
        mahasiswaList.add(mahasiswa);

        // menampilkan data mahasiswa dan IPK menggunakan Iterator
        Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
        while (iterator.hasNext()) {
            Mahasiswa mhs = iterator.next();
            System.out.println("Nama: " + mhs.getNama() + ", NIM: " + mhs.getNim() + ", IPK: " + mhs.hitungIPK());
        }
        scanner.close();
    }
}
