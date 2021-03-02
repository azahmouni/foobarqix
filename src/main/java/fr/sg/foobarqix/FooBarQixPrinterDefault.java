package fr.sg.foobarqix;

public class FooBarQixPrinterDefault implements FooBarQixPrinter {

	@Override
	public void print() {

		final String EOL = "\r\n";
		
		boolean divisibleBy3	= false;
		boolean divisibleBy5	= false;
		int positionOf3			= -1;
		int positionOf5			= -1;
		int positionOf7			= -1;
		StringBuilder toPrint	= new StringBuilder();		
		String strValue			= "";
		boolean printTheNumber = true;
		
		for(int i = 1; i <= 7; i++) {
			
			printTheNumber = true;
			divisibleBy3 = i % 3 == 0;
			divisibleBy5 = i % 5 == 0;
			strValue = String.valueOf(i);
			positionOf3 = strValue.indexOf(Number.THREE.getValue());
			positionOf5 = strValue.indexOf(Number.FIVE.getValue());
			positionOf7 = strValue.indexOf(Number.SEVEN.getValue());
			
			if(divisibleBy3) {
				
				printTheNumber = false;
				toPrint.append(Label.FOO.getValue());
			}
			
			if(divisibleBy5) {
				
				printTheNumber = false;
				toPrint.append(Label.BAR.getValue());
			}
			
			if(positionOf3 >= 0) {
				
				printTheNumber = false;
				toPrint.append(Label.FOO.getValue());
			}
			
			if(positionOf5 >= 0) {
				
				printTheNumber = false;
				toPrint.append(Label.BAR.getValue());
			}
			
			if(positionOf7 >= 0) {
				
				printTheNumber = false;
				toPrint.append(Label.QIX.getValue());
			}

			if(printTheNumber) {
				
				toPrint.append(strValue);				
			}
			
			toPrint.append(EOL);
		}
		
		System.out.print(toPrint.toString().trim());
		
	}
}
