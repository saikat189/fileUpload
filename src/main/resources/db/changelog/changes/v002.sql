ALTER TABLE fileupload.company_files 
    DROP COLUMN data,
    ALTER COLUMN name TYPE VARCHAR,
    ADD COLUMN location VARCHAR;