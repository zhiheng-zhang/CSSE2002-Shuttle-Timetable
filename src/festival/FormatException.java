package festival;

/**
 * An exception indicating an invalid file format.
 */
@SuppressWarnings("serial")
public class FormatException extends Exception {

	/**
	 * Constructs a new exception with null as its detail message.
	 */
	public FormatException() {
		super();
	}

	/**
	 * Constructs a new exception with the specified detail message.
	 */
	public FormatException(String message) {
		super(message);
	}
}
