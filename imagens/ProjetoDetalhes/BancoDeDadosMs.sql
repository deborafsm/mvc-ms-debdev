create database bd_musicschool;
use bd_musicschool;
create table Aluno(
rm_aluno int primary key auto_increment,
nomeAluno varchar(100),
celularAluno varchar(15),
nomeResponsavel varchar(100),
celularResponsavel varchar(15)

);
create table Curso(
id_curso int primary key auto_increment,
nomeCurso varchar(100),
rm_aluno int,
id_professor int

);
create table Lista(
id_lista int primary key auto_increment,
descricao varchar(30),
rm_aluno int
);
create table Agenda(
id_agenda int primary key auto_increment,
dataEvento varchar(15),
hora varchar(15),
descEvento varchar(40),
rm_aluno int
	
);
create table Pagamento(
id_pagamento int primary key auto_increment,
dataPag varchar(15),
valor varchar(200),
rm_aluno int
);
create table Professor(
id_professor int primary key auto_increment,
nomeProfessor varchar(100)
);

ALTER TABLE `bd_musicschool`.`agenda` 
CHARACTER SET = utf8 , ENGINE = InnoDB ;

ALTER TABLE `bd_musicschool`.`aluno` 
CHARACTER SET = utf8 , ENGINE = InnoDB ;

ALTER TABLE `bd_musicschool`.`curso` 
CHARACTER SET = utf8 , ENGINE = InnoDB ;

ALTER TABLE `bd_musicschool`.`lista` 
CHARACTER SET = utf8 , ENGINE = InnoDB ;

ALTER TABLE `bd_musicschool`.`pagamento` 
CHARACTER SET = utf8 , ENGINE = InnoDB ;

ALTER TABLE `bd_musicschool`.`professor` 
CHARACTER SET = utf8 , ENGINE = InnoDB ;


ALTER TABLE `bd_musicschool`.`curso` 
ADD INDEX `rm_aluno_idx` (`rm_aluno` ASC) ,
ADD INDEX `id_professor_idx` (`id_professor` ASC) ;
;
ALTER TABLE `bd_musicschool`.`curso` 
ADD CONSTRAINT `rm_aluno`
  FOREIGN KEY (`rm_aluno`)
  REFERENCES `bd_musicschool`.`aluno` (`rm_aluno`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `id_professor`
  FOREIGN KEY (`id_professor`)
  REFERENCES `bd_musicschool`.`professor` (`id_professor`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


describe agenda;
describe aluno;
describe curso;
select * from curso;
describe lista;
describe pagamento;

alter table curso drop column id_professor ;
describe curso;
alter table curso drop column horaCurso;


create table diaCurso(
id int primary key auto_increment,
diaCurso varchar(40) 
);
create table horaCurso(
id_hora int primary key auto_increment,
horaCurso varchar(30)

);

describe professor;

select * from diacurso;
select * from horacurso;

alter table curso drop column rm_aluno;

alter table aluno add CursoEscolhido int;
describe aluno;
alter table aluno 
add foreign key (CursoEscolhido)
references	curso(id_curso);
select * from aluno;
select * from curso;
update aluno set CursoEscolhido = '1' where rm_aluno = '1';


select a.nomeAluno, c.nomeCurso
from aluno as a join curso as c
on c.id_curso = a.CursoEscolhido
order by a.nomeAluno; 

select a.nomeAluno, c.nomeCurso
from aluno as a  left outer join curso as c
on c.id_curso = a.CursoEscolhido
order by a.nomeAluno; 


alter table aluno 
add foreign key (diaAula)
references	diaCurso(diaCurso);