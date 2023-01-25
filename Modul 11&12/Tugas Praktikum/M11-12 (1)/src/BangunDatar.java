
public class BangunDatar {
    double r, a, t; //segitiga&lingkaran
    int s, p, l;  //persegi&p.panjang
    
    
    public double luas(double r){
       double ling = 3.14*r*r;
        System.out.println("luas lingkaran: "+ling);
        return ling;
    }
    public double luas(double a, double t){
        double sgt = 0.5*a*t;
        System.out.println("luas segitiga: "+sgt);
        return sgt;
    }
    public int luas(int s){
        int psg = s*s;
        System.out.println("luas persegi: "+psg);
        return psg;
    }
    public int luas(int p, int l){
        int ppjg = p*l;
        System.out.println("luas p.panjang: "+ppjg);
        return ppjg;
    }
    
}
