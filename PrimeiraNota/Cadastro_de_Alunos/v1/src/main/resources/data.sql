CREATE TABLE Alunos
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR,
    rg VARCHAR,
    cpf VARCHAR,
    endereco VARCHAR,
    curso VARCHAR

);

INSERT INTO Alunos (nome, rg,  cpf, endereco, curso) 
VALUES ('Junior', '1234567', '98765432198', 'Rua S.B', 'Internet');
INSERT INTO Alunos (nome, rg,  cpf, endereco, curso)
 VALUES ('Leonardo', '5556667', '12457896852', 'Rua A.A', 'Radiologia');
INSERT INTO Alunos (nome, rg,  cpf, endereco, curso) 
VALUES ('Jaira', '1234567', '98765432198', 'Rua S.B', 'Moda e Artes');
INSERT INTO Alunos (nome, rg,  cpf, endereco, curso) 
VALUES ('Carlos', '1234567', '98765432198', 'Rua S.B', 'Mecanica');
