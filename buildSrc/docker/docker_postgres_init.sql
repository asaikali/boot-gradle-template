CREATE USER snapcoach WITH PASSWORD 'password';

CREATE DATABASE snapcoach
    WITH
    OWNER = snapcoach
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
