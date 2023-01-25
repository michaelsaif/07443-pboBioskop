
package kucing;


public class Anggora extends Kucing {
    @Override
    public String nama(){
        return "Milea";
    }
    @Override
    public int umur(){
        return 14;
    }
    @Override
    public String kelamin(){
        return "perempuan";
    }

    @Override
    public void cakar() {
        System.out.println("Mempunyai cakar tumpul");
    }

    @Override
    public void kaki() {
        System.out.println("Mempunyai 4 kaki dan dan tidak ada yang cacat");
    }

    @Override
    public void ekor() {
        System.out.println("Mempunyai ekor pendek");
    }
    
    
}
