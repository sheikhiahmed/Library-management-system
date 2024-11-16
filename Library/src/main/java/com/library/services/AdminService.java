package com.library.services;

import com.library.models.Admin;
import com.library.repositories.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    AdminRepository adminRepository;
    public void create(Admin admin){
        adminRepository.save(admin);

    }
}
