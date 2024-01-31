package com.example.Leap.Repository;

import com.example.Leap.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String > {
    User findUser(String username, String password);
}
