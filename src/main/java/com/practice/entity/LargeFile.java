package com.practice.entity;

import lombok.Data;

import javax.persistence.*;


/*
* @Table(name = "MPO_ROOT_SEGMENT", schema = "jcms")
public class MPORootSegment {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator = "ROOT_SEGMENT_ID_SEQ")
    @SequenceGenerator(name = "ROOT_SEGMENT_ID_SEQ", sequenceName = "JCMS.SQC_JCMS_ROOT_SEGMENT_ID")
* */

@Entity
@Table(name = "company_files", schema = "fileupload")
public class LargeFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return location;
    }

    public void setData(String location) {
        this.location = location;
    }
}
