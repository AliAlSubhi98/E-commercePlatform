package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {
}
