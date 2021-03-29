
public class Application {

	
	public static void arrayException(String[] words) {
			int z = 10;
			try {
				System.out.println(words[z]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception1: "+e.getClass().getSimpleName());
				e.printStackTrace();
				System.out.print("\nException hangling of ");
				System.out.print(e.getClass().getSimpleName());
				System.out.println(" completed (Exception1)");
				System.out.println("\n####################\n");
			} finally {
				
			}
			
		
	}
	
	public static void numberException() {
		
		String name = "hallo";
		
		try {
			Double year = Double.parseDouble(name);
		} catch (NumberFormatException e) {
			System.out.println("Exception2: "+e.getClass().getSimpleName());
			e.printStackTrace();
			System.out.print("\nException hangling of ");
			System.out.print(e.getClass().getSimpleName());
			System.out.println(" completed (Exception2)");
			System.out.println("\n####################\n");
		}
		
	}
	
	public static void arethmeticException() {
		try {
			int a = 1 / 0;
			
		} catch (ArithmeticException e) {
			System.out.println("Exception3: "+e.getClass().getSimpleName());
			e.printStackTrace();
			System.out.print("\nException hangling of ");
			System.out.print(e.getClass().getSimpleName());
			System.out.println(" completed (Exception3)");
			System.out.println("\n####################\n");
		}
		
	}
	
	public static void classNotFoundException() {
		String anyName = "anyName";
		try {
			Class.forName(anyName);
		} catch (ClassNotFoundException e) {
			System.out.println("Exception4: "+e.getClass().getSimpleName());
			e.printStackTrace();
			System.out.print("\nException hangling of ");
			System.out.print(e.getClass().getSimpleName());
			System.out.println(" completed (Exception4)");
			System.out.println("\n####################\n");
		}
	}
	
	
	public static void main(String[] args) {
		String[] words = new String[10];
		
		arrayException(words);
		
		numberException();
	
		arethmeticException();
		
		classNotFoundException();
		
		BregovicException exc = new BregovicException("");
		try {
			exc.comparison();
		} catch (BregovicException e) {
			System.out.println("Exception5: "+e.getClass().getSimpleName());
			e.printStackTrace();
			System.out.print("\nException hangling of ");
			System.out.print(e.getClass().getSimpleName());
			System.out.println(" completed (Exception5)");
			System.out.println("\n####################");
			System.out.println("Programm execution finished :-)");
		}
		
	}

}
