package utilities.list;

import utilities.list.LinkedListException;
import utilities.list.ManipulateList;
import utilities.list.TraverseList;
import utilities.list.LinkedList;



public class Program {

    public static void main(String[] args) throws LinkedListException {
        LinkedList<String> objList = new LinkedList<>();
        objList.add("First");
        objList.add("Second");
        objList.add("Third");
        
       ManipulateList<String> ManList = objList;

        manipulate(ManList);
        
        TraverseList<String> TraList = objList;
        display(TraList);
    }

    public static void display(TraverseList<String> list) {
        try {
            String data = list.getFirst();
            while (data != null) {
                System.out.println(data);
                data = list.getNext();
            }
        } catch (LinkedListException e) {
            e.printStackTrace();
        }
    }

    public static void manipulate(ManipulateList<String> list) throws LinkedListException {
        list.add("Hello");
    }
}