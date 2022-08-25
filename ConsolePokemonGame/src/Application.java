import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Player1's Name:  ");
		String firstPlayer = sc.nextLine();

		System.out.print("Player2's Name:  ");
		String secondPlayer = sc.nextLine();

		Player player1 = new Player(firstPlayer);
		Player player2 = new Player(secondPlayer);

		System.out.println("1- Pikachu 2-Charmander 3-Bulbasaur");
		System.out.print("Pick a Pokemon for first game for Player1 : ");
		String choose = sc.next();
		Character character = makeChoise(choose);
		while(character == null){
			System.out.println("Please pick valid Pokemon!");
			choose = sc.next();
			character = makeChoise(choose);
		}
		Character[] player1Characters = new Character[2];
		player1Characters[0] = character;
		player1.setCharacters(player1Characters);
		

		System.out.print("Pick a Pokemon for first game for Player2 : ");
		
		Character[] player2Characters = new Character[2];
		
		choose = sc.next();
		character = makeChoise(choose);
		while(character == null){
			System.out.println("Please pick valid Pokemon!");
			choose = sc.next();
			character = makeChoise(choose);
		}
		player2Characters[0] = makeChoise(choose);

		player2.setCharacters(player2Characters);
		
		PokemonGame game1 = new PokemonGame(player1, player2);
		game1.start();
		
		System.out.println("**************************************************");
		
		System.out.print("Pick a Pokemon for second game for Player1 : ");
		choose = sc.next();
		character = makeChoise(choose);
		while(character == null){
			System.out.println("Please pick valid Pokemon!");
			choose = sc.next();
			character = makeChoise(choose);
		}
		player1Characters[1] = makeChoise(choose);
		player1.setHealth(100);
		player1.setCharacters(player1Characters);		
		
		
		System.out.print("Pick a Pokemon for second game for Player2 : ");
		choose = sc.next();
		character = makeChoise(choose);
		while(character == null){
			System.out.println("Please pick valid Pokemon!");
			choose = sc.next();
			character = makeChoise(choose);
		}
		player2Characters[1] = makeChoise(choose);
		player2.setHealth(100);
		player2.setCharacters(player2Characters);
		
		PokemonGame game2 = new PokemonGame(player1, player2);
		game2.start();

	}

	private static Character makeChoise(String choise) {
		switch (choise) {
		case "1": {
			return new Pikachu();
		}
		case "2": {
			return new Charmander();
		}
		case "3": {
			return new Bulbasaur();
		}
		default:
			return null;
		}
	}
}