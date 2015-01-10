package assgn4;

public class List {
	public static void main(String[] args) {
		Stack p = null;
		add('c', p);
		add('b', p);
		pop(p);
		System.out.println(p);
	}

	static class List1 {
		char hd;
		List1 tl;

		List1(final char x, final List1 y) {
			this.hd = x;
			this.tl = y;
		}
	}

	static class Stack {
		List1 c;

		Stack(final List1 x) {
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
		l.c = new List1(a, l.c);
	}

	static void pop(final Stack l) {
		l.c = l.c.tl;
	}

	static int top(final Stack l) {
		return l.c.hd;
	}
}
