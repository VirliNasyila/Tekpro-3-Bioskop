    public class Film {
        //Atribute
        private String judul;
        private String genre;
        private int durasi; // dalam menit

        //Constructor
        public Film(String judul, String genre, int durasi) {
            this.judul = judul;
            this.genre = genre;
            this.durasi = durasi;
        }

        //Getter & Setter
        public String getJudul() {
            return judul;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getDurasi() {
            return durasi;
        }

        public void setDurasi(int durasi) {
            this.durasi = durasi;
        }
    }

