package io.javabrains.unit1;

public class HelloWorldGreeting {

	/*@Override
	public void perform() {
		System.out.print("Hello world!");

	}*/

	public static void main(String[] a) {

		Greeting greeting = () -> System.out.println("asdfdsa");
		greeting.perform();

	}

}
