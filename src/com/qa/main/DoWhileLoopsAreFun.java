package com.qa.main;

public class DoWhileLoopsAreFun {

	public static void main(String[] args) {
		int playCount = 0;
		boolean playing = false;

		System.out.println("do-while loop");
		do {
			System.out.println("playCount is " + playCount + ", playing...");
			playCount++;
			System.out.println("playCount is now " + playCount);

			if (playCount > 5) {
				playing = false;
			}

		} while (playing == true);

		System.out.println("-------");

		System.out.println("while loop");
		while (playing == true) {
			System.out.println("playCount is " + playCount + ", playing...");
			playCount++;
			System.out.println("playCount is now " + playCount);

			if (playCount > 5) {
				playing = false;
			}
		}

		System.out.println("game over");
	}
}
