package com.practice.service.db;

import com.practice.entity.LargeFile;

import java.util.Optional;

public interface DbService {
    LargeFile createLargeFileRecord(LargeFile largeFile);
    Optional<LargeFile> fetchFile(long id);
}
