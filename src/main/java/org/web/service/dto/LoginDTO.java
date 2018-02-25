package org.web.service.dto;


	/*	VO(value Object)�� DTO(Data Transfer Object)
	 * 
	 * �Ϲ������� ��Ʈ�ѷ��� ���޵Ǵ� �����͸� �����ϴ� �뵵�� VO�� ����ϴ� ��쵵 �հ�, DTO�� ����ϴ� ��찡 �ִ�. ����� ����
	 * ������ - �������� ������ ���޿������ �� �ִٴ� ��. �Ķ���ͳ� ���� Ÿ������ ����ϴ� ���� ����
	 * VO�� DB���� �Ÿ��� ������. ���̺� ������ �̿��ؼ� �ۼ��Ǵ� ��찡 ����
	 * DTO�� ȭ��� ����� ȭ�鿡�� ���޵Ǵ� �����͸� �����ϴ� �뵵�� ���
	 * 
	 * */
public class LoginDTO {

	private String uid;
	private String pw;
	private boolean useCookie;
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
	public boolean isUseCookie() {
		return useCookie;
	}
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	
	@Override
	public String toString() {
		return "["+"uid : "+uid
				+" / pw : "+pw
				+" / useCookie : "+useCookie + "]";
	}
}
