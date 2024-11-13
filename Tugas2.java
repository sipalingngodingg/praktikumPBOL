import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tugas2 {
    private static Map<String, String> mahasiswaMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Mahasiswa:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Daftar Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Kick Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    createMahasiswa(scanner);
                    break;
                case 2:
                    readMahasiswa();
                    break;
                case 3:
                    updateMahasiswa(scanner);
                    break;
                case 4:
                    kickMahasiswa(scanner);
                    break;
                case 5:
                    System.out.println("Keluar dari menu.");
                    break;
                default:
                    System.out.println("Plihan tidak ditemukan, silahkan coba lagi");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    private static void createMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar. Silakan coba lagi.");
        } else {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            mahasiswaMap.put(nim, nama);
            System.out.println("Mahasiswa berhasil ditambahkan.");
        }
    }

    private static void readMahasiswa() {
        if (mahasiswaMap.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            mahasiswaMap.forEach((nim, nama) -> 
                System.out.println("NIM: " + nim + ", Nama: " + nama));
        }
    }

    private static void updateMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM yang ingin diupdate: ");
        String nim = scanner.nextLine();

        if (mahasiswaMap.containsKey(nim)) {
            System.out.print("Masukkan Nama baru: ");
            String namaBaru = scanner.nextLine();
            mahasiswaMap.put(nim, namaBaru);
            System.out.println("Data mahasiswa berhasil diupdate.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    private static void kickMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM mhs bandel yang ingin di kick: ");
        String nim = scanner.nextLine();

        if (mahasiswaMap.remove(nim) != null) {
            System.out.println("Mahasiswa bandel ini berhasil di kick.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }
}
