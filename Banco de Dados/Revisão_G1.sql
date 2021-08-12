CREATE TABLE ESPOSA(
	cod_esposa int primary key,
	nome varchar(140) not null
);

CREATE TABLE MARIDO(
	cod_marido int primary key,
	nome varchar(140) not null,
	cod_esposa int references ESPOSA (cod_esposa) not null
);

select * from ESPOSA 
select * from MARIDO

ALTER TABLE ESPOSA ADD cod_marido int references MARIDO(cod_marido)

DROP TABLE MARIDO
DROP TABLE ESPOSA

INSERT INTO ESPOSA(nome)
VALUES('Thaís');

INSERT INTO MARIDO(nome, cod_esposa)
VALUES('Hulgo', 1);

UPDATE ESPOSA SET cod_marido = 1 where cod_esposa = 1;