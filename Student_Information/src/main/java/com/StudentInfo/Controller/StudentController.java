package com.StudentInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentInfo.Model.StudentModel;
import com.StudentInfo.Service.StudentService;
@RestController
@RequestMapping("/stud")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/post")
	private String postStudentModel(@RequestBody StudentModel studentModel) {
		studentService.postStudentModel(studentModel);
		return"Data sucessfully posted.....";
	}
	@PutMapping("/put/{id}")
	private String updateStudentModel(@PathVariable int id,@RequestBody StudentModel studentModel) {
		studentService.updateStudentModelById(id,studentModel);
		return"Data sucessfully updated.....";
	}
	
	@GetMapping("/get")
	private List<StudentModel>getStudentModel(){
		List<StudentModel>studentModel=studentService.getStudentModel();
		return(List<StudentModel>)studentModel;
	}
	
	@DeleteMapping("/del/{id}")
	private String deleteStudentModelById(@PathVariable int id) {
		studentService.deleteStudentModelById(id);
		return "Data sucessfully deleted....";
	}
}
