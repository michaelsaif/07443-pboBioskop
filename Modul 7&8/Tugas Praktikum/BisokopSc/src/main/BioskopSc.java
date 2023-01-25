package main;

import controller.Bioskop;
import anouchment.Welcome;
import anouchment.Goodbye;



public class BioskopSc {
    public static void main(String[] args) {
        System.out.println("================================");
        Goodbye bye = new Goodbye();
        bye.view();
        bye.wlcm();
        bye.info();
        System.out.println("================================");
        bye.prosedure();
        bye.prosedure("");
        System.out.println("================================");
        bye.salam();
        
        Bioskop xxi = new Bioskop();

    }

}
