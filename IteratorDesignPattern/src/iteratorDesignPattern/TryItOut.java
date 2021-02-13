package iteratorDesignPattern;

public class TryItOut {
	public static void main(String[] args) {
		CarBank carBank = new CarBank();
		
		for(Iterator iteration = carBank.getTheIterator(); iteration.nextCar();) {
			String carName = (String)iteration.next();
			System.out.println("Car Brand and popular model : " + carName);
		}
	}



}
