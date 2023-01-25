import java.util.Scanner;


public class Kalkulator {

    public static void main(String[] args) {
        
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Input Operasi: ");
        String angkaStr = input.nextLine();
        
        String[] inputuser = angkaStr.split(" ");
      
        int angka1= Integer.parseInt(inputuser[0]);  
        String operator = inputuser[1];
        int angka2= Integer.parseInt(inputuser[2]);
        
        switch (operator){
            case "+":
            int hasil = angka1 + angka2;
                System.out.println("Hasil: " +hasil);
                break;       
            }
        }catch(Exception e){
                System.out.println("Ada problem pada :"+e);
                }
        
    }
    
}
