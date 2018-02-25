package org.web.service.User.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.web.service.User.UserDAO;
import org.web.service.User.UserService;
import org.web.service.domain.UserVO;
import org.web.service.dto.LoginDTO;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

	@Autowired
	@Qualifier("userDAOImpl")
	private UserDAO dao;
	
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass());
	}
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.login(dto);
	}
	@Override
	public void keepLogin(String uid, String sessionId, Date next) throws Exception {
		// TODO Auto-generated method stub
		dao.keepLogin(uid, sessionId, next);
		
	}

	@Override
	public UserVO checkLoginBefore(String value) throws Exception {
		// TODO Auto-generated method stub
		return dao.checkUserWithSessionKey(value);
	}
	@Override
	public List<UserVO> listUser() throws Exception {
		// TODO Auto-generated method stub
		return dao.listUser();
	}
}
