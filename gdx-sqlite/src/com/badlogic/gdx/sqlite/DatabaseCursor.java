
package com.badlogic.gdx.sqlite;

/**
 *  This public interface contains all the methods to expose results from a query on a SQLiteDatabase. This is not thread-safe.
 *  Extended by Angel Biedma to support get values using a column name.
 * @author M Rafay Aleem
 */
public interface DatabaseCursor {

	/** Returns the value of the requested column as a byte array.
	 * @param columnIndex the zero-based index of the target column.
	 * @return the value of that column as a byte array. */
	public byte[] getBlob (int columnIndex);

	/**
	 * Returns the value of the requested column as a byte array.
	 * @param columnName name of column in database
	 * @return the value of that column as a byte array.
	 */
	public byte[] getBlob (String columnName);

	/** Returns the value of the requested column as a double.
	 * @param columnIndex the zero-based index of the target column.
	 * @return the value of that column as a double. */
	public double getDouble (int columnIndex);

	/** Returns the value of the requested column as a double.
	 * @param columnName name of column in database
	 * @return the value of that column as a double. */
	public double getDouble (String columnName);

	/** Returns the value of the requested column as a float.
	 * @param columnIndex the zero-based index of the target column.
	 * @return the value of that column as a float. */
	public float getFloat (int columnIndex);

	/** Returns the value of the requested column as a float.
	 * @param columnName name of column in database
	 * @return the value of that column as a float. */
	public float getFloat (String columnName);

	/** Returns the value of the requested column as a int.
	 * @param columnIndex the zero-based index of the target column.
	 * @return the value of that column as a int. */
	public int getInt (int columnIndex);

	/** Returns the value of the requested column as a int.
	 * @param columnName name of column in database
	 * @return the value of that column as a int. */
	public int getInt (String columnName);

	/** Returns the value of the requested column as a long.
	 * @param columnIndex the zero-based index of the target column.
	 * @return the value of that column as a long. */
	public long getLong (int columnIndex);

	/** Returns the value of the requested column as a long.
	 * @param columnName name of column in database
	 * @return the value of that column as a long. */
	public long getLong (String columnName);

	/** Returns the value of the requested column as a short.
	 * @param columnIndex the zero-based index of the target column.
	 * @return the value of that column as a short. */
	public short getShort (int columnIndex);

	/** Returns the value of the requested column as a short.
	 * @param columnName name of column in database
	 * @return the value of that column as a short. */
	public short getShort (String columnName);

	/** Returns the value of the requested column as a string.
	 * @param columnIndex the zero-based index of the target column.
	 * @return the value of that column as a string. */
	public String getString (int columnIndex);

	/** Returns the value of the requested column as a string.
	 * @param columnName name of column in database
	 * @return the value of that column as a string. */
	public String getString (String columnName);

	/** Move the cursor to the next row.
	 * @return whether the move was successful. */
	public boolean next ();

	/** Returns the numbers of rows in the cursor.
	 * @return number of rows */
	public int getCount ();

	/** Closes the Cursor, releasing all of its resources and making it completely invalid. */
	public void close ();

	/** Repositions the cursor to the index provided */
	public void reposition (int columnIndex);

}
