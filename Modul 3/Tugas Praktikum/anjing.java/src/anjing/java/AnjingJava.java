
package anjing.java;

public class AnjingJava {
    String jenisAnjing;
    int umur=9;
    
    public AnjingJava(){
        jenisAnjing= "Wild Dog";
    }
    public static void main(String[] args) {
        AnjingJava obj2= new AnjingJava();
        System.out.println("Jenis Anjing: "+obj2.jenisAnjing);
        System.out.println("Umur Anjing: "+obj2.umur+ " Bulan");
    }
    
}