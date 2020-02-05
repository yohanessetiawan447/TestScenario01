DROP TABLE IF EXISTS user;
 
CREATE TABLE user (
  id VARCHAR(25) NOT NULL,
  module_order VARCHAR(5) NOT NULL,
  module_name VARCHAR(25) NOT NULL
);

INSERT INTO user (id, module_order, module_name) VALUES("UserA", "1", "Promo");
INSERT INTO user (id, module_order, module_name) VALUES("UserA", "2", "Category");
INSERT INTO user (id, module_order, module_name) VALUES("UserA", "3", "FlashSale");
INSERT INTO user (id, module_order, module_name) VALUES("UserA", "4", "History");
INSERT INTO user (id, module_order, module_name) VALUES("UserA", "5", "News");
INSERT INTO user (id, module_order, module_name) VALUES("UserB", "1", "Promo");
INSERT INTO user (id, module_order, module_name) VALUES("UserB", "2", "News");
INSERT INTO user (id, module_order, module_name) VALUES("UserB", "3", "FlashSale");
INSERT INTO user (id, module_order, module_name) VALUES("UserB", "4", "Category");
INSERT INTO user (id, module_order, module_name) VALUES("UserC", "5", "News");
INSERT INTO user (id, module_order, module_name) VALUES("UserC", "1", "Promo");
INSERT INTO user (id, module_order, module_name) VALUES("UserC", "2", "FlashSale");
INSERT INTO user (id, module_order, module_name) VALUES("UserC", "3", "Category");
INSERT INTO user (id, module_order, module_name) VALUES("UserC", "4", "News");
INSERT INTO user (id, module_order, module_name) VALUES("UserC", "5", "History");