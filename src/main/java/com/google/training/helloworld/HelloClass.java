package com.google.training.helloworld;

public class HelloClass {
	public String message = "Hello World";

	public HelloClass() {
	}

	public HelloClass(String name) {
		this.message = "Hello " + name + "!";
	}

	public String getMessage() {
		return message;
	}

	// My code starts here
	public HelloClass(String name, String time) {
		this.message = "Good " + time + ", " + name + "!";
	}
}
