package com.lucasrafael.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrafael.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
