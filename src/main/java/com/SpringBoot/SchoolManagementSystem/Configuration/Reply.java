package com.SpringBoot.SchoolManagementSystem.Configuration;

import java.util.ArrayList;
import java.util.Map;

public class Reply {
	public static final short ERROR =0;
	public static final short INFO =1;
	public static final short WARNING=2;
	
	private Object data;
	private short flag =INFO;
	private String token;
	private String message;
	private Map otherInfo;
	private ArrayList<String> msgflds;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public short getFlag() {
		return flag;
	}
	public void setFlag(short flag) {
		this.flag = flag;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Map getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(Map otherInfo) {
		this.otherInfo = otherInfo;
	}
	public ArrayList<String> getMsgflds() {
		return msgflds;
	}
	public void setMsgflds(ArrayList<String> msgflds) {
		this.msgflds = msgflds;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
