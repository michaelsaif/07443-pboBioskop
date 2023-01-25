
package bisokopsc;


public class PesanTiket extends UserEntity {
    
   
    public PesanTiket(String kodeFilm, String fnama, String lnama, String noTelp, String tanggal, String jam, int harga){
        super.film = kodeFilm;
        super.fnama = fnama;
        super.lnama = lnama;
        super.noTelp = noTelp;
        super.tanggal = tanggal;
        super.jam = jam;
        super.harga = harga;
    }


    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getFnama() {
        return fnama;
    }

    public void setFnama(String fnama) {
        this.fnama = fnama;
    }

    public String getLnama() {
        return lnama;
    }

    public void setLnama(String lnama) {
        this.lnama = lnama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}
