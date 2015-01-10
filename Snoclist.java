package assgn4;

import java.io.PrintStream;

public class Snoclist {
	public static void main(String[] args) {
		SnocList y = new SnocList('n', null);
		SnocList x = new SnocList('b', y);
		dequeue(x);
		System.out.println(x);

	}

	static class SnocList {
		private char c;
		private SnocList l;

		SnocList(char c, SnocList l) {
			this.c = c;
			this.l = l;
		}

		public SnocList getElement() {
			return l;
		}
	}

	public char peek(SnocList l) {
		return l.c;
	}

	public static void dequeue(SnocList list) {
		while (list.getElement() != null) {
			list = list.getElement();
		}
	}

	public void enqueue(SnocList g, char m) {
		g.c = m;
	}

	public boolean isEmpty(SnocList b) {
		if (b == null) {
			return true;
		} else
			return false;
	}

	public void show(PrintStream p) {

	}

}
