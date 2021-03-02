package fr.sg.foobarqix;

public enum Label {

	FOO("Foo"), BAR("Bar");
	
	private String value;
	
	private Label(String value) {
		
		this.value = value;
	}
	
	public String getValue() {
		
		return this.value;
	}
}
