
package methodstatic;

public class Methodstatic {
    // membuat atribute dgn variabel static
    static String namaHewan, jenisHewan, makanan;
    static int thnSekarang= 2022, thnLahir=2021, umur;

    public static void main(String[] args) {
        //memanggil data yg bervariabel static
        namaHewan= "Rayzer";
        System.out.println("Nama Hewan Saya: "+namaHewan);
        makanan= "Daging Beef";
        System.out.println("Makanan kesukaannya adalah: "+makanan);
        jenisHewan= "Anjing";
        System.out.println("Jenis hewan: "+jenisHewan);
        System.out.println("Saat ini berumur: "+Umur_Hewan()+" Tahun ");
        }
    //penambahan variabel static pd method return 
    static int Umur_Hewan(){
        umur= thnSekarang-thnLahir;
        return umur;
    }
          
}
    

