
package editakun;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class register {
    private String name, password, alamat;
    private int umur; 
    List<String> member= new ArrayList<>();
    Scanner inp = new Scanner(System.in);


    
    //constructor dengan parameter
    public void setUmur(int umur) {
      this.umur = umur;
    }
    public void setName(String name) {
      this.name = name;
    }
     public void setPassword(String password) {
      this.password= password;
    }
    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }
    
    
    //memanggil deklarasi variabel
    //constructor tanpa parameter
    public String getAlamat() {
      return alamat;
    }
    public String getName() {
      return name;
    }
     public String getPassword() {
      return password;
    }
    public int getUmur() {
      return umur;
    }

        
    public void Create(){
        System.out.println("===================================");
        System.out.println("Create Akun Perpustakaan");
        System.out.print("Masukkan nama          : ");
        name = inp.nextLine();
        name = getName();
        System.out.print("Masukkan password      : ");
        password = inp.nextLine();
        password = getPassword();
        System.out.print("Masukkan Alamat        : ");
        alamat = inp.nextLine();
        alamat = getAlamat();
        System.out.print("Masukkan umur          : ");
        umur = inp.nextInt();
        umur = getUmur();
      
    
    }
    public void cetak_tampil(){
        System.out.println("\n===================================");
        System.out.println("Data Login Perpustakaan");
        System.out.println("Nama               : " + getName());
        System.out.println("Password           : " + getPassword());
        System.out.println("Alamat             : " + getAlamat());
        System.out.println("Umur               : " + getUmur()+" Tahun");
    
    }
}

class edit{
    String nama, password, alamat;
    int umur;
    Scanner inp = new Scanner(System.in);
    
    public void setUmur(int umur) {
      this.umur = umur;
    }
    public void setName(String nama) {
      this.nama = nama;
    }
     public void setPassword(String password) {
      this.password= password;
    }
    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }
    
  
    
    //memanggil deklarasi variabel
    //constructor tanpa parameter
    public String getAlamat() {
      return alamat;
    }
    public String getNama() {
      return nama;
    }
     public String getPassword() {
      return password;
    }
    public int getUmur() {
      return umur;
    }

    public void acountEdit(){
        System.out.println("===================================");
        System.out.println("Edit Akun Perpustakaan");
        System.out.print("Masukkan nama sebelumnya     : ");
        nama = inp.nextLine();
        nama = getNama();
        System.out.print("Masukkan nama baru           : ");
        nama = inp.nextLine();
        nama = getNama();
        System.out.print("Masukkan password lama       : ");
        password = inp.nextLine();
        password = getPassword();
        System.out.print("Masukkan password baru       : ");
        password = inp.nextLine();
        password = getPassword();
        System.out.print("Masukkan Alamat lama         : ");
        alamat = inp.nextLine();
        alamat = getAlamat();
        System.out.print("Masukkan Alamat baru         : ");
        alamat = inp.nextLine();
        alamat = getAlamat();
        System.out.print("Masukkan umur                : ");
        umur = inp.nextInt();
        umur = getUmur();
      
    
    }
    public void show(){
        System.out.println("\n===================================");
        System.out.println("Data Berhasil Di Edit");
        System.out.println("Nama               : " + getNama());
        System.out.println("Password           : " + getPassword());
        System.out.println("Alamat             : " + getAlamat());
        System.out.println("Umur               : " + getUmur()+" Tahun");
    
    }
    
}



public class Editakun {
    public static void main(String[] args) 
    {
        register rgs = new register();
        rgs.Create();
        rgs.cetak_tampil();
        
        edit edt = new edit();
        edt.acountEdit();
        edt.show();
       
        
    }
}   

