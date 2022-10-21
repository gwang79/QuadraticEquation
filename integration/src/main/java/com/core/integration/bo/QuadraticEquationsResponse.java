package com.core.integration.bo;

public class QuadraticEquationsResponse {
	public QuadraticEquationsResponse(String root, String status, int code) {
		super();
		this.root = root;
		this.status = status;
		this.code = code;
	}

	String root;
	String status;
	int code;

	public String getRoot() {
		return root;
	}

//	public void setRoot(String root) {
//		this.root = root;
//	}

	public String getStatus() {
		return status;
	}

//	public void setStatus(String status) {
//		this.status = status;
//	}

//	public int getCode() {
//		return code;
//	}
//
//	public void setCode(int code) {
//		this.code = code;
//	}


	
}
