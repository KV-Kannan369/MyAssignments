package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 10, 6, 8 };

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println(list+" "+"   List Size: "+list.size());
		
		int lastValue = list.get(list.size()-1);
		System.out.println("last value: "+lastValue);
		//Missing elements
		for(int i=1;i<lastValue;i++)
		{
			if(!list.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
