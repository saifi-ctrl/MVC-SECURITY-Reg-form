package com.product.service;

import java.util.List;

import com.product.entity.User;

public interface UserService {
public void register(User user);

public void updateByUser(User user);

public User getByEmail(String email);

public void deleteUser(String email);

public List<User> listUsers();

public User loginUser(String email);
}

