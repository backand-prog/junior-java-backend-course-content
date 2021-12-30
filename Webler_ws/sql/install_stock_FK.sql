-- stock DB létrehozása
CREATE SCHEMA `stock` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci;


use `stock`;
-- product_category tábla létrehozása
CREATE TABLE `stock`.`product_category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `status` TINYINT(1) NULL DEFAULT 1,
  `created_at` TIMESTAMP NULL,
  PRIMARY KEY (`id`));
  
  -- néhány beszúrás
INSERT INTO `stock`.`product_category` (`name`, `created_at`) VALUES ('notebook', now());
INSERT INTO `stock`.`product_category` (`name`,`created_at`) VALUES ('asztali pc',now());

-- product tábla létrehozás
CREATE TABLE `stock`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `category_id` INT NULL,
  PRIMARY KEY (`id`));
  
  INSERT INTO stock.product (name, category_id) VALUES ("DELL", 1);
  INSERT INTO stock.product (name, category_id) VALUES ("LENOVO", 2);
  INSERT INTO stock.product (name, category_id) VALUES ("HP noti", 1);
  INSERT INTO stock.product (name, category_id) VALUES ("ASUS notebook", 2);
  
ALTER TABLE `stock`.`product` 
ADD CONSTRAINT `category_FK`
  FOREIGN KEY (`category_id`)
  REFERENCES `stock`.`product_category` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `stock`.`product` 
DROP FOREIGN KEY `category_FK`;
ALTER TABLE `stock`.`product` 
ADD CONSTRAINT `category_FK`
  FOREIGN KEY (`category_id`)
  REFERENCES `stock`.`product_category` (`id`)
  ON DELETE SET NULL
  ON UPDATE CASCADE;

UPDATE `stock`.`product_category` SET `name` = 'Asztali pc' WHERE (`id` = '2');

UPDATE `stock`.`product_category` SET `id` = '4', `status` = '1' WHERE (`id` = '2');

