DROP TABLE IF EXISTS GENRE;
DROP TABLE IF EXISTS BOOK ;
DROP TABLE IF EXISTS AUTHOR;
create table genre (genre_id int primary key, genre_name varchar (255) not null);
create table author (author_id int primary key, author_name varchar (255) not null);
create table book (book_id int primary key, book_name varchar (255) not null, author_id int, genre_id int);