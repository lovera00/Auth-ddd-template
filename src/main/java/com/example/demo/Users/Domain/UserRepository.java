package com.example.demo.Users.Domain;

import java.util.Optional;

public interface UserRepository {
    void save(User course);

    Optional<User> search(UserId id);

}
