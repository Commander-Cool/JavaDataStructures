package assgn4;

import java.io.PrintStream;
import java.util.ArrayList;

public class ArrayStack {
	public static void main(String[] args) {
		Stack p = new Stack(null);
		add('c', p);
		add('b', p);
		pop(p);
		System.out.println(p);
	}

	static class Stack {
		ArrayList<String> c = new ArrayList<String>();

		Stack(final ArrayList<String> x) {
			this.c = x;
		}
	}

	static boolean isEmpty(Stack b) {
		if (b == null) {
			return true;
		} else
			return false;
	}

	static void add(final char a, final Stack l) {
		l.c = new ArrayList<String>();
		l.c.addAll(a, l.c);
	}

	static void pop(final Stack l) {
		l.c.remove(0);
	}

	static String top(final Stack l) {
		return l.c.get(0);
	}

	static void show(PrintStream p, Stack q) {
		p.print(q);
	}
}
