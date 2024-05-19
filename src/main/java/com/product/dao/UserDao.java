package com.product.dao;

import java.util.List;

import com.product.entity.User;

public interface UserDao {



public void register(User user);

public void updateByEmail(User user);

public User getByEmail(String email );

public void deleteUser(String email);

public List<User> listUsers();

public User login(String email);

public User loadByUser(String user);

}
