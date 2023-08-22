package com.jsh.boardadminproject.repository;

import com.jsh.boardadminproject.domain.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {
}
