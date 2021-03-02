package fr.sg.foobarqix;

public enum Label {

	FOO("Foo"), BAR("Bar"), QIX("Qix");
	
	private String value;
	
	private Label(String value) {
		
		this.value = value;
	}
	
	public String getValue() {
		
		return this.value;
	}
}
