package booklibrary;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Librabry {
    public String bookLibrary(){
        PriorityQueue<People> queue = new PriorityQueue<>();
        queue.add(new People("teacher",1));
        queue.add(new People("junior student" , 3));
        queue.add(new People("senior student",2));
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        return "book taken";

    }
    public static void main(String[] args){
        Librabry librabry = new Librabry();
        librabry.bookLibrary();
    }
}
