package spring.data.jpa.exception;

/**
 * Created by Praneeth on 9/8/2015.
 */
public class RequestedResourceNotFoundException extends RuntimeException {
    public RequestedResourceNotFoundException() {
        super();
    }

    public RequestedResourceNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public RequestedResourceNotFoundException(final String message) {
        super(message);
    }

    public RequestedResourceNotFoundException(final Throwable cause) {
        super(cause);
    }

}
