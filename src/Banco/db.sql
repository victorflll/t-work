CREATE DATABASE TWORKPROJECT;
USE TWORKPROJECT;

CREATE TABLE TRABALHADOR(
	LOGIN VARCHAR(20),
	SENHA VARCHAR(10),
	NOME VARCHAR(50),
        DATANASCIMENTO VARCHAR(15),
        ENDEREÇO VARCHAR(200),
        CPF VARCHAR(30),
        TELEFONE VARCHAR(20),
        DESCRIÇÃO VARCHAR(200),
        ESPECIALIDADES VARCHAR(200),
        
        CONSTRAINT TRABALHADOR_PK PRIMARY KEY(CPF)
);

CREATE TABLE EMPRESA(
	LOGIN VARCHAR(20),
	SENHA VARCHAR(10),
	NOME VARCHAR(50),
        DATAABERTURA VARCHAR(15),
        ENDEREÇO VARCHAR(200),
        CNPJ VARCHAR(30),
        TELEFONE VARCHAR(20),
        DESCRIÇÃO VARCHAR(200),
        NECESSIDADE VARCHAR(200),
        VAGAS INT,
        
        CONSTRAINT EMPRESA_PK PRIMARY KEY(CNPJ)
);

CREATE TABLE MATCHH(
	CPF_FK VARCHAR(30),
        CNPJ_FK VARCHAR(30),
        
        CONSTRAINT MATCH_PK PRIMARY KEY(CPF_FK, CNPJ_FK),
        CONSTRAINT MATCH_FK1 FOREIGN KEY(CPF_FK) REFERENCES TRABALHADOR(CPF),
	CONSTRAINT MATCH_FK2 FOREIGN KEY(CNPJ_FK) REFERENCES EMPRESA(CNPJ)
);