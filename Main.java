import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    ArrayList<SifatManusia> listSifat = new ArrayList<>();
    // SifatManusia sifatAsli = new Kejujuran(1, "beramal", "pahala++");
    listSifat.add(new Kejujuran(1, "beramal", "pahala++", new AkibatMasaDepan("2020", "1", true)));
    listSifat.add(new Kecurangan(1, "mencuri", "pahala ngurang 1", new AkibatMasaDepan("2021", "1", true)));
    
    HashMap<Human, ArrayList<SifatManusia>> mapManusiaSifat = new HashMap<>();

    mapManusiaSifat.put(new Human("2101001", "Fachri", "Laki laki"), listSifat);

    /*
      buka komen dibawah kalo ingin menampilan nama beserta sifat yang dimilikinya
    */
    // for (Human i : mapManusiaSifat.keySet()) {
    //   System.out.println("nama " + i.getNama() + " dan sifat - sifatnya adalah");
    //   for(int j = 0; j < mapManusiaSifat.get(i).size();j++){
    //     // if(sign.equals(mapManusiaSifat.get(i).get(j).getNama())){
    //       mapManusiaSifat.get(i).get(j).printSifat();
    //     // }
    //   }
    // }


    /*
      buka komen dibawah kalo ingin menampilan mencari sifat yang diinginkan
    */
    Scanner sc = new Scanner(System.in);
    String sign = sc.next();
    for(int i = 0; i < listSifat.size();i++){
      if(sign.equals(listSifat.get(i).getNama())){
        listSifat.get(i).printSifat();
      }
    }

  }
}
