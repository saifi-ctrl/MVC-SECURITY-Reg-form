package com.product.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.UserDao;
import com.product.entity.User;
@Service("CustomUserService")
public class CustomUserService implements UserDetailsService {
     @Autowired
     
	private UserDao userdao;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userdao.loadByUser("mus@gmail.com");
		
		if(user==null) {
			
		  throw new UsernameNotFoundException("USER NOT FOUND");	
			
		}
		else {
			return new CustomUser(user);
		}
		
		
	}

}
