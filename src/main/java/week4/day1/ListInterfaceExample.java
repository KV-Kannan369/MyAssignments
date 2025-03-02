package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceExample {

	public static void main(String[] args) {

		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		// int[] b = { 3, 2, 11, 4, 6, 7 };

		List<Integer> listA = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			listA.add(a[i]);
		}
		System.out.println("List a: " + listA);
		List<Integer> listB = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			listB.add(b[i]);
		}
		System.out.println("List b: " + listB);

		boolean equals = listA.equals(listB);
		System.out.println(equals);
		
		Collections.sort(listA);
		Collections.sort(listB);
		
		System.out.println(listA);
		System.out.println(listB);
		
		for(int i=0;i<listA.size();i++) {
			for(int j=0;j<listB.size();j++) {
				
				if(listA.get(i) == listB.get(j))
				{
					System.out.print("Matching Values: "+listA.get(i)+ " ");
				}
				}
			
		}

	}

}