
public class BregovicException extends Exception{

	public BregovicException(String msg, Throwable cause) {
		super("Bregovic's costum message", cause);
		
	}
	public BregovicException() {
	}
	
	
	public void comparison() throws BregovicException {
		Integer a = null;
		try {
			int b = a/a;
		} catch (NullPointerException e) {
			throw new BregovicException("", e);
		}
	}
	
}
