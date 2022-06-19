
public class Gorilla extends Animal {
	public void throwSomething() {
		this.energy -= 5;
		System.out.print("The Gorilla threw something and now has " + this.energy + " energy. \n");
	
	}
	
	public void eatBananas() {
		this.energy += 10;
			if(this.energy > 100) {
				this.energy = 100;
				System.out.printf("The Gorilla is at MAXIMUM power(%s energy)!!!! \n", this.energy);
			}
			else if(this.energy < 100) {
				System.out.print("The Gorilla ate something and now has " + this.energy + " energy. \n");
			}
		}
	
	public void climbSomething() {
		this.energy -= 10;
		System.out.print("The Gorilla climbed something and now has " + this.energy + " energy. \n");
	}
}
