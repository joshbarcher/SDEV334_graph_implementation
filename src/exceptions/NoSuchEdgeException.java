package exceptions;
/**
 * Represents an unexpected missing edge element within the graph
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class NoSuchEdgeException extends RuntimeException
{
    /**
     * Creates a new exception with message.
     * @param message description of the error that occurred
     */
    public NoSuchEdgeException(String message)
    {
        super(message);
    }
}
