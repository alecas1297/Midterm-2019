package datastructure;

import databases.ConnectToMongoDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> breakFast= new ArrayList<String>();
		breakFast.add("Bread");
		breakFast.add("Eggs");
		breakFast.add("Bacon");
		breakFast.add("Pancakes");
		breakFast.add("Orange Juice");

		List<String> dataBases = new ArrayList<String>();
		dataBases.add("MySql");
		dataBases.add("MongoDB");
		dataBases.add("OracleDB");
		dataBases.add("Microsoft SQL Server");

		Map<String, List<String>> jobs = new HashMap<String, List<String>>();
		jobs.put("Today's Breakfast",breakFast);
		jobs.put("Databases",dataBases);

		System.out.println("Printing DATA");
		for(Map.Entry<String,List<String>> printMenu: jobs.entrySet()){
			System.out.println(printMenu.getKey()+" ---> "+printMenu.getValue());
		}

		System.out.println("Printing DATA using Iterator");
		Iterator<Map.Entry<String,List<String>>> it = jobs.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> pair = it.next();
			System.out.println(pair.getKey()+" --> "+pair.getValue());
		}
		ConnectToMongoDB connectDB = new ConnectToMongoDB();


	}

}
