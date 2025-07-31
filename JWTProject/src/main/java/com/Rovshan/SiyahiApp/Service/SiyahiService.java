package com.Rovshan.SiyahiApp.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Rovshan.SiyahiApp.Model.Siyahi;
import com.Rovshan.SiyahiApp.Repo.SiyahiRepo;

@Service
public class SiyahiService {
	
	
@Autowired	
SiyahiRepo repo;

public List<Siyahi> getallSiyahi() {
	
	return repo.findAll();
	
}

public Siyahi postSiyahi(Siyahi siyahi) {
	
	return repo.save(siyahi);
}

public Siyahi getbyid(int id) {
	
	return repo.findById(id).orElse(null);
}


public void  putSiyahi(Siyahi id) {
	  repo.save(id);
}

public void deleteSiyahi(int id) {
	
	repo.deleteById(id);
	
}



}
