package fr.sg.foobarqix;

public class FooBarQixPrinterDefault implements FooBarQixPrinter {

	@Override
	public void print() {

		final String EOL = "\r\n";
		StringBuilder toPrint		= new StringBuilder();
		
		for(int i = 1; i <= 100; i++) {
			
			boolean divisibleBy3 = i % 3 == 0;
			boolean divisibleBy5 = i % 5 == 0;
			String strValue = String.valueOf(i);
			StringBuilder numberOutput = new StringBuilder(); 
			String twoDigitsStrValue = strValue.length() == 1 ? "0" + strValue : strValue;
			
			boolean[] positionOf3 = new boolean[] { Number.THREE.getValue().equals(twoDigitsStrValue.substring(0, 1)), Number.THREE.getValue().equals(twoDigitsStrValue.substring(1)) };
			boolean[] positionOf5 = new boolean[] { Number.FIVE.getValue().equals(twoDigitsStrValue.substring(0, 1)), Number.FIVE.getValue().equals(twoDigitsStrValue.substring(1)) };
			boolean[] positionOf7 = new boolean[] { Number.SEVEN.getValue().equals(twoDigitsStrValue.substring(0, 1)), Number.SEVEN.getValue().equals(twoDigitsStrValue.substring(1)) };
			
			if(divisibleBy3) {
				numberOutput.append(Label.FOO.getValue());
			}
			
			if(divisibleBy5) {
				numberOutput.append(Label.BAR.getValue());
			}
			
			for(int j = 0; j < 2; j++) {

				if(positionOf3[j]) {
					numberOutput.append(Label.FOO.getValue());
				}
				
				if(positionOf5[j]) {
					numberOutput.append(Label.BAR.getValue());
				}
				
				if(positionOf7[j]) {					
					numberOutput.append(Label.QIX.getValue());
				}
			}

			if(numberOutput.toString().isEmpty()) {				
				toPrint.append(strValue);
			}
			else {
				toPrint.append(numberOutput);
			}
			
			toPrint.append(EOL);
		}
		
		System.out.print(toPrint.toString().trim());
		
	}
}
