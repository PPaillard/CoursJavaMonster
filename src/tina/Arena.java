package tina;

public class Arena {

	public static void main(String[] args) {
		Monster dingo = new Monster("Dingo", 10, 50);
		Monster mickey = new Monster("Mickey", 10, 30);
		
		do {
			dingo.attack(mickey);
			if(mickey.getLife()>0)  mickey.attack(dingo);
		}
		while(dingo.getLife() > 0 && mickey.getLife() > 0);
		
	}

}
