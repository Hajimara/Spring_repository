package org.web.service.User.Impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.web.service.User.UserDAO;
import org.web.service.domain.UserVO;
import org.web.service.dto.LoginDTO;

@Repository("userDAOImpl")
public class UserDAOImpl implements UserDAO {

	private static String namespace="UserMapper";
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	// Constructor
	public UserDAOImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".login", dto);
	}
	@Override
	public void keepLogin(String uid, String sessionId, Date next) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("uid", uid);
		paramMap.put("sessionId", sessionId);
		paramMap.put("next", next);
		
		session.update(namespace+".keepLogin",paramMap);
	}

	@Override
	public UserVO checkUserWithSessionKey(String value) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".checkUserWithSessionKey",value);
	}

	@Override
	public List<UserVO> listUser() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listUser");
	}
}
