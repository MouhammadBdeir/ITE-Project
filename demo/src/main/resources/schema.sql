-- author
create table IF NOT EXISTS Author(
    id serial primary key,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(255) not null,
    username varchar(100) not null
);

-- post
create table IF NOT EXISTS Post (
    id serial primary key ,
    version int,
    title varchar(255) not null,
    content text not null,
    published_on timestamp not null,
    updated_on timestamp,
    author int,
    foreign key (author) references Author(id)
);

-- comment
create table IF NOT EXISTS Comment(
    post int not null,
    name varchar(100) not null,
    content text not null,
    published_on timestamp not null,
    updated_on timestamp,
    foreign key (post) references Post(id)
);
-- comment
create table IF NOT EXISTS customer(
    id serial primary key,
    firstName varchar(100) not null,
    lastName varchar(100) not null,
    interest varchar(100) not null,
    company varchar(100) not null,
    anrede varchar(100) not null,
    email varchar(255) not null,
    phoneNumber number not null,
    message text not null,
    );