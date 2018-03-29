package examples.JavaDev1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Helper {

	public static String answer ="";
	public static int level = 1;
	public static int diamonds = 0;
	
	public static boolean fight(int monsterLevel) {
		Random rand = new Random();
		int  n = rand.nextInt(monsterLevel) + 1;
		if (n>level) {
			say ("You have been defeated. You lose.");
		} else {
			say ("You defeated the monster. Great job!");
			say ("You get " + monsterLevel + " diamonds");
			diamonds = diamonds + monsterLevel;
			level = level + 1; 
			say ("You are now level " + level + ".");
			return true;
		}
		return false;
	}
	
	public static String ask() {
		return ask("What would you like to do?");
	}
	
	public static String ask(String prompt) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		System.out.print(":");
		String s="";
		int i=0;
		try {
			s = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		answer=s;
		return s;
	}
	
	public static void say(String what) {
		System.out.println(what);
	}
	
	public static boolean is(String compare) {
		if (compare.equals(answer)) {
			return true;
		}
		return false;
	}

}