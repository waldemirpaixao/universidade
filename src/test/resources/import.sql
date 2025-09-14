
INSERT INTO cidade (idcidade, nomecidade, uf) VALUES
(1, 'Aracaju','SE'),
(2, 'Barra dos Coqueiros', 'SE'),
(3,'Socorro', 'SE' ),
(4, 'São Cristóvão','SE');

INSERT INTO aluno (id, cpf, dtnascimento,endereco,primeiroNome,segundoNome, sexo, idcidade, ultimoNome) VALUES
(1, '022.384.695-32','2024-10-30','Setor leste quadra 19 lote 50', 'Waldemir','', 'M', 1, ''),
(2, '099.384.695-32','2015-08-28','Setor leste quadra 19 lote 50', 'Waldemir Santos Silva Paixão Filho', '','M', 1, '');

INSERT INTO telefone (idTelefone, ddd, id, numero, observacao, tipo) VALUES
(1, '(79)',  1, '99119-7359','Telefone pessoal','Celular');