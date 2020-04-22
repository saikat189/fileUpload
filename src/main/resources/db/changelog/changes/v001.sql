CREATE TABLE fileupload.company_files (
     id        SERIAL PRIMARY KEY,
     name CHARACTER VARYING(255) NOT NULL,
     data BYTEA NOT NULL
);