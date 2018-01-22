package com.miles.Service;

import org.springframework.stereotype.Repository;


@Repository("userRepository")
public class UserRepository implements IUserRepository {
    @Override
    public void Save() {
        System.out.println("这个是User类的Save方法");
    }
}
