package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<Integer> dateOfBirth = new LinkedList<>();
		dateOfBirth.add(6);
		dateOfBirth.add(12);
		dateOfBirth.add(1997);
		dateOfBirth.add(123456);
		System.out.println(dateOfBirth);

		System.out.println("The element at the head of the queue is: " + dateOfBirth.peek());

		dateOfBirth.remove(123456);
		System.out.println(dateOfBirth);

		System.out.println(dateOfBirth.poll());

		for(Integer dob:dateOfBirth)
			System.out.println(dob);

		Iterator<Integer> itr = dateOfBirth.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}








	}
}





