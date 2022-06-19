
public class AnimalTest {

	public static void main(String[] args) {
		GiantBat gb = new GiantBat();
		
		gb.displayEnergy("Giant Bat");
		gb.fly();
		gb.eatHumans();
		gb.attackTown();
		gb.fly();
		gb.attackTown();
		gb.eatHumans();
		gb.attackTown();
		gb.displayEnergy("Giant Bat");
	}

}
