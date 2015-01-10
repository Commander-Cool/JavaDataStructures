package assgn4;

import java.io.PrintStream;

public interface Stack {
	Stack c = null;
	void pop(Stack l);
	void push(char a, Stack l);
	boolean isEmpty(Stack b);
	void show(PrintStream p, Stack q);
	char top(Stack l);

}
