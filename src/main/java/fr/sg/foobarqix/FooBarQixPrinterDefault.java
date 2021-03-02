package fr.sg.foobarqix;

public class FooBarQixPrinterDefault implements FooBarQixPrinter {

	@Override
	public void print() {

		final String EOL = "\r\n";
		
		boolean divisibleBy3		= false;
		boolean divisibleBy5		= false;
		boolean[] positionOf3;
		boolean[] positionOf5;
		boolean[] positionOf7;
		StringBuilder toPrint		= new StringBuilder();
		String strValue				= "";
		String twoDigitsStrValue	= "";
		boolean printTheNumber = true;
		
		for(int i = 1; i <= 59; i++) {
			
			printTheNumber = true;
			divisibleBy3 = i % 3 == 0;
			divisibleBy5 = i % 5 == 0;
			strValue = String.valueOf(i);			
			twoDigitsStrValue = strValue.length() == 1 ? "0" + strValue : strValue;
			
			positionOf3 = new boolean[] { Number.THREE.getValue().equals(twoDigitsStrValue.substring(0, 1)), Number.THREE.getValue().equals(twoDigitsStrValue.substring(1)) };
			positionOf5 = new boolean[] { Number.FIVE.getValue().equals(twoDigitsStrValue.substring(0, 1)), Number.FIVE.getValue().equals(twoDigitsStrValue.substring(1)) };
			positionOf7 = new boolean[] { Number.SEVEN.getValue().equals(twoDigitsStrValue.substring(0, 1)), Number.SEVEN.getValue().equals(twoDigitsStrValue.substring(1)) };
			
			if(divisibleBy3) {
				
				printTheNumber = false;
				toPrint.append(Label.FOO.getValue());
			}
			
			if(divisibleBy5) {
				
				printTheNumber = false;
				toPrint.append(Label.BAR.getValue());
			}
			
			if(positionOf3[0]) {
				
				printTheNumber = false;
				toPrint.append(Label.FOO.getValue());
			}
			
			if(positionOf5[0]) {
				
				printTheNumber = false;
				toPrint.append(Label.BAR.getValue());
			}
			
			if(positionOf7[0]) {
				
				printTheNumber = false;
				toPrint.append(Label.QIX.getValue());
			}
			
			if(positionOf3[1]) {
				
				printTheNumber = false;
				toPrint.append(Label.FOO.getValue());
			}
			
			if(positionOf5[1]) {
				
				printTheNumber = false;
				toPrint.append(Label.BAR.getValue());
			}
			
			if(positionOf7[1]) {
				
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
