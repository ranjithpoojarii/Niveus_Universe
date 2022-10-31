package com.niveus.demo_project_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niveus.demo_project_2.entity.ProjectEntity;
import com.niveus.demo_project_2.service.ProjectService;

@CrossOrigin
@RestController
@RequestMapping(value="/demoProject")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping(value="/saveStudent")
	public void saveStudentDetails(@RequestBody ProjectEntity projectEntity) {
		try {
			projectService.saveStudentDetails(projectEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping(value="/getStudent")
	public ProjectEntity getStudentById(@RequestParam("studentId") Long id) {
		try {
			return projectService.getStudentById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping(value="/updateStudentInfo")
	public void updateStudentByName(@RequestParam("marks")Double marks, @RequestParam("name")String name) {
		try {
			projectService.updateStudentByName(marks, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DeleteMapping(value="/deleteStudentInfo")
	public void deleteStudentById(@RequestParam("studentId")Long id) {
		try {
			projectService.deleteStudentById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
