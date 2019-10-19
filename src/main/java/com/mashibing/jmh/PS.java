package com.mashibing.jmh;

		import java.util.ArrayList;
		import java.util.List;
		import java.util.Random;

public class PS {

	static List<Integer> nums = new ArrayList<>();
	static {
		Random r = new Random();
		for (int i = 0; i < 1000; i++) nums.add(1000000 + r.nextInt(1000000));
	}

	static void foreach() {
		nums.forEach(v->isPrime(v));
	}

	static void parallel() {
		nums.parallelStream().forEach(PS::isPrime);
	}

	static boolean isPrime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
