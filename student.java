package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class student {

		public static void main(String[] args) {
			   List<String> a = Arrays.asList("a", "b", "c");
			   List<String> b = Arrays.asList("a", "b", "c", "d");
			   List<String> c = Arrays.asList("d", "e", "f", "g");

			   List<List<String>> lists = new ArrayList<List<String>>();
			   lists.add(a);
			   System.out.println("Common in A: " + getCommonElements(lists));

			   lists.add(b);
			   System.out.println("Common in A & B: " + getCommonElements(lists));

			   lists.add(c);
			   System.out.println("Common in A & B & C: " + getCommonElements(lists));

			   lists.remove(a);
			   System.out.println("Common in B & C: " + getCommonElements(lists));
			}

			public static <T> Set<T> getCommonElements(Collection<? extends Collection<T>> collections) {

			    Set<T> common = new LinkedHashSet<T>();
			    if (!collections.isEmpty()) {
			       Iterator<? extends Collection<T>> iterator = collections.iterator();
			       common.addAll(iterator.next());
			       while (iterator.hasNext()) {
			          common.retainAll(iterator.next());
			       }
			    }
			    return common;
			}}
