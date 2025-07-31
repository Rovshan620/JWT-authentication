package com.Rovshan.SiyahiApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rovshan.SiyahiApp.Model.Siyahi;

@Repository
public interface SiyahiRepo extends JpaRepository < Siyahi,Integer> {


}
