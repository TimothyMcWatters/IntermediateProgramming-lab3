public class StringCollector {

	private static final int FACTOR = 2;
	private static final int INITIAL_CAPACITY = 10;
	private String[] list;
	private int actualCapacity;
	private int stringsStored;
	
	public StringCollector() {
		this.list = new String[INITIAL_CAPACITY];
		this.actualCapacity = INITIAL_CAPACITY;
		this.stringsStored = 0;
	}
	
	public void add(String s) {
		if (stringsStored >= actualCapacity) {	// grow the array!
			String[] tempList = new String[actualCapacity * FACTOR];
			for (int i = 0; i < actualCapacity; i++) {
				tempList[i] = list[i];
			}
			list = tempList;
			actualCapacity *= FACTOR;
			list[stringsStored] = s;
		} else {
			list[stringsStored] = s;
		}
		stringsStored++;
	}	

	public void showAll() {
		for (int i = 0; i < stringsStored; i++) {
			System.out.println(list[i]);
		}
	}
	
	/*
	* Author: S. Un - Appointed Chief Softwerker by El Chefe (aka. bigboss)
	*/
	public int countOccurrences(String s) {
		int count = 0;
		for (int i = 0; i < stringsStored; i++) {
			// if either the source or target are null, return current count
			// if they're equal, it a match
			if ((s == null) || (list[i] == null)) {
        	 		return count;
			} else if (list[i].equals(s)) {
        	 		count++;
			}
		}
		return count;
	}
	
	public static void main (String[] args) {
		try {
			StringCollector str1 = new StringCollector();
			str1.add("Hello");
			str1.add("Goodbye");
			str1.add("three");
			str1.add("Hello");
			str1.add("Hello");
			str1.add("Hello");
			str1.add("Goodbye");
			str1.add("three");
			str1.add("Hello");
			str1.add("Hello");
			str1.add("Hello");
			str1.showAll();
			System.out.println(str1.countOccurrences("Hello"));
		} catch(Exception e) {
			System.out.println("Things were going so well, What Happened");
		}
   
	}
}
