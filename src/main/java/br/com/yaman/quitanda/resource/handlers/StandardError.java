package br.com.yaman.quitanda.resource.handlers;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private String msg;
	private Integer code;
	
	
	public StandardError(String msg, Integer code) {
		this.msg = msg;
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}

}
