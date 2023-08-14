package com.jsh.boardadminproject.repository;

import com.jsh.boardadminproject.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
