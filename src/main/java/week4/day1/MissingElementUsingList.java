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
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size() - 1; j++)
				if ((i + 1) != j) {
					System.out.println(list.get(i));
				}
		}

	}
}
