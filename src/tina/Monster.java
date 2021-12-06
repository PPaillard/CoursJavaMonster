package tina;

public class Monster {
	
	private String name;
	private Integer damage;
	private Integer life;
	private Boolean alive;
	
	public Monster(String name, Integer damage, Integer life) {
		this.name = name;
		this.damage = damage;
		this.life = life;
		this.alive = true;
	}
	
	public void attack(Monster ennemy) {
		// On paramètre les points de vie restant de l'adversaire
		ennemy.setLife(ennemy.getLife() - this.getDamage());
		// si les points de vie sont supérieur à zéro
		if(ennemy.isAlive())
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
		if(life <= 0) this.alive = false;
		else this.alive = true;
	}

	public Boolean isAlive() {
		return alive;
	}
	
	

}
