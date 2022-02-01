package classes;

public class MonsterCard extends Card {
	int att,def,level;

	public MonsterCard(String name, String type, String descr, String image, int att, int def, int level) {
		super(name, type, descr, image);
		this.att = att;
		this.def = def;
		this.level = level;
	}

	public MonsterCard(String name, String type, String descr,String image) {
		super(name, type, descr, image);
	}

	
	
	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "MonsterCard [att=" + att + ", def=" + def + ", level=" + level + "] " + descr;
	}
	
	public boolean attack() {return true;}
	
	public boolean defensePos() {return true;}
	
}
