package com.Rovshan.SiyahiApp.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Rovshan.SiyahiApp.Model.Users;
import com.Rovshan.SiyahiApp.Repo.UserRepo;

@Service
public class UserService {

	private final JWTService jwtService;
    private final UserRepo repo;
    private final AuthenticationManager authManager;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Autowired
    public UserService(UserRepo repo, AuthenticationManager authManager,JWTService jwtService) {
        this.repo = repo;
        this.authManager = authManager;
        this.jwtService=jwtService;
    }

    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

   

	public String verify(Users user) {
		 Authentication auth =
		            authManager.authenticate(
		                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		        return jwtService.generateToken(user.getUsername());
	}

	
}

