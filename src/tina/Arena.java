package tina;

public class Arena {

	public static void main(String[] args) {
		Monster dingo = new Monster("Dingo", 10, 50);
		Monster mickey = new Monster("Mickey", 10, 30);
		
		do {
			dingo.attack(mickey);
			if(mickey.isAlive())  mickey.attack(dingo);
		}
		while(dingo.isAlive() && mickey.isAlive());
		
	}

}
