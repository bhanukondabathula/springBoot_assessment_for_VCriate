INSERT INTO product (name, quantity) VALUES ('Product A', 100);
INSERT INTO product (name, quantity) VALUES ('Product B', 150);

INSERT INTO supplier (name, contact_details) VALUES ('Supplier A', 'contact@suppliera.com');
INSERT INTO supplier (name, contact_details) VALUES ('Supplier B', 'contact@supplierb.com');

INSERT INTO orders (order_date, product_id, quantity, status) VALUES (CURRENT_TIMESTAMP, 1, 10, 'Fulfilled');
INSERT INTO orders (order_date, product_id, quantity, status) VALUES (CURRENT_TIMESTAMP, 2, 20, 'Pending');