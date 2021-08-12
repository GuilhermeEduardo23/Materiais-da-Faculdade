CREATE TABLE PROFESSOR(
	codigo_professor serial primary key,
	nome varchar(50) not null,
	endereco varchar(100) not null,
	numero varchar(10) not null,
	bairro varchar(50) not null,
	usuario varchar(15) not null,
	senha varchar(15) not null,
	codigo_cidade int REFERENCES CIDADE(codigo_cidade),
	codigo_titulacao int REFERENCES TITULACAO(codigo_titulacao)
);

CREATE TABLE CIDADE(
	codigo_cidade serial primary key,
	cidade varchar(50) not null,
	uf varchar(2) not null
);

CREATE TABLE ALUNO(
	codigo_aluno serial primary key,
	nome varchar(50) not null,
	endereco varchar(100) not null,
	numero varchar(10) not null,
	bairro varchar(50) not null,
	usuario varchar(15) not null,
	senha varchar(15) not null,
	codigo_cidade int REFERENCES CIDADE(codigo_cidade)
);

CREATE TABLE TITULACAO(
	codigo_titulacao serial primary key,
	descricao varchar(20) not null,
	observacoes varchar(100) not null
);

CREATE TABLE NOTAS(
	codigo_notas serial primary key,
	tipo varchar(10) not null,
	ano varchar(4),
	codigo_disciplinas int REFERENCES DISCIPLINAS(codigo_disciplinas),
	codigo_aluno int REFERENCES ALUNO(codigo_aluno),
	codigo_professor int REFERENCES PROFESSOR(codigo_professor),
	nota numeric(9,2)
);

CREATE TABLE DISCIPLINAS(
	codigo_disciplinas serial primary key,
	descricao varchar(50) not null,
	observacoes varchar(100) not null
);