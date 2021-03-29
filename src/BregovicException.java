
public class BregovicException extends Exception{

	public BregovicException(String msg) {
		super(msg);
	}
	
	
	public void comparison() throws BregovicException {
		
		throw new BregovicException("Bregovic's costum message");
	}
}
