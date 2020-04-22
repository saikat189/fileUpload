package com.practice.service.db;

import com.practice.entity.LargeFile;
import com.practice.repository.FileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
public class DbServiceImpl implements DbService {

    private static Logger LOG = LoggerFactory.getLogger(DbServiceImpl.class);
    @Autowired
    private FileRepository fileRepository;
    /*@Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public MPORootSegment createMpoRecord(MPORootSegment mpoRootSegment) {
        mpoRootSegment = mpoRootSegmentRepository.save(mpoRootSegment);
        LOG.info(String.format("Created MPO Record with ApplicationID : %s", mpoRootSegment.getMPORootSegmentId()));
        return mpoRootSegment;
    }
*/

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public LargeFile createLargeFileRecord(LargeFile largeFile) {
        largeFile = fileRepository.save(largeFile);
        LOG.info("File info created successfuly in DB!!");
        return largeFile;
    }

    @Override
    public Optional<LargeFile> fetchFile(long id) {
       return fileRepository.findById(id);
    }
}
