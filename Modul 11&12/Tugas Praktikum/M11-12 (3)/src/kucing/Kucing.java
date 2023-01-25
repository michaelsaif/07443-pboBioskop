
package kucing;


public abstract class Kucing implements cakar, kaki, ekor  {
    //method abstract
    public abstract String nama();
    public abstract int umur();
    public abstract String kelamin();
    
    public void view(){
        System.out.println("Nama kucing: "+this.nama());
        System.out.println("Umur kucing: "+this.umur()+ " Bulan");
        System.out.println("Jenis kelamin: "+this.kelamin());
    }

}
