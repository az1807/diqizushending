package com.FanDian.entity;

public class XinWenLeiB {
	private int id;
	private String leib;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeib() {
		return leib;
	}

	public void setLeib(String leib) {
		this.leib = leib;
	}

	public XinWenLeiB(int id, String leib) {
		super();
		this.id = id;
		this.leib = leib;
	}

	public XinWenLeiB() {

	}

	@Override
	public String toString() {
		return "XinWenLeiB [id=" + id + ", leib=" + leib + "]";
	}

}
