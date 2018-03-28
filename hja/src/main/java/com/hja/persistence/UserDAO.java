package com.hja.persistence;

import com.hja.domain.UserVO;
import com.hja.dto.LoginDTO;

public interface UserDAO {
	
	public void insertUser(UserVO vo);
	public UserVO login(LoginDTO dto) throws Exception;

}
