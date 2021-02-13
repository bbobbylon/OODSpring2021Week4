package iteratorDesignPattern;

public class CarBank implements Container {
	// an array of cars/car types, not an ArrayList
	public String [] carNames = {"Mazda CX-5", "Honda CRV", "Escalade ESV", "Toyota Tacoma", "GMC Buick", "Chevy Silverado", "Mercedes Benz 550", "LAMBORGHINI BABY" };
	
	@Override
	public Iterator getTheIterator() {
		return new CarNameIterator();
	}
	
	private class CarNameIterator implements Iterator{
		int carIndex;
		@Override 
		public boolean nextCar() {
			if(carIndex < carNames.length) {
				return true;
				
			}
			
			return false;
			
		}
		
		@Override
		public Object next() {
			if(this.nextCar()) {
				return carNames[carIndex++];
			}
			return null;
		}
	}

}
