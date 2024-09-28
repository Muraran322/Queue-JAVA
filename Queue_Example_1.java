
package queue_example_1;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Queue_Example_1 {

    public static void main(String[] args) {
        
        Queue<Integer>q = new LinkedList<>();
        
        //Adds elements {0,1,2,3,4} to the queue
        for(int i=0; i<5; i++)
        q.add(i);
        
        //Display the contents of the queue
        JOptionPane.showMessageDialog(null,q,"Elements of the Queue ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Elements of the queue "+q);
        
        //To remove the head of the queue
        int removedele =q.remove();
        JOptionPane.showMessageDialog(null,removedele,"Removed Element ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Removed Element -"+removedele);
        JOptionPane.showMessageDialog(null,q,"  ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println(q);
        
        //To view the head of the queue
        int head =q.peek();
        JOptionPane.showMessageDialog(null,head,"The head of the Queue ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("The head of the queue "+head);
        
       
        int size =q.size();
        JOptionPane.showMessageDialog(null,size,"Size of the Queue ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Size of the queue "+size);
        
      
    }
    
}
