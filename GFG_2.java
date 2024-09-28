
package gfg_2;

// Java program to demonstrate the creation of queue object 
//using the Priority queue class
import java.util.*;
import javax.swing.JOptionPane;

public class GFG_2 {

    public static void main(String[] args) {
        //Creating an empty priority queue
        Queue<Integer>pQueue =new PriorityQueue<Integer>();
        
        //Adding Items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        
        //Printing the top element of the PriorityQueue
        JOptionPane.showMessageDialog(null,pQueue.peek(),"The top element ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(pQueue.peek());
        
        //Printing the top Element and removing it from the PriorityQueue Container
        JOptionPane.showMessageDialog(null,pQueue.poll(),"Printing top element, removing from Priority queue",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(pQueue.poll());
        
        //Printing the top element again
        JOptionPane.showMessageDialog(null,pQueue.peek(),"Printing top element Again",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(pQueue.peek());
       
    }
    
}
