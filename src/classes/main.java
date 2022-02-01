package classes;

public class main {
	
	public static void main(String[] args) {
	Card a = new MonsterCard("first", "MonsterCard", "nice","C:\\\\Users\\\\Darius\\\\eclipse-workspace\\\\ProiectP3\\\\icon.jpg",50,50,1);

	Player b = new Player("Mihai");
	
	Card to_add = new SpellCard("Spell8", "SpellCard", "instant win", "C:\\\\Users\\\\Darius\\\\eclipse-workspace\\\\ProiectP3\\\\icon.jpg");
	b.player_pack.addCard(to_add);
	
	System.out.println(b);
	}
	
}
