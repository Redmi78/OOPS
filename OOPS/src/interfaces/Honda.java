package interfaces;

public class Honda implements Car {

	@Override
	public void ride() {
System.out.println("inside ride");			
	}

	@Override
	public void stop() {
		System.out.println("inside stop");			
	}

}
