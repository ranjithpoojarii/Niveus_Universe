package com.niveus.demo_project_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niveus.demo_project_2.entity.ProjectEntity;
import com.niveus.demo_project_2.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	
	public void saveStudentDetails(ProjectEntity projectEntity) {
		projectRepository.save(projectEntity);
	}


	@SuppressWarnings("deprecation")
	public ProjectEntity getStudentById(Long id) {
		return projectRepository.getById(id);
		
	}


	public void updateStudentByName(Double marks, String name) {
		projectRepository.updateStudentByName(marks, name);
		
	}


	public void deleteStudentById(Long id) {
		projectRepository.deleteById(id);
	}

}
