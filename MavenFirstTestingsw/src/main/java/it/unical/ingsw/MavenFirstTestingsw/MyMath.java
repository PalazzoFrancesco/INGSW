package it.unical.ingsw.MavenFirstTestingsw;

import javax.sql.rowset.spi.TransactionalWriter;

public class MyMath {

	// QUESTA è UNA DOCUMENTAZIONE
	/**
	 * Computes the fibonacci values at position index
	 * @param index position in the fibonacci sequence
	 * @return the fibonacci value
	 */
	public int fibonacci(int i)
	{
		if (i < 0)
			throw new IllegalArgumentException();
		if (i == 1 || i == 0)
			return 1;
		return fibonacci(i - 1) + fibonacci(i - 2); 
	}
}
