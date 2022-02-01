package classes;

public class Card {
	
	String name, type, descr, image;

	public Card(String name, String type, String descr, String image) {
		super();
		this.name = name;
		this.type = type;
		this.descr = descr;
		this.image = image;
	}

	public Card() {
		super();
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", type=" + type + ", descr=" + descr + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean useCard() {return false;};
	
}
