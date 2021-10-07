CREATE TABLE Alunos
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR,
    rg int,
    cpf VARCHAR,
    endereco VARCHAR,
    curso VARCHAR

);

INSERT INTO Alunos (nome, rg,  cpf, endereco, curso) VALUES ('evandro', 1234567, 12345678912, 'Rua castor de sena', 'internet');
INSERT INTO Alunos (nome, rg,  cpf, endereco, curso) VALUES ('debora', 7419632, 74185236912, 'Rua castor de sena', 'enfermagem');
