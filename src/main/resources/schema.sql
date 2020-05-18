DROP TABLE IF EXISTS GENRE;
DROP TABLE IF EXISTS BOOK ;
DROP TABLE IF EXISTS AUTHOR;
create table genre (id int primary key, name varchar (255) not null);
create table author (id int primary key, name varchar (255) not null);
create table book (id int primary key, name varchar (255) not null, author_id int, genre_id int);