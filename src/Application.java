
public class Application {
	public static int i = 1;

	
	public static void arrayException(String[] words) {
			int z = 10;
			try {
				System.out.println(words[z]);
			} catch (ArrayIndexOutOfBoundsException e) {
				printingExeption(e);
			} finally {
				
			}
			
		
	}
	
	public static void numberException() {
		
		String name = "hallo";
		
		try {
			Double year = Double.parseDouble(name);
		} catch (NumberFormatException e) {
			printingExeption(e);
		}
		
	}
	
	public static void arethmeticException() {
		try {
			int a = 1 / 0;
			
		} catch (ArithmeticException e) {
			printingExeption(e);
		}
		
	}
	
	public static void classNotFoundException() {
		String anyName = "anyName";
		try {
			Class.forName(anyName);
		} catch (ClassNotFoundException e) {
			printingExeption(e);
		}
	}
	
	public static void printingExeption(Exception e) {
		System.out.println("Exception"+i+": "+e.getClass().getSimpleName());
		e.printStackTrace();
		System.out.print("\nException hangling of ");
		System.out.print(e.getClass().getSimpleName());
		System.out.println(" completed (Exception"+i+")");
		System.out.println("\n####################\n");
		i++;
	}
	
	
	public static void main(String[] args) {
		String[] words = new String[10];
	
		arrayException(words);
		
		numberException();
		
		arethmeticException();
		
		classNotFoundException();
		
		BregovicException exc = new BregovicException();
		try {
			exc.comparison();
		} catch (BregovicException e) {
			printingExeption(e);
		}
		System.out.println("Programm execution finished :-)");
	}

}
