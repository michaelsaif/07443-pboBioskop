
package kucing.java;


public class KucingJava {
    String jenisKucing;
    int umur;
    
    public KucingJava(String jenisKucing, int umur){
        this.jenisKucing= jenisKucing;
        this.umur=umur;
    }
    
    public static void main(String[] args) {
      KucingJava obj1= new KucingJava("Local Cat", 2);
      System.out.println("Jenis Kucing: "+obj1.jenisKucing);
      System.out.println("Umur Kucing: "+obj1.umur+" Tahun");
    }
    
}
