package com.dailycodework.lakesidehotel.config;

import com.dailycodework.lakesidehotel.model.Role;
import com.dailycodework.lakesidehotel.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initRoles(RoleRepository roleRepository) {
        return args -> {
            if (!roleRepository.existsByName("ROLE_USER")) {
                roleRepository.save(new Role("ROLE_USER"));
            }
            if (!roleRepository.existsByName("ROLE_ADMIN")) {
                roleRepository.save(new Role("ROLE_ADMIN"));
            }
        };
    }
}