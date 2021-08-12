CREATE TABLE CLIENTES	
(
	cod_cli serial primary key,
	nome varchar(40) not null,
	sobrenome varchar(60) not null,
	endereco varchar(100) not null,
	genero varchar(1) not null
);

CREATE TABLE AGENCIA
(
	cod_agencia serial primary key,
	nome varchar(140) not null,
	endereco varchar(140) not null,
	telefone varchar(20) not null
);

CREATE TABLE FUNCIONARIOS
(
	cod_funcion serial primary key,
	nome varchar(140) not null,	
	cod_agencia int references AGENCIA
);


CREATE TABLE CONTAS 
(
	cod_conta serial primary key,
	cod_agencia int references AGENCIA,
	cod_cli int references CLIENTES,
	saldo numeric(9,2) not null,
	limite numeric(9,2) not null
);

CREATE TABLE SAQUES
(
	cod_saque serial primary key,
	data_saque date not null,
	cod_conta int references CONTAS,
	valor_saque numeric(9,2) not null
);

CREATE TABLE DEPOSITOS
(
	cod_deposito serial primary key,
	data_deposito date not null,
	cod_conta int references CONTAS,
	valor_deposito numeric(9,2) not null
);

CREATE TABLE TRANSFERENCIAS
(
	cod_transf serial primary key,
	data_transf date not null,
	cod_conta_deb int references CONTAS(cod_conta) not null,
	cod_conta_cred int references CONTAS(cod_conta) not null
);

ALTER TABLE AGENCIA ADD gerente int references FUNCIONARIOS(cod_funcion) not null;

SELECT * FROM CLIENTES;
SELECT * FROM AGENCIA;
SELECT * FROM FUNCIONARIOS;
SELECT * FROM CONTAS;
SELECT * FROM SAQUES;
SELECT * FROM DEPOSITOS;
SELECT * FROM TRANSFERENCIAS;

/*1*/

create or replace function CRIAR_CONTA () returns trigger as $$
begin
	update CONTAS set limite = 100 where cod_conta = new.cod_conta;
end;
$$ language plpgsql;

create trigger LIMITA_CONTA after insert on CONTAS for each row execute procedure CRIAR_CONTA();

/*2*/

create or replace function VERIFICAR_SALDO() returns trigger as $$
begin
create trigger VERIFICAR_SALDO after insert on CONTAS for each row execute procedure VERIFICAR_CONTA();


/*3*/

/*4*/

/*5*/

CREATE TRIGGER TR_ATUALIZA_LIMITE AFTER UPDATE
ON CONTAS FOR EACH ROW

WHEN(old.limite is distinct from new.limite)

execute procedure FN_ATUALIZA_LIMITE();