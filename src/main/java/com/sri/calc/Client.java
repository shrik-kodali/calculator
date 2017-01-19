package com.sri.calc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.sri.calc.server.command.Command;
import com.sri.calc.server.command.Operator;
import com.sri.calc.server.util.OpsUtil;

public class Client {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<String> ll = new LinkedList<String>(); // Used Linked List as the logic needs more of deletions and additions at several different places
		String line = input.nextLine();
		String[] str = line.split(" ");
		if (str.length < 3) {
			System.out.println("Wrong One :: Correct Format is 1 + 5 * 7 "
					+ " : (Make sure you enter the spaces in between Integers for this calc)");
		} else {
			ll.addAll(Arrays.asList(str));
			List<Operator> pList = OpsUtil.getPrioritizedOpsList(); 
			for (Operator p : pList) { // TODO
				while (ll.contains(p.a)) {
					processSubString(ll, p); //TODO Add logic for brackets here
				}
			}

			if (ll.size() > 1) {
				System.out.println("Wrong format");
			}
			for (String st : ll) {
				System.out.println(st + "");
			}
		}
	}

	private static String processSubString(List<String> ll, Operator p) {
		Integer pre = 0, next = 0, result = 0;
		String op = "";
		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i).equals(p.a)) {
				pre = Integer.parseInt(ll.get(i - 1));
				next = Integer.parseInt(ll.get(i + 1));
				op = ll.get(i);
				result = new Command(op.toString(), pre, next).execute();
				ll.remove(i + 1);
				ll.remove(i);
				ll.remove(i - 1);
				ll.add(i - 1, String.valueOf(result));
			}
		}
		return ll.get(0);
	}
}
