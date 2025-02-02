package com.koRail.common.to;

/*공통*/
public class CommonBean {
	private String rtCode;		  /*에러코드*/
	private String rtMsg;		  /*에러메세지*/
	
	private String srcType;		  /*검색유형*/
	private String srcText;		  /*검색어*/
	
	private String state;		  /*상태 : insert, update, delete*/
	
	private String register;	  /*등록자*/
	private String rgsde;		  /*등록일*/
	private String updUsr;		  /*수정자*/
	private String updde;		  /*수정일*/
								  
	private String seCode;		  /*구분코드*/
	private String cmmnCode;	  /*공통코드*/
	private String cmmnCodeValue; /*공토코드 값*/
	
	public String getRtCode() {
		return rtCode;
	}
	public void setRtCode(String rtCode) {
		this.rtCode = rtCode;
	}
	public String getRtMsg() {
		return rtMsg;
	}
	public void setRtMsg(String rtMsg) {
		this.rtMsg = rtMsg;
	}
	public String getSrcType() {
		return srcType;
	}
	public void setSrcType(String srcType) {
		this.srcType = srcType;
	}
	public String getSrcText() {
		return srcText;
	}
	public void setSrcText(String srcText) {
		this.srcText = srcText;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRgsde() {
		return rgsde;
	}
	public void setRgsde(String rgsde) {
		this.rgsde = rgsde;
	}
	public String getupdUsr() {
		return updUsr;
	}
	public void setupdUsr(String updUsr) {
		this.updUsr = updUsr;
	}
	public String getUpdde() {
		return updde;
	}
	public void setUpdde(String updde) {
		this.updde = updde;
	}
	public String getSeCode() {
		return seCode;
	}
	public void setSeCode(String seCode) {
		this.seCode = seCode;
	}
	public String getCmmnCode() {
		return cmmnCode;
	}
	public void setCmmnCode(String cmmnCode) {
		this.cmmnCode = cmmnCode;
	}
	public String getCmmnCodeValue() {
		return cmmnCodeValue;
	}
	public void setCmmnCodeValue(String cmmnCodeValue) {
		this.cmmnCodeValue = cmmnCodeValue;
	}
}