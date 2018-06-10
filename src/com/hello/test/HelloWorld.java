package com.hello.test;

public class HelloWorld {
	
	private String message;
	private Balo balo;
	
	
	
	public Balo getBalo() {
		return balo;
	}

	public void setBalo(Balo balo) {
		this.balo = balo;
	}

	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		sayHello();
		return this.message;
		
	}
	public void sayHello(){
		System.out.println(message);
	}
	

}
