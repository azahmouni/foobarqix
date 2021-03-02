package fr.sg.foobarqix;

public enum Number {
	
	THREE("3"), FIVE("5"), SEVEN("7");
	
	private String value;
	
	private Number(String value) {
		
		this.value = value;
	}
	
	public String getValue() {
		
		return this.value;
	}
}
