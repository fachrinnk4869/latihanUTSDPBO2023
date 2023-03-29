public class Kecurangan extends SifatManusia {
  
  private String hukuman;


  Kecurangan(int kode, String nama, String hukuman, AkibatMasaDepan akibat){
    this.setKode(kode);
    this.setNama(nama);
    this.setAkibat(akibat);
    this.hukuman = hukuman;
  }

  public void printSifat(){
    System.out.println("nama sifat " + getNama() + " dengan hukuman " + this.hukuman + " dan akibat masa depannya ada pada tahun " + getAkibat().getTahun());
  }

  
}
