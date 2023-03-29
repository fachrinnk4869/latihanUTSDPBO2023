public class Kejujuran extends SifatManusia{
  private String reward;

  Kejujuran(int kode, String nama, String reward, AkibatMasaDepan akibat){
    this.setKode(kode);
    this.setNama(nama);
    this.reward = reward;
    this.setAkibat(akibat);
  }


  public void setReward(String reward) {
    this.reward = reward;
  }
  
  public String getReward() {
    return reward;
  }

  public void printSifat(){
    System.out.println("nama sifat " + this.getNama() + " dengan reward " + this.reward + " dan akibat masa depannya ada pada tahun " + getAkibat().getTahun());
  }
}
