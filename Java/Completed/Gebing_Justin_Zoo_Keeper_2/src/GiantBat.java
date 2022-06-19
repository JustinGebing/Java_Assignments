
public class GiantBat extends Animal {
	public void fly() {
		this.energy -= 50;
		if(this.energy > 0) {
			System.out.printf("Whoosh!\n Energy now at %s \n", this.energy);
		}
		else if(this.energy < 0) {
			this.energy = 0;
			System.out.print("The Giant Bat needs to Reenergize.\n");
		}
	}
	
	public void eatHumans() {
		this.energy += 25;
		if(this.energy > 0) {
				if(this.energy > 300) {
					this.energy = 300;
					System.out.printf("The Giant Bat is at MAXIMUM power(%s energy)!!!!\n", this.energy);
				}
				else if(this.energy < 300) {
					System.out.printf("Eats. Human. Yummy, yummy!\n Energy now at %s\n", this.energy);
				}
		}
		
		else if(this.energy < 0) {
			this.energy = 0;
			System.out.print("The Giant Bat needs to Reenergize.\n");
		}
		
	}
	
	public void attackTown() {
		this.energy -= 100;
		if(this.energy > 0) {
			System.out.printf("KERPLOW The town is in SHAMBLES!!!\n Energy now at %s\n", this.energy);
		}
		else if(this.energy < 0) {
			this.energy = 0;
			System.out.print("The Giant Bat needs to Reenergize.\n");
		}
	}
}