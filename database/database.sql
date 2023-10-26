CREATE DATABASE usuarios

CREATE SEQUENCE pessoas_seq START WITH 1 INCREMENT BY 1;

-- Em seguida, crie a tabela "pessoas"
CREATE TABLE pessoas (
    id NUMBER DEFAULT pessoas_seq.NEXTVAL PRIMARY KEY,
    nome VARCHAR2(50),
    senha VARCHAR2(50)
);

CREATE OR REPLACE TRIGGER check_senha
BEFORE INSERT ON pessoas
FOR EACH ROW
BEGIN
    IF :NEW.senha = '123' THEN
        RAISE_APPLICATION_ERROR(-20001, 'Senha não permitida: 123');
    END IF;
END;
/ 