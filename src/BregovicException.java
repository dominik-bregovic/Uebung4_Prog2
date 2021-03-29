
public class BregovicException extends Exception{

	public BregovicException(String msg) {
		super("Bregovic's costum message");
	}
	
	
	public void comparison() throws BregovicException {
		throw new BregovicException("");
	}
	
}
