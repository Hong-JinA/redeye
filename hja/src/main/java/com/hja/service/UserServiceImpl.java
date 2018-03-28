package com.hja.service; //service�� ������ DAO�� ȣ���ϱ⵵ ������ ����� �߰��� �� ����Ѵ�. �������� DAO�� ȣ���� �� �ִ�.


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
