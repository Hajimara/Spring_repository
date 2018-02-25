package org.web.service.domain;

public class UserVO {

	CommonVO commonVO;
	int common_no;
	public CommonVO getCommonVO(){
		return commonVO;
	}
	public int getCommon_no(){
		return common_no;
	}
	public void setComonVO(CommonVO commonVO){
		this.commonVO = commonVO;
	}
	public void setCommon_no(int common_no) {
		this.common_no = common_no;
	}
	private String uid;
	private String pw;
	private String name;
	private String role;
	
	public UserVO() {
		super();
	}
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[CommonVO "+commonVO+"/ common_no"+common_no+"] ["+"uid : "+uid
				+" / pw : "+pw
				+" / name : "+name
				+" / role : "+role+"]";
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
