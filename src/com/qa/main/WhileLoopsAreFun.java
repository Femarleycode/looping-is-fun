package com.qa.main;

public class WhileLoopsAreFun {

	public static void main(String[] args) {
		int catCount = 0;
		int dogCount = 0;

		while (catCount < 4) {

			while (dogCount < 4) {
				System.out.println("dogCount is: " + dogCount);
				System.out.println("adding another doggo...");
				dogCount++;
				System.out.println("success, dogCount is now: " + dogCount);
				System.out.println("------------");
			}

			System.out.println("catCount is: " + catCount);
			System.out.println("adding another cat...");
			catCount++;
			System.out.println("success, catCount is now: " + catCount);
			System.out.println("------------");
		}
	}
}
