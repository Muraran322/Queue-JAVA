
package gfg;

import java.util.*;
import javax.swing.JOptionPane;

public class GFG {

    public static void main(String[] args) {
        
        Queue<String> pq =new PriorityQueue<>();
        
        pq.add("Dr Lilian");
        pq.add("Good night");
      
        //System.out.println(pq);
        JOptionPane.showMessageDialog(null, pq,"  ",JOptionPane.INFORMATION_MESSAGE);
       
    }
    
}
