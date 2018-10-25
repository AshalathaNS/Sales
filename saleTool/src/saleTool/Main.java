package saleTool;

public class Main {
	public static void main(String[] args) {
		
		SalesData salesData =new SalesData();
		
		displayGreeting();
        salesData.display();
	}

	private static void displayGreeting() {
      System.out.println("Happy Sales");
      System.out.println("Sales data");
	
	  System.out.println("Test-1");
	}
}
