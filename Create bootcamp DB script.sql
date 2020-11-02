create database if not exists bootcamp;

drop table if exists course_student;
drop table if exists students;
drop table if exists instructors;
drop table if exists courses;

create table instructors(
instructor_id int not null auto_increment,
instructor_name varchar (50) not null,
instructor_email varchar (30),
primary key (instructor_id)
);

create table students (
student_id int not null auto_increment,
student_name varchar (50) not null,
student_email varchar (30),
primary key (student_id)
);

create table courses (
course_id int not null auto_increment, 
instructor_id int not null, 
course_name varchar (30), 
format varchar (30), 
semester varchar (20),
primary key (course_id),
foreign key (instructor_id) references instructors (instructor_id)
);

create table course_student (
course_id int not null,
student_id int not null,
primary key (course_id, student_id),
foreign key (course_id) references courses (course_id),
foreign key (student_id) references students(student_id)
);

use bootcamp;

