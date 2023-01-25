
package anouchment;

public class Goodbye extends Welcome{
        String procedure;
        
        public String prosedure(){
            System.out.println("CARA MEMESAN TIKET");
            return procedure;
        }
        //overload
        public String prosedure(String cara){
            System.out.println("DATANGI PETUGAS XXI");
            return cara;
        }
        
                
    @Override
    public String wlcm() {
        return "WELCOME TO CINEMA XXI";
    }

    @Override
    public String info() {
        return "SEGERA PESAN TIKET FILM FAVORIT ANDA";
    }

    @Override
    public void salam() {
        System.out.println("SEE YOU AND ALWAYS ENJOYED"); ;
    }

    
}
