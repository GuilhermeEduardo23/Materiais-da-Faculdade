CREATE TABLE ATENDENTE(
	id_atendente serial primary key,
	login varchar(15) not null,
	nome_atendente varchar(200) not null,
	dat_cadastro date not null
);

CREATE TABLE ATENDIMENTO(
	id_atendimento serial primary key,
	id_segurado int REFERENCES SEGURADO(id_segurado) not null,
	id_prestador int REFERENCES PRESTADOR(id_prestador) not null,
	id_atendente int REFERENCES ATENDENTE(id_atendente) not null,
	id_dispositivo varchar(200) not null,
	dat_hora_inicio time not null,
	dat_hora_fim time not null,
	tempo_estimado_atend time not null,
	local_disponivel char(1),
	latitude double not null,
	longitude double not null,
	id_servico int REFERENCES SERVICO(id_servico) not null,
	comentario varchar(1000),
	obs varchar(1000)
);

CREATE TABLE SEGURADO(
	id_segurado serial primary key,
	nome_segurado varchar(100) not null,
	CPFCNPJ varchar(15) not null,
	dat_cadastro date not null,
	dispositivo varchar(25) not null,
	celular varchar(12) not null
);

CREATE TABLE SOLICITACAO(
	id_solicitacao serial primary key,
	id_segurado int REFERENCES SEGURADO(id_segurado) not null,
	id_prestador int REFERENCES PRESTADOR(id_prestador) not null,
	id_atendente int REFERENCES ATENDENTE(id_atendente) not null,
	id_servico int REFERENCES SERVICO(id_servico) not null,
	id_dispositivo varchar(200) not null,
	dat_hora_inicio_solic time not null,
	local_disponivel char(1) not null,
	latitude double not null,
	longitude double not null,
	dat_hora_inic_atendimento time not null,
	atend_em_andamento boolean not null,
	solic_aceita boolean not null,
	placa_veiculo varchar(7) not null
);

CREATE TABLE NOTIFICACAO(
	id_notificacao serial primary key,
	dat_cadastro date not null,
	msg varchar(1000) not null,
	sequencia int not null,
	tipo_notificacao char(1) not null,
	id_solicitacao int REFERENCES SOLICITACAO(id_solicitacao) not null,
	id_atendimento int REFERENCES ATENDIMENTO(id_atendimento) not null,
	dat_transf_msg date not null
);

CREATE TABLE PRESTADOR(
	id_prestador serial primary key,
	nome_prestador varchar(200) not null,
	CPFCNPJ varchar(15) not null,
	dat_cadastro date not null,
	funcao varchar(100) not null
);

CREATE TABLE SEGURO_SEGURADO(
	id_seguro_segurado serial primary key,
	id_seguro int REFERENCES SEGURO(id_seguro) not null,
	id_segurado int REFERENCES SEGURADO(id_segurado) not null,
	id_veiculo int REFERENCES VEICULO(id_veiculo) not null,
	dat_inicio_vigencia date not null,
	dat_fim_vigencia date not null
);

CREATE TABLE VEICULO(
	id_veiculo serial primary key,
	modelo varchar(200) not null,
	marca varchar(200) not null,
	placa varchar(12) not null,
	chassi varchar(20) not null,
	dat_cadastro date not null
);

CREATE TABLE SEGURO(
	id_seguro serial primary key,
	descricao varchar(200) not null
);

CREATE TABLE SEGURO_SERVICO(
	id_servico int REFERENCES SERVICO(id_servico) not null,
	id_seguro int REFERENCES SEGURO(id_seguro) not null
);

CREATE TABLE SERVICO(
	id_servico serial primary key,
	dat_cadastro date not null,
	descricao varchar(200) not null,
	desc_abreviada varchar(50) not null
);

CREATE TABLE PRESTADOR_SERVICO(
	id_servico int REFERENCES SERVICO(id_servico) not null,
	id_prestador int REFERENCES PRESTADOR(id_prestador) not null
);