import mycalculator.bangundatar.Persegi;
import mycalculator.bangunruang.Kubus;
import mycalculator.deretAngka.DeretAngka;

public class Main {

    public static void main(String[] args) {
        Persegi psg = new Persegi();
        Kubus kbs = new Kubus();
        DeretAngka drt = new DeretAngka();
        
        psg.tampil();
        kbs.tampil();
        drt.tampil();
    }
    
}
