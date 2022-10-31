package com.niveus.demo_project_2.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.niveus.demo_project_2.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long>{

	@Transactional
	@Modifying
	@Query("update ProjectEntity a set a.marks =: marks where a.name =: name")
	void updateStudentByName(@Param("marks") Double marks, @Param("name") String name);

}
