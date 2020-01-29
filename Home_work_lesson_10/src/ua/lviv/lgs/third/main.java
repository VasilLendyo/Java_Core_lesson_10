package ua.lviv.lgs.third;

import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an arbitrary sentence");
		
		String s = sc.nextLine();
		
		String [] word = s.split(" ");
		
		int count = 0;
		for (int i = 0; i < word.length; i++) {
			if(word[i].length() >= 2) {
			count++;
			}
		}
		System.out.println(count);
	}
}
