package com.miles.comtroller;

import com.miles.Service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class Home {

    @Autowired
    private UserRepository _userRepository;

    Home(UserRepository userRepository) {
        _userRepository = userRepository;
        System.out.println("HomeController");
        _userRepository.Save();
    }

}
