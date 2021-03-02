package fr.sg.foobarqix;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FooBarQixPrinterDefaultTest {

	static class TestPrint {
		
		private static FooBarQixPrinter printer;
		private PrintStream standardOut = System.out;
		private OutputStream outputStream;
		
		@BeforeAll
		static void init() {
			
			printer = new FooBarQixPrinterDefault();
		}
		
		@BeforeEach
		void setup() {
			
			outputStream = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outputStream));
		}
		
		@Test
		void testPrintOne() {
			
			printer.print();
			assertThat(outputStream.toString().trim(), startsWith("1"));
		}
		
		@Test
		void testPrintOneTwo() {
			
			printer.print();
			assertThat(outputStream.toString().trim(), equalTo("1\r\n2"));
		}
		
		@Test
		void testPrintOneTwoThree() {
			
			printer.print();
			assertThat(outputStream.toString().trim(), equalTo("1\r\n2\r\nFooFoo"));
		}
		
		@AfterEach
		void tearDown() {
			
			System.out.close();
			System.setOut(standardOut);			
		}
	}
}
