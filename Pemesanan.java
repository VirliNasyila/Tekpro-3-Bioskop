import java.util.ArrayList;
import java.util.List;

    public class Pemesanan {
        //Attribute
        private Pelanggan pelanggan;
        private List<Tiket> daftarTiket;
        private int totalHarga;

        //Constructor
        public Pemesanan(Pelanggan pelanggan) {
            this.pelanggan = pelanggan;
            this.daftarTiket = new ArrayList<>();
            this.totalHarga = 0;
        }

        //Method Tambahan
        public void tambahTiket(Tiket tiket) {
            daftarTiket.add(tiket);
            totalHarga += tiket.getHarga();
        }

        //Getter & Setter
        public Pelanggan getPelanggan() {
            return pelanggan;
        }

        public void setPelanggan(Pelanggan pelanggan) {
            this.pelanggan = pelanggan;
        }

        public List<Tiket> getDaftarTiket() {
            return daftarTiket;
        }

        public int getTotalHarga() {
            return totalHarga;
        }

        //Method untuk menampilkan hasil pembayaran (STRUK)
        public void tampilkanStruk() {
            System.out.println("\n===== STRUK PEMESANAN =====");
            System.out.println("Nama Pelanggan: " + pelanggan.getNama());
            System.out.println("Email: " + pelanggan.getEmail());
            System.out.println("Daftar Tiket:");

            for (Tiket tiket : daftarTiket) {
                System.out.println("- " + tiket.getFilm().getJudul() + " (" + tiket.getJadwal() + ") - Rp" + tiket.getHarga());
            }

            System.out.println("Total Harga: Rp" + totalHarga);
            System.out.println("============================");
        }
    }

