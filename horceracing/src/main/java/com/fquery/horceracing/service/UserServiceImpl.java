package com.fquery.horceracing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fquery.horceracing.dao.UserRepository;
import com.fquery.horceracing.entity.User;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository theUserRepository) {
        userRepository = theUserRepository;
    }




    @Override
    public void save(User theUser) {
       userRepository.save(theUser);
    }
    
}
