    public class Tiket {
        //Attribute
        private Film film;
        private String jadwal;
        private int harga;

        //Constructor
        public Tiket(Film film, String jadwal, int harga) {
            this.film = film;
            this.jadwal = jadwal;
            this.harga = harga;
        }

        //Getter & Setter
        public Film getFilm() {
            return film;
        }

        public void setFilm(Film film) {
            this.film = film;
        }

        public String getJadwal() {
            return jadwal;
        }

        public void setJadwal(String jadwal) {
            this.jadwal = jadwal;
        }

        public int getHarga() {
            return harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }
    }

