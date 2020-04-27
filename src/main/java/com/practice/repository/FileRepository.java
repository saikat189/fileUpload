package com.practice.repository;

import com.practice.entity.LargeFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<LargeFile,Long> {
}
