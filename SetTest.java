/**
 *  Nama    : Nadiah Nuri Aisyah
 *  NRP     : 5025211210
 *  Kelas   :PBO B
 */
import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        Set<String> buah = new HashSet<String>();
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Anggur");
        
        System.out.print(buah + "\n");
        
        String a = "Kelapa";
        String b = "Jeruk";
        
        if(buah.contains(a)){
            System.out.println("Ada " + a + " dalam set buah");
        }
        else
            System.out.println("Tidak ada " + a + " dalam set buah");
        
        if(buah.contains(b)){
            System.out.println("Ada " + b + " dalam set buah");
        }
        else
            System.out.println("Tidak ada " + b + " dalam set buah");
        
        if(buah.isEmpty())
            System.out.print("Set buah kosong");
        else
            System.out.print("Set buah tidak kosong");
    }
    
}
