
package queue_example;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Queue_Example {

    public static void main(String[] args) {
        
        Queue<String>queue =new LinkedList<>();
        
        //add elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        
        //Print the queue
        JOptionPane.showMessageDialog(null,queue,"Queue ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Queue: "+queue);
        
        //Remove the element at the front of the queue
        String front = queue.remove();
        JOptionPane.showMessageDialog(null,front,"Removed element ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Removed element: "+front);
        
        //Print the updated queue
        JOptionPane.showMessageDialog(null,queue,"Queue after Removal ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Queue after removal: "+queue);
        
        //add another element to the queue
        queue.add("Date");
        
        //peek at the element at the front of the queue
        String peeked = queue.peek();
        
        JOptionPane.showMessageDialog(null,peeked,"Peeked Element ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Peeked Element: "+peeked);
        
        //Print the updated queue
        JOptionPane.showMessageDialog(null,queue,"Queue after peek ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Queue after peek: "+queue);
        
        
    }
    
}
