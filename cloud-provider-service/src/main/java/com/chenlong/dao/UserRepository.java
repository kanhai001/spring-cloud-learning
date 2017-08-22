package com.chenlong.dao;

import com.chenlong.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chenlong on 2017/8/10.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
