package com.springdemo.helloms.repository;

import com.springdemo.helloms.entity.WorkOrderHdr;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface WorkOrderHdrRepository extends JpaRepository<WorkOrderHdr,Long> {
}
