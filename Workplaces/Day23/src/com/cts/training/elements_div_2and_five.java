package com.cts.training;
import java.util.ArrayList;
public class elements_div_2and_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("20");
		list.add("40");
		list.add("35");
		list.add("80");
		list.add("62");
		//System.out.println(list);
		for (int index = 0; index <= list.size(); index++) {
			if ((index % 2 == 0) || (index % 5 == 0)) {
				list1.add(list.get(index));
				System.out.println(list1);
			}
		}

	}


}
