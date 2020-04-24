-- Criar Tabelas 
create database bd_mschool;
use bd_mschool;
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


-- Selecionar
select * from agenda; 
select * from aluno;
select * from curso;
select * from lista;
select * from pagamento;
select * from professor;
-- Descrever 
describe agenda;
describe aluno;
describe curso;
describe lista;
describe pagamento;
describe professor;

-- Adicionando colunas em alunos 
alter table aluno add column CursoEscolhido varchar(50);
alter table aluno add column horaAula varchar(50);
alter table aluno add column diaAula varchar(50);

-- Selecionando ALunos 
Select nomeAluno,CursoEscolhido,diaAula,horaAula from aluno;
