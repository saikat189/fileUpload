package com.practice.service.rest;


import com.practice.entity.LargeFile;
import com.practice.service.db.DbService;
import io.swagger.annotations.*;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/upload")
@Api(value = "Guidelines", description = "Describes the guidelines for " +
        " Spring boot 2.0.1 for uploading large file using Swagger UI")
public class FileUploadRestApi {
    
    @Autowired
    private DbService dbService;
    private static Logger LOG = LoggerFactory.getLogger(FileUploadRestApi.class);

    @PostMapping
    @ApiOperation(value = "Make a POST request to upload the file",
            produces = "application/json", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The POST call is Successful"),
            @ApiResponse(code = 500, message = "The POST call is Failed"),
            @ApiResponse(code = 404, message = "The API could not be found")
    })

    public ResponseEntity<String> uploadFile(
            @ApiParam(name = "file", value = "Select the file to Upload", required = true)
            @RequestPart("file") MultipartFile file) {

        try {

            File testFile = new File("UploadedFile");
            FileUtils.writeByteArrayToFile(testFile, file.getBytes());
            LargeFile largeFile = new LargeFile();
            largeFile.setName(file.getName());
            largeFile.setData(file.getBytes());
            dbService.createLargeFileRecord(largeFile);
            LOG.info(" File info created..");
            
            
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<String>("Done", HttpStatus.OK);
    }
    
}
