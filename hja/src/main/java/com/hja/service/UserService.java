package com.hja.service;

import com.hja.domain.UserVO;
import com.hja.dto.LoginDTO;

public interface UserService{
	public void signup(UserVO user) throws Exception;
	public UserVO login(LoginDTO dto) throws Exception;


}
