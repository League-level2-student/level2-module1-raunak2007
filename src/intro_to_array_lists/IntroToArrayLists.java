package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> stringArray=new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		stringArray.add("donkey donk");
		stringArray.add("meek mill");
		stringArray.add("saudi arabia");
		stringArray.add("los angeles");
		stringArray.add("quartet");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stringArray.size(); i++) {
			System.out.println(stringArray.get(i)+"/n");
		}
		//4. Print all the Strings using a for-each loop
		for (String s : stringArray) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int j = 0; j < stringArray.size(); j++) {
			if(j%2==0) {
			System.out.println(stringArray.get(j)+"/n");
		}
		//6. Print all the Strings in reverse order.
			for (int i = stringArray.size()-1; i >0; i--) {
				System.out.println(stringArray.get(i)+"/n");
			}
		//7. Print only the Strings that have the letter 'e' in them.
			for (int i = 0; i < stringArray.size(); i++){
				if(stringArray.get(i).contains("e")==true) {
				System.out.println(stringArray.get(i)+"/n");
				}
			}
	}
}
}
