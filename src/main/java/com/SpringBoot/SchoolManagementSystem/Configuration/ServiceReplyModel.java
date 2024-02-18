package com.SpringBoot.SchoolManagementSystem.Configuration;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ServiceReplyModel  implements Serializable{
	private Object model;
	private Map otherMap;
	private List<String> errMsg;
	private String message;
	private boolean warning =false;
	public Object getModel() {
		return model;
	}
	public void setModel(Object model) {
		this.model = model;
	}
	public Map getOtherMap() {
		return otherMap;
	}
	public void setOtherMap(Map otherMap) {
		this.otherMap = otherMap;
	}
	public List<String> getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(List<String> errMsg) {
		this.errMsg = errMsg;
	}
	public boolean isWarning() {
		return warning;
	}
	public void setWarning(boolean warning) {
		this.warning = warning;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
