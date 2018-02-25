package org.web.service.domain;

public class CommonVO {
	private int common_no;
	private String role;
	public int getCommon_no() {
		return common_no;
	}
	public void setCommon_no(int common_no) {
		this.common_no = common_no;
	}
	public String getROLE() {
		return role;
	}
	public void setROLE(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "CommonVO [common_no=" + common_no + ", role=" + role + "]";
	}
	

}
