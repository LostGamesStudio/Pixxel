package io.pixxel.event;

public class EventException extends Exception {
	
	private final Throwable cause;
	
	public EventException(Throwable cause) {
		this.cause = cause;
	}
	
	public EventException() {
		cause = null;
	}
	
	public EventException(Throwable cause, String message) {
		super(message);
		this.cause = cause;
	}
	
	public EventException(String message) {
		super(message);
		cause = null;
	}
	
	@Override
	public Throwable getCause() {
		return cause;
	}
}
