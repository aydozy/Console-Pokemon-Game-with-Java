
public class Bulbasaur extends Character implements Boostable {

	public static final int CONST_POWER;
	public static final int CONST_HEAL_AMOUNT;
	
	static {
		CONST_POWER = (int) (Math.random() * 10 + 20);
		CONST_HEAL_AMOUNT = (int) (Math.random() * 10 + 5);
	}

	public Bulbasaur() {
		super("Bulbasar", CONST_POWER, CONST_HEAL_AMOUNT, true);
	}

	@Override
	public void boost() {		
		if(hasBoost) {
			this.setPower(this.getPower() * 2);
		}
	}

	@Override
	public void special() {
		this.setPower(this.getPower() * 2);
		
	}
}
