CREATE TABLE FUNCIONARIOS(
	cod_func serial primary key,
	nome varchar(50) not null,
	endereco varchar(100) not null,
	numero varchar(10) not null,
	bairro varchar(50) not null,
	usuario varchar(15) not null,
	senha varchar(15) not null
);

CREATE TABLE CIDADE(
	cod_cidade serial primary key,
	cidade varchar(50) not null,
	uf varchar(2) not null
);

ALTER TABLE FUNCIONARIOS ADD cod_cidade int references CIDADE (cod_cidade)

CREATE TABLE CLIENTES(
	cod_cliente serial primary key,
	nome varchar(50) not null,
	endereco varchar(100) not null,
	numero varchar(10) not null,
	bairro varchar(50) not null,
	cod_cidade int references CIDADE (cod_cidade)
);

CREATE TABLE CARGOS(
	cod_cargo serial primary key,
	descricao varchar(200) not null,
	observacoes varchar(200) not null
);

ALTER TABLE FUNCIONARIOS ADD cod_cargo int references CARGOS (cod_cargo)

CREATE TABLE FILMES(
	cod_filme serial primary key,
	titulo varchar(200) not null,
	descricao varchar(200) not null,
	duracao varchar(10) not null,
	ano varchar(4) not null,
	observacoes varchar(200) not null
);

CREATE TABLE GENERO(
	cod_genero serial primary key,
	descricao varchar(200) not null,
	observacoes varchar(200) not null
);

ALTER TABLE FILMES ADD cod_genero int references GENERO (cod_genero)

CREATE TABLE RESERVA(
	cod_reserva serial primary key,
	data_solicitacao date not null,
	hora_solicitacao time not null,
	data_reserva date,
	hora_reserva time,
	cod_cliente int references CLIENTES (cod_cliente),
	cod_filme int references FILMES (cod_filme)
);

select * from FUNCIONARIOS
select * from CIDADE
select * from CLIENTES
select * from CARGOS
select * from FILMES
select * from GENERO
select * from RESERVA