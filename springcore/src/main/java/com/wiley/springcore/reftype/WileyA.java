package com.wiley.springcore.reftype;

public class WileyA {
	private int counta;
	private WileyB obj;
	public int getCounta() {
		return counta;
	}
	public void setCounta(int counta) {
		this.counta = counta;
	}
	public WileyB getObj() {
		return obj;
	}
	public void setObj(WileyB obj) {
		this.obj = obj;
	}
	public WileyA(int counta, WileyB obj) {
		super();
		this.counta = counta;
		this.obj = obj;
	}
	public WileyA() {
		super();
	}
	

}
