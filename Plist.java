package assgn4;

import java.io.PrintStream;

public class Plist {
	public static void main(String[] args) {
	}

	class PList {
		private char hd;
		private int priority;
		private PList tl;

		PList(final char a, final int b, final PList ll) {
			this.hd = a;
			this.priority = b;
			this.tl = ll;
		}

		public PList getPri() {
			return tl;
		}
	}

	public char next(PList b) {
		int pri = 0;
		char chr = 0;
		while (b.getPri() != null) {
			b = b.getPri();
			if (b.priority >= pri) {
				pri = b.priority;
				chr = b.hd;
			}
		}
		return chr;
	}

	@SuppressWarnings("null")
	public void deleteItem(PList b) {
		int pri = 0;
		while (b.getPri() != null) {
			if (b.priority >= pri) {
				pri = b.priority;
				b = b.getPri();
			}
			b.hd = (Character) null;
		}
	}

	public void insertItem(int priority, char a) {

	}

	public boolean isEmpty(PList b) {

		if (b == null) {
			return true;
		} else
			return false;
	}

	public void show(PrintStream p) {

	}

}
