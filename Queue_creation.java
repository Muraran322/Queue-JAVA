
package queue_creation;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Queue_creation {

    public static void main(String[] args) {
        //Create a queue of Integers using LinkedList
        Queue<Integer>queue = new LinkedList<>();
        
        //Displaying the queue
        JOptionPane.showMessageDialog(null,queue,"Queue elements: ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Queue elements : "+queue);
       
    }
    
}
