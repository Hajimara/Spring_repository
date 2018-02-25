package org.web.service.User;

import java.util.Date;
import java.util.List;

import org.web.service.domain.UserVO;
import org.web.service.dto.LoginDTO;

public interface UserService {

	public UserVO login(LoginDTO dto)throws Exception;
	
	public void keepLogin(String uid,String sessionId,Date next)throws Exception;
	
	public UserVO checkLoginBefore(String value)throws Exception;
	
	public List<UserVO> listUser() throws Exception;
}
