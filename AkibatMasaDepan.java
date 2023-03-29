public class AkibatMasaDepan {
  private String tahun;
  private String kode;
  private Boolean baikBuruk;

  AkibatMasaDepan(String tahun, String kode, Boolean baikBuruk){
    setTahun(tahun);
    setKode(kode);
    setBaikBuruk(baikBuruk);
  }

  public String getTahun() {
    return tahun;
  }
  public void setTahun(String tahun) {
    this.tahun = tahun;
  }
  public String getKode() {
    return kode;
  }
  public void setKode(String kode) {
    this.kode = kode;
  }
  public Boolean getBaikBuruk() {
    return baikBuruk;
  }
  public void setBaikBuruk(Boolean baikBuruk) {
    this.baikBuruk = baikBuruk;
  }

}
