
package kucing;


public class LocalCat extends Kucing {

    @Override
    public String nama() {
        return "Komeng";
    }

    @Override
    public int umur() {
        return 3;
    }

    @Override
    public String kelamin() {
      return "Laki-Laki";
    }

    @Override
    public void cakar() {
        System.out.println("Mempunyai cakar yang sangat tajam");
    }

    @Override
    public void kaki() {
        System.out.println("Jumlah kaki lengkap tapi cacat semua");
    }

    @Override
    public void ekor() {
        System.out.println("Tidak mempunyai ekor karena kelainan");
    }
    
}
