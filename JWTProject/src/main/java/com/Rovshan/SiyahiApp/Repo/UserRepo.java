package com.Rovshan.SiyahiApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rovshan.SiyahiApp.Model.Users;
@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{

	Users findByUsername(String username);

}
