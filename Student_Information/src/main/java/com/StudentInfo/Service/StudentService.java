package com.StudentInfo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentInfo.Model.StudentModel;
import com.StudentInfo.Repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public void postStudentModel(StudentModel studentModel) {
		studentRepository.save(studentModel);
		
	}

	public void updateStudentModelById(int id, StudentModel studentModel) {
		Optional<StudentModel> StudentModel1=studentRepository.findById(id);
		StudentModel StudentModel2=StudentModel1.get();
		StudentModel2.setId(studentModel.getId());
		StudentModel2.setFee(studentModel.getFee());
		StudentModel2.setLoc(studentModel.getLoc());
		studentRepository.save(studentModel);
		
		
	}

	public List<StudentModel> getStudentModel() {
		List<StudentModel> studentModel=(List<StudentModel>)studentRepository.findAll();
		return studentModel;
	}

	public void deleteStudentModelById(int id) {
		studentRepository.deleteById(id);
		
	}

}
