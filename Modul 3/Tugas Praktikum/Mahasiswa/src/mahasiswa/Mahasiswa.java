
package mahasiswa;


public class Mahasiswa {
    String namaMhs, npm;
    public Mahasiswa(){
        namaMhs= "Agus";
        npm= "06.2021.1.09876";
    }
    public Mahasiswa(String namaMhs, String npm){
        this.namaMhs=namaMhs;
        this.npm=npm;
    }
    public static void main(String[] args) {
        Mahasiswa mhs= new Mahasiswa();
        System.out.println("DATA MAHASISWA"); 
        System.out.println("--------------- ");
        System.out.println("Nama: "+mhs.namaMhs);
        System.out.println("Npm: "+mhs.npm);
        System.out.println(" ");
        Mahasiswa mhs1= new Mahasiswa("Junet","06.2021.1.09478");
        System.out.println("Nama: "+mhs1.namaMhs);
        System.out.println("Npm: "+mhs1.npm);
    }
}
