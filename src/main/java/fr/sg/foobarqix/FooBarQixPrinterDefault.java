package fr.sg.foobarqix;

public class FooBarQixPrinterDefault implements FooBarQixPrinter {

	@Override
	public void print() {

		final String EOL = "\r\n";
		
		boolean divisibleBy3	= false;
		int positionOf3			= -1;
		StringBuilder toPrint	= new StringBuilder();		
		String strValue			= "";
		boolean printTheNumber = true;
		
		for(int i = 1; i <= 4; i++) {
			
			printTheNumber = true;
			divisibleBy3 = i % 3 == 0;
			strValue = String.valueOf(i);
			positionOf3 = strValue.indexOf(Number.THREE.getValue());
			
			if(divisibleBy3) {
				
				printTheNumber = false;
				toPrint.append(Label.FOO.getValue());
			}
			
			if(positionOf3 >= 0) {
				
				printTheNumber = false;
				toPrint.append(Label.FOO.getValue());
			}			

			if(printTheNumber) {
				toPrint.append(strValue);				
			}
			
			toPrint.append(EOL);
		}
		
		System.out.print(toPrint.toString().trim());
		
	}
}
