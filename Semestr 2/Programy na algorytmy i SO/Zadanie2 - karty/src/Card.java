import java.util.Random;

public class Card {
	int value = -1;
	int color = -1;
	boolean hidden = false;
	
	String[] names = new String[]{"As", "2", "3", "4", "5", "6", "7", "8", "9", "10",
									"Walet", "Dama", "Kr�l", "()"};
	String[] types = new String[]{"kier", "karo", "trefl", "pik"};
	Random generator = new Random();
	
	public Card(){
		generate();
	}
	
	
	
	private void generate(){
		value = generator.nextInt(15);
		if(value == 14){
			hidden = true;
		}
		color = generator.nextInt(4);
	}
	
	public String toString(){
		String name;
		if(value != 14){
			name = names[value-1] + " " + types[color];
			return name;
		}	
	
		return name = "";	
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}