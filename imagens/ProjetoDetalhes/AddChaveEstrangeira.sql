alter table aluno add column diaAula int;
alter table aluno add column horaAula int;
describe aluno;

alter table aluno 
add foreign key (horaAula)
references	horacurso (id_hora);


describe diaCurso;


select a.nomeAluno, c.nomeCurso, d.diaCurso, h.horaCurso
from aluno as a
	inner join curso as c 
on c.id_curso = a.CursoEscolhido
    inner join diaCurso as d 
on d.id = a.diaAula
    inner join horaCurso as h
on h.id_hora = a.horaAula;
