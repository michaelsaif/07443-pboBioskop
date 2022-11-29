
 
package bisokopsc;


public class Welcome {
    private String wlcm;
   
    
    //Overload constructor
    //opsi 1
    Welcome(String wlcm){
  ;
        this.wlcm = wlcm;
    }
    
    //opsi 2
    Welcome(){
        this.wlcm = wlcm;
    }
    
    void showWelcome(){
        System.out.println(this.wlcm);
    
    }
    //Overload method
    void showWelcome(String words){
        System.out.println("SEGERA PESAN TIKET DAN TONTON FILM FAVORIT MU");
        
    }
  
}

