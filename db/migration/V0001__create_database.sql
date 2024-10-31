CREATE TABLE `Estoque` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `produtoId` BIGINT NOT NULL,
  `quantidade` INT NOT NULL,
  PRIMARY KEY (`id`));
