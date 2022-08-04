package entities;

public class Champion {
	// atributos da Classe
	private String name;
	private int life;
	private int attack;
	private int armor;

	// Construtor

	public Champion(String nome, int vida, int ataque, int armadura) {
		this.name = nome;
		this.life = vida;
		this.attack = ataque;
		this.armor = armadura;
	}

	// metodos Get e Set

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	// metodos

	public void takeDamage(Champion other) {
		int damage;
		if (armor > other.getAttack()) {
			damage = 1;
		} else {
			damage = other.getAttack() - armor;
		}

		life -= damage;

		if (life < 0) {
			life = 0;
		}
	}

	public String status() {

		if (life == 0) {
			return name + ": " + life + " de vida (morreu)";

		} else {
			return name + ": " + life + " de vida";
		}

	}

}