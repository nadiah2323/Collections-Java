import java.util.*;
/**
 *  Nama    : Nadiah Nuri Aisyah
 *  NRP     : 5025211210
 *  Kelas   :PBO B
 */

class Stack{
    private LinkedList l = new LinkedList();
    public void push(Object obj){
        l.addFirst(obj);
    }
    public Object top(){
        return l.getFirst();
    }
    public Object pop(){
        return l.removeFirst();
    }
}

public class LinkedListStackTest {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Satu");
        s.push("Dua");
        s.push("Tiga");
        s.push("Empat");
        
        System.out.println(s.pop());
        
        s.pop();
        
        System.out.println(s.top());
        
    }
    
}
