package question;

import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
	public static void main(String args[]) {
		String result;
		result = reConstruct(split("helloworld"));
		System.out.println(result);
	}

	static ArrayList<String> split(String word) {
		ArrayList<String> resultList = new ArrayList<String>();
		for (String splitChar : word.split("")) {
			resultList.add(splitChar);
		}
		Collections.sort(resultList);
		return resultList;
	}

	static String reConstruct(ArrayList<String> list) {
		StringBuilder resultWord = new StringBuilder();
		for (String splitChar : list) {
			resultWord.append(splitChar);
		}
		return resultWord.toString();
	}
}
