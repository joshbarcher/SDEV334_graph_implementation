package exceptions;
/**
 * Represents an unexpected missing vertex element within the graph
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class NoSuchVertexException extends RuntimeException
{
    /**
     * Creates a new exception with message.
     * @param message description of the error that occurred
     */
    public NoSuchVertexException(String message)
    {
        super(message);
    }
}
