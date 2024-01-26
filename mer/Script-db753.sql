/* brModelo: */

CREATE TABLE Login (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    usuario VARCHAR(50) NOT NULL,
    senha VARCHAR(10) NOT NULL
);

CREATE TABLE Produto (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    preco FLOAT NOT NULL,
    quantidade INTEGER NOT NULL,
    descricao VARCHAR(100) NOT NULL
);
CREATE TABLE Cliente (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    Endereco VARCHAR(100) NOT NULL
);
CREATE TABLE Funcionario (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    senha VARCHAR(8) NOT NULL,
    confirmasenha VARCHAR(8) NOT NULL,
    nivelascesso VARCHAR(20) NOT NULL
);
CREATE TABLE Fornecedor (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cnpj VARCHAR(11) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    produto  VARCHAR(50) NOT NULL,
    endereco VARCHAR(100) NOT NULL
    /*FOREIGN KEY (produto) REFERENCES Produto(id)*/
    
);CREATE TABLE Comprar (
    id INTEGER(10) PRIMARY KEY AUTO_INCREMENT,
    produto VARCHAR(50) NOT NULL,
    quantidade VARCHAR(50) NOT NULL,
    valor FLOAT(10) NOT NULL,
    nomecliente VARCHAR(50) NOT NULL,
    funcionario VARCHAR(50)NOT NULL,
    datacompra TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
	/*FOREIGN KEY (produto) REFERENCES Produto(id),
    FOREIGN KEY (nomecliente) REFERENCES Cliente(id),
    FOREIGN KEY (funcionario) REFERENCES Funcionario(id)*/
);
