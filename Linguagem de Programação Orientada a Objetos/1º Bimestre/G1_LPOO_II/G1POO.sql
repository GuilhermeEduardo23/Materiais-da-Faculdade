CREATE TABLE PRODUTOS(
	cod_prod serial primary key,
	codigo_de_barras int not null,
	descricao varchar(45) not null,
	ncm varchar(8) not null,
	quantidade int not null,
	peso numeric(9,2) not null,
	preco numeric(9,2) not null,
	situacao varchar(7) not null
);

CREATE TABLE CLASSIFICACAO(
	cod_classificacao serial primary key,
	classificacao varchar(45) not null,
	observacoes varchar(200) not null
);

ALTER TABLE PRODUTOS ADD cod_classificacao int references CLASSIFICACAO(cod_classificacao)

SELECT * FROM PRODUTOS
SELECT * FROM CLASSIFICACAO