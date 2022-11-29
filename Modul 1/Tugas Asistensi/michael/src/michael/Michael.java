 	package michael;
	 
	class Kubus{
	    //Attribute
	    int sisi1,sisi2,sisi3;
	    // function or method
	    void cariVolume(){
	        int volume= this.sisi1*this.sisi2*this.sisi3; // rumus
	        System.out.println("Volume kubus="+volume); //output
	    }
	}
	class Balok{
	    int panjang,lebar,tinggi;
	 
	    void cariVolume(){
	        int volume= this.lebar*this.panjang*this.tinggi;
	        System.out.println("Volume balok= "+volume);
	    }
	}
	class Segitiga{
	    int sisi1,sisi2,sisi3;
	    int alas,tinggi;
	 
	    void cariKeliling(){
	        int keliling= this.sisi1+this.sisi2+this.sisi3;
	        System.out.println("Keliling segitiga= "+keliling);
	    }
	    void cariLuas(){
	        double luas= 0.5*(this.alas*this.tinggi);
	        System.out.println("Luas segitiga= "+luas);
	    }
	}
	class Prisma{
	    int luasAlas,tinggi;
	 
	    void cariVolume(){ 
	        int volume= this.luasAlas*this.tinggi;
	        System.out.println("Volume prisma= "+volume);
	    }
	}
	 
	public class Michael {
	 
	    public static void main(String[] args) {
	 
	        Kubus kbs= new Kubus();  // membuat object 
	 
	        // pemanggilan object dan proses output function
	        kbs.sisi1= 2;
	        kbs.sisi2= 4;
	        kbs.sisi3= 2;
	        kbs.cariVolume();
	        System.out.println("---------------");
	 
	        Balok blk= new Balok();
	        blk.panjang= 5;
	        blk.lebar= 2;
 	        blk.tinggi= 2;
	        blk.cariVolume();
	        System.out.println("---------------");
	 
	        Segitiga sgt= new Segitiga();
	        sgt.sisi1= 9;
	        sgt.sisi2= 1;
	        sgt.sisi3= 4;
	        sgt.alas= 9;
	        sgt.tinggi= 3;
	        sgt.cariKeliling();
	        sgt.cariLuas();
	        System.out.println("---------------");
	 
	        Prisma prs= new Prisma();    
	        prs.luasAlas= 15;
	        prs.tinggi= 7;
	        prs.cariVolume();
	        System.out.println("---------------");
    }
}	 