CREATE TABLE CD(
	cod_cd int primary key,
	nome varchar(50) not null,
	data_compra date not null,
	valor_pago numeric(9,2) not null,
	local_compra varchar(50) not null,
	album varchar(50) not null
);

CREATE TABLE MUSICAS(
	cod_cd int references CD (cod_cd),
	cod_musica int primary key,
	nome varchar(50) not null,
	artista varchar(50) not null,
	tempo time
);

select * from CD -- 3
select * from MUSICAS -- 5

INSERT INTO CD(cod_cd, nome, data_compra, valor_pago, local_compra, album)
VALUES(1, 'V', '21/09/2016', 32.90, 'Saraiva', 'V'),
(2, 'Listen Again', '13/02/2015', 54.99, 'Lojas Americanas', 'Listen Again'),
(3, 'True', '25/08/2015', 30.39, 'Lojas Americanas', 'True');

INSERT INTO MUSICAS(cod_cd, cod_musica, nome, artista, tempo)
VALUES(1, 10, 'It Was Always You', 'Maroon 5', '00:03:59'),
(1, 11, 'Animals', 'Maroon 5', '00:03:51'),
(1, 12, 'Maps', 'Maroon 5', '00:03:10'),
(1, 13, 'Sugar', 'Maroon 5', '00:03:55'),
(1, 14, 'One More Night', 'Maroon 5', '00:03:40'),
(2, 20, 'Dangerous', 'David Guetta feat. Sam Martin', '00:03:24'),
(2, 21, 'Lovers on the Sun', 'David Guetta feat. Sam Martin', '00:03:24'),
(2, 22, 'Goodbye Friend', 'David Guetta feat. The Script', '00:03:49'),
(2, 23, 'Listen', 'David Guetta feat. John Legend', '00:03:47'),
(2, 24, 'Bang my Head', 'David Guetta feat. Sia', '00:03:53'),
(3, 30, 'You Make Me', 'Avicii', '00:03:53'),
(3, 31, 'Wake Me Up', 'Avicii', '00:04:07'),
(3, 32, 'Hey Brother', 'Avicii', '00:04:15'),
(3, 33, 'Lay Me Down', 'Avicii', '00:05:00'),
(3, 34, 'Canyons', 'Avicii', '00:07:29');

------------------------------------------------------

select nome 
from CD -- 1º

select nome, data_compra 
from CD 
order by nome -- 2º

select nome, data_compra 
from CD 
order by data_compra desc -- 3º

select sum(valor_pago) 
from CD -- 4º

select CD.cod_cd, m.nome
from CD, MUSICAS m
where CD.cod_cd=1 and CD.cod_cd = m.cod_cd -- 5º

select CD.nome, m.nome
from CD, MUSICAS m
where CD.cod_cd = m.cod_cd -- 6º

select nome, artista from MUSICAS -- 7º

select sum(tempo)
from MUSICAS -- 8º

select cod_musica, nome, tempo
from MUSICAS
where cod_cd=3 -- 9º

select sum(m.tempo), CD.nome
from MUSICAS m, CD
where m.cod_cd=CD.cod_cd
group by CD.nome -- 10º

select count(cod_musica)
from MUSICAS -- 11º

select avg(tempo)
from MUSICAS -- 12º

select count(cod_cd)
from CD -- 13º

select nome
from MUSICAS
where artista = 'Avicii' -- 14º

select CD.album, count(cod_musica)
from MUSICAS, CD
where MUSICAS.cod_cd=CD.cod_cd
group by CD.album -- 15º

select CD.album
from CD
where local_compra = 'Lojas Americanas'
group by CD.album -- 16º

select CD.nome, m.nome
from CD, MUSICAS m
where m.cod_cd=CD.cod_cd and m.cod_musica=10
group by CD.nome, m.nome -- 17º (Retorna só a primeira música)

select nome
FROM MUSICAS
order by nome -- 18º

select nome
from CD
where nome=album
order by nome -- 19º

select nome, max(valor_pago)
from CD
group by nome
order by nome
limit 1 -- 20º

--------------------------------- Testes
alter table CD rename to CDs
select * from CDs
alter table CDs rename to CD
alter table CD rename nome to nomes
select nomes from CD
alter table CD rename nomes to nome
 