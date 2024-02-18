package com.SpringBoot.SchoolManagementSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.SchoolManagementSystem.Entity.LoginTbl;

@Repository
public interface LoginRepository extends JpaRepository<LoginTbl, Integer>  {

//	Optional<LoginTbl> findByLoginTblEmailIdAndEncryptedPassword(String email, String password);

}
