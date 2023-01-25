
package anouchment;


public abstract class Welcome implements salam {
    public abstract String wlcm();
    public abstract String info();

    public void view(){
        System.out.println("HALLO GUYS "+this.wlcm());
        System.out.println("THANK YOU, "+this.info());
        
    }
   
   
}
