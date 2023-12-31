package com.javarun.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javarun.web.models.HistoryRecord;

@Repository
public interface HistoryRecordRepository extends JpaRepository<HistoryRecord, Long>{
    
}
