create table AUTOR(
	cod_autor int primary key,
	nome varchar(120) not null,
	dt_nasc date not null
);

create table EDITORA(
	cod_editora int primary key,
	nome varchar(120) not null,
	cnpj varchar(18) not null,
	endereco varchar(140) not null
);

create table LIVRO(
	cod_livro int primary key,
	nome varchar(120) not null,
	isbn varchar(40) not null unique,
	cod_autor int references AUTOR not null,
	cod_editora int references EDITORA not null,
	valor numeric(9,2) not null
);

create table CLIENTE(
	cod_cliente int primary key,
	nome varchar(120) not null,
	dt_nasc date not null,
	genero varchar(1) not null
);

create table VENDA(
	cod_venda int primary key,
	dt_venda date not null,
	cod_livro int references LIVRO not null,
	qtd int not null,
	cod_cliente int references CLIENTE not null
);
---------------------------------------------------

-----------------------------------------------------------------
insert into AUTOR(cod_autor, nome, dt_nasc)
	values(1, 'J. K. Rowling', '31/07/65'),
		(2, 'Nicholas Sparks Charles', '31/12/65'),
		(3, 'Stephenie Meyer', '24/12/73'),
		(4, 'Monteiro Lobato', '18/04/82'),
		(5, 'Machado de Assis', '21/06/39');

select * from AUTOR;
-----------------------------------------------------------------

--------------------------------------------------------
insert into EDITORA(cod_editora, nome, cnpj, endereco)
	values(1, 'Novo Conceito', '1111111', 'Rua A'),
		(2, 'Little', '22222222', 'Rua B'),
		(3, 'Saraiva', '33333333', 'Rua C');

select * from EDITORA;
-------------------------------------------------------

-------------------------------------------------------------------------------------------
insert into LIVRO(cod_livro, nome, isbn, cod_autor, cod_editora, valor)
	values(1, 'Harry Potter e o Prisioneiro de Azkaban', '1111', 1, 3, 42.80),
		(2, 'Harry Potter e a Pedra Filosofal', '2222', 1, 3,42.80 ),
		(3, 'Harry Potter e as Relíquias da Morte: Parte 1', '3333', 1, 3, 42.80),
		(4, 'Querido John', '4444', 2, 1, 55.50),
		(5, 'A Última Música', '5555', 2, 1, 55.50),
		(6, 'A Saga Crepúsculo: Eclipse', '6666', 3, 2, 35.90),
		(7, 'A Saga Crepúsculo: Amanhecer', '7777', 3, 2, 35.90),
		(8, 'O Pica-Pau Amarelo', '8888', 4, 1, 20.00),
		(9, 'Dom Quixote das Crianças', '9999', 4, 1, 20.00),
		(10, 'Dom Casmurro', '0000', 5, 1, 20.00);

select * from LIVRO;
-------------------------------------------------------------------------------------------

---------------------------------------------------------
insert into CLIENTE(cod_cliente, nome, dt_nasc, genero)
	values(1, 'José', '01/01/00', 'M'),
		(2, 'Maria', '02/02/93', 'F'),
		(3, 'Emily', '24/03/97', 'F'),
		(4, 'Guilherme', '24/07/98', 'M'),
		(5, 'Rondinele', '12/08/88', 'M'),
		(6, 'Tais', '02/10/93', 'F'),
		(7, 'Cleiton', '30/09/01', 'M'),
		(8, 'Fernanda', '15/04/95', 'F'),
		(9, 'João', '08/11/99', 'M'),
		(10, 'Joana', '10/10/10', 'F');

select * from CLIENTE;
---------------------------------------------------------

--------------------------------------------------------
insert into VENDA(cod_venda, dt_venda, cod_livro, qtd, cod_cliente)
	values(1, '02/10/14', 1, 1, 1),
		(2, '02/01/11', 2, 2, 2),
		(3, '03/02/12', 3, 1, 3),
		(4, '04/03/10', 4, 1, 4),
		(5, '05/04/16', 5, 3, 5),
		(6, '06/04/98', 6, 4, 6),
		(7, '07/01/00', 7, 1, 7),
		(8, '08/12/06', 8, 2, 8),
		(9, '09/02/13', 9, 6, 9),
		(10, '12/04/08', 10, 3, 10),
		(11, '22/06/01', 1, 2, 1),
		(12, '25/10/05', 2, 1, 2),
		(13, '14/09/16', 3, 1, 3),
		(14, '18/08/14', 4, 8, 4),
		(15, '28/02/09', 5, 3, 5),
		(16, '19/12/99', 6, 5, 6),
		(17, '02/07/02', 7, 2, 7),
		(18, '03/09/03', 8, 1, 8),
		(19, '09/10/15', 9, 6, 9),
		(20, '05/1/13', 10, 3, 10);

select * from VENDA;
----------------------------------------------------------
select l.isbn, l.nome, e.nome, a.nome, l.valor
from LIVRO l, AUTOR a, EDITORA e
where l.cod_autor=a.cod_autor and l.cod_editora=e.cod_editora --A)

select a.nome, a.dt_nasc
from AUTOR a, LIVRO l
where a.cod_autor NOT IN (select l.cod_autor from LIVRO l)
order by a.dt_nasc --B)

select c.nome
from CLIENTE c
where c.cod_cliente NOT IN
(select v.cod_cliente from VENDA v where v.dt_venda < '01/01/15')
order by c.nome  --C)

select c.nome
from CLIENTE c, VENDA v
where c.cod_cliente = v.cod_cliente and
v.dt_venda BETWEEN '01-03-15' and '31/03/15' --D)

select SUM(l.valor * v.qtd)
from VENDA v, LIVRO l
where v.cod_livro = l.cod_livro and
v.dt_venda BETWEEN '01-08-15' and '31-08-15' --E)

select COUNT (v.cod_venda)
from VENDA v
where v.dt_venda BETWEEN '01-08-15' and '31-08-15' --F)

select l.nome, SUM(v.qtd)
from LIVRO l, VENDA v
where v.cod_livro = l.cod_livro
group by l.nome
order by SUM(v.qtd) desc
limit 1 --G)

select v.cod_cliente, c.nome, SUM(v.qtd)
from CLIENTE c, VENDA v
where v.cod_livro = c.cod_cliente
group by v.cod_cliente, c.nome
order by SUM(v.qtd) desc
limit 1 --H)
