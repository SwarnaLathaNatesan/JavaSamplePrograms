package basicPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorForHashSet {
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		mySet.add("apple");
		mySet.add("banana");
		mySet.add("cherry");

		Iterator<String> iterator = mySet.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
/*
 * In this code, we create a HashSet of strings and add three elements to it. We
 * then create an iterator for the set using the iterator() method of the
 * HashSet interface, and loop through its elements using the hasNext() and
 * next() methods of the Iterator interface.
 * 
 * Note that when using an iterator, you should always check whether the
 * iterator has a next element using hasNext() before calling next() to avoid a
 * NoSuchElementException. Additionally, you can use the remove() method of the
 * Iterator interface to remove an element from the underlying collection while
 * iterating over it.
 * 
 */
