package com.SringBoot.RESTAPIs.RestAPIs.reposetory;

import com.SringBoot.RESTAPIs.RestAPIs.entity.Studententity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Studententity,Long> {

}
