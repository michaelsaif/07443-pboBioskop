
package bangunruang;

public class BangunRuang {
    
    public static void main(String[] args) {
    //membuat objek     
    kubus kbs= new kubus();
    balok blk= new balok();
    lingkaran lkg=new lingkaran();
    
    //cari volume kubus
    System.out.println("Rumus Volume Kubus");
    System.out.println("==================");
    System.out.println("Input Sisi1: "+kbs.sisi1);
    System.out.println("Input Sisi2: "+kbs.sisi2);
    System.out.println("Input Sisi3: "+kbs.sisi3);
    System.out.println("Volume Kubus: "+kbs.volume);   
    System.out.println("");
    
    //cari volume balok
    System.out.println("Rumus Volume Balok");
    System.out.println("==================");
    System.out.println("Input Panjang: "+blk.panjang);
    System.out.println("Input Lebar: "+blk.lebar);
    System.out.println("Input Tinggi: "+blk.tinggi);
    System.out.println("Volume Balok: "+blk.volume);
    System.out.println("");
    
    //cari luas lingkaran
    System.out.println("Rumus Luas Lingkaran");
    System.out.println("=====================");
    System.out.println("Input r: "+lkg.jari_jari);
    System.out.println("Input Phi:"+lkg.phi);
    System.out.println("Luas Lingkaran: "+lkg.luas);
    }
    
}
//objek 
class kubus{
    int sisi1=2,sisi2=5,sisi3=6;
    int volume=sisi1*sisi2*sisi3;
}
class balok{
    int panjang=4,lebar=10,tinggi=3;
    int volume=panjang*lebar*tinggi;
}
class lingkaran{
    int jari_jari=3;
    double phi=3.14;
    double luas= 3.14*(jari_jari*jari_jari);
}