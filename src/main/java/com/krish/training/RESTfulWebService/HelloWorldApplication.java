package com.krish.training.RESTfulWebService;

public class HelloWorldApplication {

	String msg;

	public HelloWorldApplication(String msg) {
		this.msg = msg;
	}

	public HelloWorldApplication() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return String.format("This is Hello World Application!", msg);
	}
}
