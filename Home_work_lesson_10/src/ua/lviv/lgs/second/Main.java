package ua.lviv.lgs.second;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an arbitrary sentence");
		
		String s = sc.nextLine().toLowerCase();
		
		System.out.println(s.replace("a", "-").replace("o", "-").replace("i", "-").replace("u", "-").replace("y", "-").replace("e", "-"));
	}
}
