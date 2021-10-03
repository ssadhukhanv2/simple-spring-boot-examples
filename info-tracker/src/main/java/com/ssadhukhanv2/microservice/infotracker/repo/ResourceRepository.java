package com.ssadhukhanv2.microservice.infotracker.repo;

import com.ssadhukhanv2.microservice.infotracker.domains.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
