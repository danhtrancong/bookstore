INSERT INTO role (id, timestamp_created, timestamp_updated, name) VALUES (1, current_timestamp(), current_timestamp(),'ADMIN');
INSERT INTO role (id, timestamp_created, timestamp_updated, name) VALUES (2, current_timestamp(), current_timestamp(),'EMPLOYEE');
INSERT INTO role (id, timestamp_created, timestamp_updated, name) VALUES (3, current_timestamp(), current_timestamp(),'CUSTOMER');

INSERT INTO USER(id, timestamp_created, timestamp_updated, email, full_name, password, phone_number) VALUES (1, current_timestamp(), current_timestamp(),'admin@gmail.com','Admin','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 0123456789); 
INSERT INTO USER(id, timestamp_created, timestamp_updated, email, full_name, password, phone_number) VALUES (2, current_timestamp(), current_timestamp(),'employee@gmail.com','Employee','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 0123456789); 
INSERT INTO USER(id, timestamp_created, timestamp_updated, email, full_name, password, phone_number) VALUES (3, current_timestamp(), current_timestamp(),'customer@gmail.com','Customer','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 0123456789); 

INSERT INTO user_role(user_id, role_id) VALUES (1, 1); 
INSERT INTO user_role(user_id, role_id) VALUES (2, 2); 
INSERT INTO user_role(user_id, role_id) VALUES (3, 3); 

insert into category(id, name, timestamp_created, timestamp_updated) values (1,'Literary', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (2,'Economy', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (3,'Science', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (4,'Mentality', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (5,'Children', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (6,'Consumption', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (7,'Action and adventure', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (8,'Alternate history', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (9,'Anthology', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (10,'Comic book', current_timestamp(), current_timestamp());
insert into category(id, name, timestamp_created, timestamp_updated) values (11,'History', current_timestamp(), current_timestamp());

   