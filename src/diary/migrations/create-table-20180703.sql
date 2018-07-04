CREATE TABLE diyary.entry (
    ID int NOT NULL AUTO_INCREMENT,
    entry_date date,
    author_name varchar(255),
    entry_text varchar(2000),
    primary key (id)
);