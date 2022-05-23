package exceptions;

/**
 * Represents a duplicate element in the sets within the graph
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class DuplicateElementException extends RuntimeException
{
    /**
     * Creates a new exception with message.
     * @param message description of the error that occurred
     */
    public DuplicateElementException(String message)
    {
        super(message);
    }
}
