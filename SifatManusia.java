// import java.util.ArrayList;

abstract class SifatManusia {
  private int kode;
  private String nama;
  private AkibatMasaDepan akibat;
  public abstract void printSifat();

  public int getKode() {
    return kode;
  }
  
  public void setKode(int kode) {
    this.kode = kode;
  }
  
  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
  public AkibatMasaDepan getAkibat() {
    return akibat;
  }
  public void setAkibat(AkibatMasaDepan akibat) {
    this.akibat = akibat;
  }
}
