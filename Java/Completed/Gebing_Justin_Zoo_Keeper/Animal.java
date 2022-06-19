
public class Animal {
	protected int energy = 100;
	
	public void displayEnergy(String animal) {
		System.out.printf("The %s currently has %s energy. \n", animal, this.energy);
	}
}
