
public class MainArray {

   
    public static void main(String[] args) {
       int[] array = {2,0,2,1,1,0,7,4,4,3};
       
       OperasiArray oArray;
       oArray = new OperasiArray(array);
        System.out.println(oArray.totalAngka());
        System.out.println(oArray.rerataAngka());
    }
    
    
}
