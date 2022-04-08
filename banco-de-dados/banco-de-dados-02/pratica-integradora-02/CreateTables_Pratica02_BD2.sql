use integradora02;

 CREATE TABLE IF NOT EXISTS `funcionario` (
	`cod_fuc` varchar(6) PRIMARY KEY,
    `nome` varchar(50),
    `sobrenome` varchar(50),
    `cargo` varchar(100),
    `data_alta` varchar(10),
    `salario` double,
    `comissao` double,
    `depto_nro` varchar(7)
);

CREATE TABLE IF NOT EXISTS `departamento` (
	`depto_nro` varchar(7) PRIMARY KEY,
    `nome_depto` varchar(100),
    `localizacao` varchar(100)
);

ALTER TABLE `funcionario` ADD FOREIGN KEY (`depto_nro`) REFERENCES `departamento` (`depto_nro`);

INSERT INTO `departamento` (`depto_nro`, `nome_depto`, `localizacao`) VALUES ("D-000-1", "Software", "Los Tigres");
INSERT INTO `departamento` (`depto_nro`, `nome_depto`, `localizacao`) VALUES ("D-000-2", "Sistemas", "Guadalupe");
INSERT INTO `departamento` (`depto_nro`, `nome_depto`, `localizacao`) VALUES ("D-000-3", "Contabilidade", "La Roca");
INSERT INTO `departamento` (`depto_nro`, `nome_depto`, `localizacao`) VALUES ("D-000-4", "Vendas", "Plata");

INSERT INTO `funcionario` (`cod_fuc`, `nome`, `sobrenome`, `cargo`, `data_alta`, `salario`, `comissao`, `depto_nro`) 
		VALUES ("E-0001", "César", "Piñero", "Vendedor", "12/05/2018", 8000, 15000, "D-000-4");
INSERT INTO `funcionario` (`cod_fuc`, `nome`, `sobrenome`, `cargo`, `data_alta`, `salario`, `comissao`, `depto_nro`) 
		VALUES ("E-0002", "Yosep", "Kowaleski", "Analista", "14/07/2015", 140000, 0, "D-000-2");
INSERT INTO `funcionario` (`cod_fuc`, `nome`, `sobrenome`, `cargo`, `data_alta`, `salario`, `comissao`, `depto_nro`) 
		VALUES ("E-0003", "Mariela", "Barrios", "Diretor", "05/06/2014", 185000, 0, "D-000-3");
INSERT INTO `funcionario` (`cod_fuc`, `nome`, `sobrenome`, `cargo`, `data_alta`, `salario`, `comissao`, `depto_nro`) 
		VALUES ("E-0004", "Jonathan", "Aguilere", "Vendedor", "03/06/2015", 85000, 10000, "D-000-4");
INSERT INTO `funcionario` (`cod_fuc`, `nome`, `sobrenome`, `cargo`, `data_alta`, `salario`, `comissao`, `depto_nro`) 
		VALUES ("E-0005", "Daniel", "Brezezicki", "Vendedor", "03/03/2018", 83000, 10000, "D-000-4");
INSERT INTO `funcionario` (`cod_fuc`, `nome`, `sobrenome`, `cargo`, `data_alta`, `salario`, `comissao`, `depto_nro`) 
		VALUES ("E-0006", "Mito", "Barchuk", "Presidente", "05/06/2014", 190000, 0, "D-000-3");
INSERT INTO `funcionario` (`cod_fuc`, `nome`, `sobrenome`, `cargo`, `data_alta`, `salario`, `comissao`, `depto_nro`) 
		VALUES ("E-0007", "Emilio", "Galarza", "Desenvolvedor", "02/08/2014", 60000, 0, "D-000-1");