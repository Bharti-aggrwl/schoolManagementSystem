package com.SpringBoot.SchoolManagementSystem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.SchoolManagementSystem.Entity.StudentTbl;
import com.SpringBoot.SchoolManagementSystem.Entity.StudentTblPk;

@Repository
public interface StudentRepo extends CrudRepository<StudentTbl, StudentTblPk>{

}
