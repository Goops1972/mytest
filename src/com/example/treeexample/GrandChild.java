package com.example.treeexample;

public class GrandChild {

	private String grand;
	private String father;
	private String child;
	
	public GrandChild(String grandFather, String father, String child) {

		this.grand = grandFather;
		this.father = father;
		this.child = child;
	}

	public String getGrand() {
		return grand;
	}

	public void setGrand(String grand) {
		this.grand = grand;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

	
}
