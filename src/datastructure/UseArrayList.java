package datastructure;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> myList = new ArrayList<>();
		myList.add("8351");
		myList.add("FL");
		myList.add("_");
		myList.add("Alejandro");
		myList.add("Jose");
		myList.add("The king");
		System.out.println(myList);

		String theKing = myList.get(5);
		System.out.println(theKing);

		myList.remove("_");
		System.out.println(myList);




		for(String str: myList)
			System.out.println(str);

		Iterator itr = myList.iterator();
		while(itr.hasNext()) {
			Object elements = itr.next();
			System.out.println(elements + " ");
		}
		ConnectToMongoDB connect = new ConnectToMongoDB();


	}

}
