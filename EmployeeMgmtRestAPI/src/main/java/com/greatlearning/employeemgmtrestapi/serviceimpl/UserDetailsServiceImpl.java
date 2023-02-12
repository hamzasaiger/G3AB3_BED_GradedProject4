package com.greatlearning.employeemgmtrestapi.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.employeemgmtrestapi.model.User;
import com.greatlearning.employeemgmtrestapi.repository.UserRepository;
import com.greatlearning.employeemgmtrestapi.security.config.SecurityDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
       
		return new SecurityDetails(user);
	}

}
