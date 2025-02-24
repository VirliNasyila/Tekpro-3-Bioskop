import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Daftar film yang tersedia
            Film[] daftarFilm = {
                    new Film("Bolehkah Sekali Saja Kumenangis", "Drama", 180),
                    new Film("Home Sweet Loan", "Drama", 169),
                    new Film("The Conjuring", "Horror", 112),
                    new Film("Joker", "Thriller", 122)
            };

            // Daftar harga tiket berdasarkan film
            Tiket[] daftarTiket = {
                    new Tiket(daftarFilm[0], "14:00", 50000),
                    new Tiket(daftarFilm[1], "16:00", 45000),
                    new Tiket(daftarFilm[2], "18:00", 40000),
                    new Tiket(daftarFilm[3], "20:00", 48000)
            };

            // Input pelanggan
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan email pelanggan: ");
            String emailPelanggan = scanner.nextLine();

            Pelanggan pelanggan = new Pelanggan(namaPelanggan, emailPelanggan);
            Pemesanan pemesanan = new Pemesanan(pelanggan);

            boolean lanjut = true;
            while (lanjut) {
                System.out.println("\n=== Daftar Film ===");
                for (int i = 0; i < daftarTiket.length; i++) {
                    System.out.println((i + 1) + ". " + daftarTiket[i].getFilm().getJudul() +
                            " (" + daftarTiket[i].getJadwal() + ") - Rp" + daftarTiket[i].getHarga());
                }

                System.out.print("Pilih film (nomor): ");
                int pilihan = scanner.nextInt();

                if (pilihan > 0 && pilihan <= daftarTiket.length) {
                    pemesanan.tambahTiket(daftarTiket[pilihan - 1]);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

                System.out.print("Pesan lagi? (y/n): ");
                String jawaban = scanner.next();
                if (jawaban.equalsIgnoreCase("n")) {
                    lanjut = false;
                }
            }

            // Menampilkan struk pemesanan
            pemesanan.tampilkanStruk();
            scanner.close();
        }
    }
