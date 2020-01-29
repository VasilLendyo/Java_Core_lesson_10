package ua.lviv.lgs.first;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five-letter polyandry");
		String s = sc.nextLine().toLowerCase();
		StringBuffer sb = new StringBuffer(s);
		
		if(s.length() == 5) {
			if(s.equals(sb.reverse().toString())) {
				System.out.println("Right, it's polyandry");
			}else {
				System.out.println("Not right, it's not polyandry");
			}
		}else {
				System.out.println("Error! Enter a five-letter word");
		}
	}
}
