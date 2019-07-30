package com.mycompany.thewineproject.services;

import com.mycompany.thewineproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service("securityService")
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private UserDetailsService userDetailsService;

    public void autologin(User user) {
        Authentication auth = new UsernamePasswordAuthenticationToken(user.getSsoId(), user.getPassword(),
                 userDetailsService.loadUserByUsername(user.getSsoId()).getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(auth);
    }

}
