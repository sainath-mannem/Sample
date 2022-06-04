package com.sainath.java.examples.java8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExample {

	private Integer toInt(String str) {
		return Integer.parseInt(str);
	}
	
	private Integer add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		String x = "x";
		StrToInt impl = (String str) -> { String y = x;
			return Integer.parseInt(str);};
		System.out.println(impl.toInt("2"));
		test(impl);
		//x = "";
		//
		Addition impl2 = (a,b) -> {return a + b;};
		System.out.println(impl2.add(2,3));
		
		NoInput noInput = () -> {return 2;};
		System.out.println(noInput.get());
		
		StrToInt impl3 = str -> Integer.parseInt(str);
		System.out.println(impl3.toInt("2"));
		test(impl3);
		
		Function<String, Integer> impl4 = str -> Integer.parseInt(str);
		System.out.println(impl4.apply("2"));
		
		Supplier<Integer> noInput2 = () -> {return 2;};
		System.out.println(noInput2.get());
		
		Consumer<Integer> con = x2 -> consume(x2);
		con.accept(10);
		
		//Consumer<Integer> con = x2 -> LambdaExample :: consume;
		//con.accept(10);
	}
	
	public static void test(StrToInt strToInt) {
		System.out.println(strToInt.toInt("2"));
	}
	
	public static void consume(int x) {
		System.out.println(x);
	}
}

@FunctionalInterface
interface StrToInt {
	Integer toInt(String str);
}

interface Addition {
	Integer add(int a, int b);
}

interface NoInput {
	Integer get();
}