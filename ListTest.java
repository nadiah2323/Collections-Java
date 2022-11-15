import java.util.*;
/**
 *  Nama    : Nadiah Nuri Aisyah
 *  NRP     : 5025211210
 *  Kelas   :PBO B
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> huruf = new ArrayList<String>();
        huruf.add("A");
        huruf.add("B");
        huruf.add("C");
        huruf.add("D");
        huruf.add("E");
        
        System.out.print("Huruf : " + huruf + "\n");
        
        huruf.remove("C");
        
        System.out.print("Huruf : " + huruf + "\n");
        
        huruf.add(2, "Z");
        
        System.out.print("Huruf : " + huruf);
                
    }
    
}
