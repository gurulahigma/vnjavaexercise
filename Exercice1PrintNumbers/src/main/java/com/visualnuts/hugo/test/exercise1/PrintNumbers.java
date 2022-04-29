package com.visualnuts.hugo.test.exercise1;

import java.util.stream.IntStream;

public class PrintNumbers implements VisualNutsNumberPrinter{
	private final int from;
	private final int to;
	
	public PrintNumbers(int from, int to) {
		this.from = from;
		this.to = to;
	}

	public void print() {
		IntStream.rangeClosed(from, to)
			.forEach(this::printWithRestrictions);
		
	}

}
