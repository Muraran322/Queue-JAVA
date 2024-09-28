
package gfg_iteration;

import java.util.*;
import javax.swing.JOptionPane;

public class GFG_Iteration {

    public static void main(String[] args) {
        
        Queue<String> pq =new PriorityQueue<>();
        
        pq.add("Told you");
        pq.add("I");
        pq.add("so");
        
        Iterator iterator = pq.iterator();
        
        while(iterator.hasNext()){
            JOptionPane.showMessageDialog(null,iterator.next(),"  ",JOptionPane.INFORMATION_MESSAGE);
            //System.out.println(iterator.next() + " ");
        }
        
        
    }
    
}
