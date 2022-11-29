
package adayangsalah;


//Project soal no 2
public class AdaYangSalah {

    
    public static void main(String[] args) {
       Segitiga segitiga = new Segitiga();
       segitiga.alas=10;
       segitiga.tinggi=12;
       
       double luas =segitiga.luas();
        System.out.println("Luas: "+luas);
       
    }
    
}
