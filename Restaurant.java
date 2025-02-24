public class Restaurant {
            private String[] nama_makanan;
            private double[] harga_makanan;
            private int[] stok;
            private static byte id = 0; // Tetap static agar id berlaku untuk semua objek

            public Restaurant() {
                nama_makanan = new String[10];
                harga_makanan = new double[10];
                stok = new int[10];
            }

            public void tambahMenuMakanan(String nama, double harga, int stok) {
                if (id < 10) { // Hindari ArrayIndexOutOfBounds
                    this.nama_makanan[id] = nama;
                    this.harga_makanan[id] = harga;
                    this.stok[id] = stok;
                    nextId(); // Pindahkan ke sini agar otomatis bertambah
                } else {
                    System.out.println("Menu penuh! Tidak bisa menambah lagi.");
                }
            }

            public void tampilMenuMakanan() {
                for (int i = 0; i < id; i++) { // Gunakan < id, bukan <= id
                    if (!isOutOfStock(i)) {
                        System.out.println(nama_makanan[i] + " [" + stok[i] + "]\tRp. " + harga_makanan[i]);
                    }
                }
            }

            public boolean isOutOfStock(int id) {
                return stok[id] == 0;
            }

            private static void nextId() {
                id++;
            }
        }


