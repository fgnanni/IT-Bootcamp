CREATE TABLE `endereco` (
  `endereco` varchar(244),
  `numero` varchar(10),
  `complemento` varchar(25),
  `fk_cliente_id` int
);

CREATE TABLE `cliente` (
  `cliente_id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(244)
);

CREATE TABLE `produto` (
  `produto_id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(100)
);

CREATE TABLE `pedido` (
  `pedido_id` int PRIMARY KEY AUTO_INCREMENT,
  `quantidade` int,
  `preco` double,
  `fk_cliente_id` int,
  `fk_produto_id` int,
  `criado_em` date DEFAULT (now()) COMMENT 'created time'
);

CREATE TABLE `estoque` (
  `fk_produto_id` int,
  `quantidade` int
);

ALTER TABLE `pedido` ADD FOREIGN KEY (`fk_cliente_id`) REFERENCES `cliente` (`cliente_id`);

ALTER TABLE `pedido` ADD FOREIGN KEY (`fk_produto_id`) REFERENCES `produto` (`produto_id`);

ALTER TABLE `endereco` ADD FOREIGN KEY (`fk_cliente_id`) REFERENCES `cliente` (`cliente_id`);

ALTER TABLE `estoque` ADD FOREIGN KEY (`fk_produto_id`) REFERENCES `produto` (`produto_id`);
