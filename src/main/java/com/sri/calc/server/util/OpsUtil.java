package com.sri.calc.server.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sri.calc.server.command.Operator;

public class OpsUtil {
	
	public static Operator getOperator(String str) {
		for (Operator o : Operator.values()) {
			if (o.a.equals(str)) {
				return o;
			}
		}
		throw new IllegalStateException(String.format("Unsupported type %s.", str));
	}

	public static List<Operator> getPrioritizedOpsList() {
		List<Operator> l = Arrays.asList(Operator.values());
		Collections.sort(l, new Comparator<Operator>() {
			public int compare(Operator o1, Operator o2) {
				if (o1.p < o2.p)
					return 1;
				else if (o1.p > o2.p)
					return -1;
				else
					return 1;
			}
		});
		return l;
	}


}
