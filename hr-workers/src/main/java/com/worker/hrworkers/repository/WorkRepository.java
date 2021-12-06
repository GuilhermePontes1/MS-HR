package com.worker.hrworkers.repository;

import com.worker.hrworkers.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Worker, Long> {

}
