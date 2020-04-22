package com.practice.repository;

import com.practice.entity.LargeFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<LargeFile,Long> {
}
