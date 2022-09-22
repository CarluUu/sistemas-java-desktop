/**
 * Author:  Gelvazio Camargo
 * Created: 14 de set. de 2022
 */

-- criando tabelas do banco de dados...

create table public.tbpessoa( 
    pescodigo serial not null,
    pesnome varchar(200) not null,
    pesendereco varchar(200) not null,
    pescpf varchar(20) not null,
    CONSTRAINT pk_tbpessoa 
    PRIMARY KEY (pescodigo)
);

