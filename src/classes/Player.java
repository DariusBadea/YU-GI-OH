package classes;

public class Player {

	Pack player_pack;
	int hp = 8000;
	String username;
	Card[] cards_in_hand = new Card[5];
	
	public Player(String username) {
		super();
		create_pack();
		this.username = username;
	}
	public Player() {
		super();
	}
	
	public Pack getPlayer_pack() {
		return player_pack;
	}
	public void setPlayer_pack(Pack player_pack) {
		this.player_pack = player_pack;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Card[] getCards_in_hand() {
		return cards_in_hand;
	}
	public void setCards_in_hand(Card[] cards_in_hand) {
		this.cards_in_hand = cards_in_hand;
	}
	@Override
	public String toString() {
		return "Player " + username + ", hp=" + hp + ", noCards = " + player_pack.noCards;
	}
	
	public void create_pack() {
		Card[] cards = new Card[15];
		
		cards[0] = new MonsterCard("monster1", "MonsterCard", "trained","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg",15, 10, 1);
		cards[1] = new MonsterCard("monster2", "MonsterCard", "trained","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg", 14, 11, 1);
		cards[2] = new MonsterCard("monster3", "MonsterCard", "trained","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg", 16, 12, 1);
		cards[3] = new MonsterCard("monster4", "MonsterCard", "trained", "C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg",15, 10, 1);
		cards[4] = new MonsterCard("monster5", "MonsterCard", "trained", "C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg",17, 8, 1);
		cards[5] = new MonsterCard("monster6", "MonsterCard", "well trained","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg", 20, 14, 2);
		cards[6] = new MonsterCard("monster7", "MonsterCard", "well trained", "C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg",21, 16, 2);
		cards[7] = new MonsterCard("monster8", "MonsterCard", "well trained","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg", 25, 13, 2);
		cards[8] = new MonsterCard("monster9", "MonsterCard", "best trained", "C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg",35, 20, 3);
		cards[9] = new MonsterCard("monster10", "MonsterCard", "best trained","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg", 35, 18, 3);
		cards[10] = new SpellCard("SpellCard1", "SpellCard", "lowers att by 5","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg");
		cards[11] = new SpellCard("SpellCard1", "SpellCard", "lowers att by 3","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg");
		cards[12] = new SpellCard("SpellCard1", "SpellCard", "kills level 2 monster","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg");
		cards[13] = new SpellCard("SpellCard1", "SpellCard", "kills level 1 monster","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg");
		cards[14] = new SpellCard("SpellCard1", "SpellCard", "reverses att with def","C:\\Users\\Darius\\eclipse-workspace\\ProiectP3\\icon.jpg");
		
			
		this.cards_in_hand[0] = cards[3];
		this.cards_in_hand[1] = cards[13];
		this.cards_in_hand[2] = cards[12];
		this.cards_in_hand[3] = cards[2];
		this.cards_in_hand[4] = cards[6];

		
		this.player_pack = new Pack(cards.length, cards);
		
		
		
	}

	
	
}
