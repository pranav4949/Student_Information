package com.StudentInfo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.StudentInfo.Model.StudentModel;
@Repository
public interface StudentRepository extends CrudRepository<StudentModel,Integer>{

}
