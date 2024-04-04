package queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;


public class Main {
	public static void main (String args[]) {
		Queue<String> kiwi = new LinkedList <String>();
		kiwi.add("aaaaa");
		kiwi.add("BBBBB");
		kiwi.add("ccccc");
		kiwi.add("DDDDD");
		kiwi.add("eeeee");
		System.out.println("Elementos do queue: " + kiwi);
		System.out.println("Tamanho do queue: " + kiwi.size());
		System.out.println("--------------------------");
		System.out.println("Método peek: " + kiwi.peek());
		System.out.println("Elementos do queue dps do peek: " + kiwi);
		System.out.println("--------------------------");
        System.out.println("Método poll: " + kiwi.poll());
        System.out.println("Elementos do queue dps do poll: " + kiwi);
        System.out.println("--------------------------");
        System.out.println("Método remove(\"DDDDD\"): " + kiwi.remove("DDDDD"));
        System.out.println("Método remove(\"DDDDD\"): " + kiwi.remove("fffff"));
        System.out.println("Elementos do queue dps do remove: " + kiwi);
	}
}
