package tina;

public class Monster {
	
	private String name;
	private Integer damage;
	private Integer life;
	
	public Monster(String name, Integer damage, Integer life) {
		this.name = name;
		this.damage = damage;
		this.life = life;
	}
	
	public void attack(Monster ennemy) {
		// On paramètre les points de vie restant de l'adversaire
		ennemy.setLife(ennemy.getLife() - this.getDamage());
		// si les points de vie sont supérieur à zéro
		if(ennemy.getLife() > 0)
			System.out.println(ennemy.getName() + " has "+ennemy.getLife() + " points remaining");
		else 
			System.out.println(ennemy.getName() + " is KO !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}
	
	

}
