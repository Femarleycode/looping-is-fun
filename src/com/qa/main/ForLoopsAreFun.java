package com.qa.main;

public class ForLoopsAreFun {

	public static void main(String[] args) {

		for (int counter = 0; counter <= 10; counter++) {

			if (counter == 2) {
				break; // goes to the end of the loop, then kicks you out of scope!
			}

			if (counter == 7) {
				continue; // goes to the end of the loop, then kicks you back to the start of the loop!
			}

			System.out.println(counter);
		}

	}
}
