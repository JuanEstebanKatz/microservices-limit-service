package com.demo.microservices.limitsservice.bean;

public class LimitsConfiguration {
	
	private int maximun;
	private int minimun;

	protected LimitsConfiguration() {

	}

	public int getMaximun() {
		return maximun;
	}

	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}

	public int getMinimun() {
		return minimun;
	}

	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}

	public LimitsConfiguration(int maximun, int minimun) {
		super();
		this.maximun = maximun;
		this.minimun = minimun;
	}

}
