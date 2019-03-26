package com.resumeBuilder.CVResumeBuider.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resumeBuilder.CVResumeBuilder.Entity.Resume;

public interface ResumeRepo extends JpaRepository<Resume, Integer>{

}
