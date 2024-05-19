package com.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.product.entity.User;
@Repository
@EnableTransactionManagement
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory factory;

	@Override
	public void register(User user) {
		
		factory.getCurrentSession().save(user);
	}


	@Override
	public void updateByEmail(User user) {
		
		 factory.getCurrentSession().saveOrUpdate(user);
		
		
	}


	@Override
	public User getByEmail(String email) {
		String query="from User where email=:email";
		User user=(User) factory.getCurrentSession().createQuery(query).setParameter("email", email).getSingleResult();
		return user;
	}

	
	
	
	@Override
	public void deleteUser(String email) {
	   String hql="from User where email=:email";
	    User userToDelete = (User) factory.getCurrentSession().createQuery(hql).setParameter("email", email).uniqueResult();

	   
	    if (userToDelete != null) {
	       
	        factory.getCurrentSession().delete(userToDelete);
	    }
	}


	@Override
	public List<User> listUsers() {
		 List<User> all = factory.getCurrentSession().createQuery("from User").list();
		 
		return all;
	}


	@Override
	public User login(String email) {
		String hql1="from User where email=:email";
		User loginUser = (User) factory.getCurrentSession().createQuery(hql1).setParameter("email",email).getSingleResult();
		return loginUser;
	}


	@Override
	public User loadByUser(String user) {
		String hql1="from User where email=:email";
		User userEntity = (User) factory.getCurrentSession().createQuery(hql1).setParameter("email",user).getSingleResult();
		return userEntity;
		
		
	}
}

	
	
	
	
	

