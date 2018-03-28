package com.hja.service; //service의 역할은 DAO를 호출하기도 하지만 기능을 추가할 때 사용한다. 여러개의 DAO를 호출할 수 있다.


import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hja.domain.UserVO;
import com.hja.dto.LoginDTO;
import com.hja.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject UserDAO dao;
	public void signup(UserVO user) throws Exception{
		dao.insertUser(user);
	}
	
	public UserVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}



	

}
