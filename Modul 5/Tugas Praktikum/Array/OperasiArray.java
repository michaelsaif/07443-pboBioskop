
public class OperasiArray {
    int [] arrayAngka;
    
    public OperasiArray (int[] arrayAngka){
        this.arrayAngka = arrayAngka;
    }
    
    public double totalAngka(){
        int total=0;
        for (int i=0; i<this.arrayAngka.length; i++){
            total=total+this.arrayAngka[i];
        }
        return total;
    }
    public double rerataAngka(){
        return totalAngka()/arrayAngka.length;
    }
            
}
