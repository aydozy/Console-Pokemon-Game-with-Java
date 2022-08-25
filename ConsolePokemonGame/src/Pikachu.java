public class Pikachu extends Character implements Boostable {
	public static final int CONST_POWER;
	public static final int CONST_HEAL_AMOUNT;

	public Pikachu() {
		super("Pikachu", CONST_POWER, CONST_HEAL_AMOUNT, true);
	}

	static {
		CONST_POWER = (int) (Math.random() * 10) + 5;
		CONST_HEAL_AMOUNT = (int) (Math.random() * 10 + 20);
	}

	public void boost() {
		if (hasBoost) {
			this.setPower(this.getPower() * 2);
		}
	}

	public void special() {
		this.setPower(this.getPower() * 2);
	}
}