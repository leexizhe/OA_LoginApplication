package com.uob.loginregister.service;

import com.uob.loginregister.dto.UserRegistrationDto;
import com.uob.loginregister.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
