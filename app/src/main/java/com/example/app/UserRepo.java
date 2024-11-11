package com.example.app;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository <UserDoacao, Long> {
    
}
