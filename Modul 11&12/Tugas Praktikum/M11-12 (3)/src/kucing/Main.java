
package kucing;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("===================");
        Anggora kcg1 = new Anggora() {};
        kcg1.view();
        kcg1.cakar();
        kcg1.ekor();
        kcg1.kaki();
        
        System.out.println("===================");
        LocalCat kcg2 = new LocalCat();
        kcg2.view();
        kcg2.cakar();
        kcg2.ekor();
        kcg2.kaki();
        
        System.out.println("===================");
        
    }
    
}
