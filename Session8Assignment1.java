import java.util.*;
public class Session8Assignment1
{
    public static void main(String [] args) 
    {
          ArrayList<String> al = new ArrayList<String>();
     
        //Storing elements in Java Arraylist
        al.add("First element");
        al.add("Second element");
        al.add("Third element");
        al.add("Fourth element");
        al.add("Fifth element");
        al.add("Sixth element");
        al.add("Seventh element");
        al.add("Eight element");
        al.add("Nineth element");
        al.add("Tenth element");

        //use hasNext() and next() methods of Iterator to iterate through the elements
        System.out.println("Iterating through ArrayList elements...");
        Iterator<String> it = al.iterator();
        while(it.hasNext())
        {
              System.out.println(it.next());
        }   
          
   }
}