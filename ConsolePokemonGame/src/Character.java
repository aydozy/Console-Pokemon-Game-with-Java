
public class Character {
	protected String name;
	protected int power;
	protected int defencePower;
	protected int healAmount;
	protected boolean hasBoost;
	protected int specialAmount;

	public Character(String name, int power, int healAmount, boolean hasBoost) {
		this.name = name;
		this.power = power;
		this.healAmount = healAmount;
		this.hasBoost = hasBoost;
		this.specialAmount = 2;
	}

	public void hit(Player enemy) {
		this.printAttackDetail();
		if((int)(Math.random()*10) < 2) {
			enemy.setHealth(enemy.getHealth() - this.power*3/2);
		}else {
			enemy.setHealth(enemy.getHealth() - this.power);
		}
		enemy.setHealth(enemy.getHealth() - this.power);
	}
	
	public void hitCritical(Player enemy) {
		this.printAttackDetail();
		if((int)Math.round( Math.random())==1) {
			enemy.setHealth(enemy.getHealth() - this.power*2);
		}
	}

	protected void setPower(int power) {
		this.power = power;
	}

	protected int getPower() {
		return power;
	}
	
	protected void setHasBoostFalse() {
		hasBoost = false;
	}
	
	protected int getHealAmount() {
		return healAmount;
	}
	
	protected int getSpecialAmount() {
		return specialAmount;
	}
	
	protected void decreaseSpecialAmount() {
		specialAmount--;
	}
	
	protected void decreaseHealAmount() {
		healAmount = healAmount/2;
	}

	public void printAttackDetail() {
		System.out.println("Character name : " + this.name);
		System.out.println("Power : " + this.power);
		System.out.println("Boostable :" + (hasBoost));
		System.out.println("--------------");
	}

}


