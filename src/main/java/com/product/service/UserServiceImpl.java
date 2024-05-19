
package com.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.product.dao.UserDao;
import com.product.entity.User;
import com.product.util.CommonUtil;
@Service
public class UserServiceImpl implements UserService {
@Autowired	
UserDao dao;

@Autowired
BCryptPasswordEncoder beBCryptPasswordEncoder;
	
	@Override
	@Transactional
	public void register(User user) {
		//user.setPassWord(new String(CommonUtil.Encryptpassword(user.getPassWord())));
		
		user.setPassWord(beBCryptPasswordEncoder.encode(user.getPassWord()));
		  
		
		dao.register(user);
		
	}

	@Override
	@Transactional
	public void updateByUser(User user) {
	
		dao.updateByEmail(user);
	}

	@Override
	@Transactional
	public User getByEmail(String email) {
		User userDetail=dao.getByEmail(email);
		return userDetail;
	}
	

	@Override
	@Transactional
	public void deleteUser(String email) {
	dao.deleteUser(email);
		
	}

	@Override
	@Transactional
	public List<User> listUsers() {
		 List<User>sall = dao.listUsers();
		
		return sall;
	}

	@Override
	@Transactional
	public User loginUser(String email) {
		User userl=dao.login(email);
		return userl ;
	}
	

	
	}


	


