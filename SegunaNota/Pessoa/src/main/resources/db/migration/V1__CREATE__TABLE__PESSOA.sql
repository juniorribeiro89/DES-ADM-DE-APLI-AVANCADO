CREATE TABLE TB_PESSOA
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR,
    email VARCHAR ,
    telefone VARCHAR,

);

INSERT INTO TB_PESSOA (nome, email,  telefone)
VALUES ('Junior', '5555555', '88888888888',  'Mecanica');
INSERT INTO TB_PESSOA (nome, email,  telefone)
VALUES ('Leonardo', '111111', '77777777777',  'Engenharia Civil');
INSERT INTO TB_PESSOA (nome, email,  telefone)
VALUES ('Jaira', '2222222', '66666666666',  'Veterinaria');
INSERT INTO TB_PESSOA (nome, email,  telefone)
VALUES ('Carlos', '444444', '36363636363',  'Marinheiro');
