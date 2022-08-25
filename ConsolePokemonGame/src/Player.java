public class Player {
	
	private String name;
	private int health = 100;
	private Character[] characters;
	private int currentCharacterIndice = 0;

	public Character getNextCharacter() {
		if (currentCharacterIndice == 2) {
			currentCharacterIndice = 0;
		}
		return characters[currentCharacterIndice++];
	}

	public Player(String name) {
		this.name = name;
	}

	public void setCharacters(Character[] characters) {
		this.characters = characters;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void printInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Health :" + this.health);
		System.out.println("Alive : " + this.isAlive());
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		return this.health > 0;
	}

	public String getName() {
		return name;
	}

}