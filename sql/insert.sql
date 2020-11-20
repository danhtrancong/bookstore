/* Populate ROLE Table */
INSERT INTO role(id,timestamp_created,timestamp_updated,name) VALUES (1,current_timestamp(),current_timestamp(),'ADMIN');
INSERT INTO role(id,timestamp_created,timestamp_updated,name) VALUES (2,current_timestamp(),current_timestamp(),'EMPLOYEE');
INSERT INTO role(id,timestamp_created,timestamp_updated,name) VALUES (3,current_timestamp(),current_timestamp(),'CUSTOMER');

/* Populate USER Table */
INSERT INTO user(id,timestamp_created,timestamp_updated,email,full_name,password,phone_number)
VALUES (1,current_timestamp(),current_timestamp(),'admin@gmail.com','admin account','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm','0903085927');

INSERT INTO user(id,timestamp_created,timestamp_updated,email,full_name,password,phone_number)
VALUES (2,current_timestamp(),current_timestamp(),'employee@gmail.com','Employee account','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm','0903085927');

INSERT INTO user(id,timestamp_created,timestamp_updated,email,full_name,password,phone_number)
VALUES (3,current_timestamp(),current_timestamp(),'customer@gmail.com','Customer account','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm','0903085927');


/* Populate USER_PROFILE Table */
insert into user_role( user_id,role_id) values(1,1);
insert into user_role( user_id,role_id) values(2,2);
insert into user_role( user_id,role_id) values(3,3);


/* Populate CATEGORY Table */
INSERT INTO category(id,timestamp_created,timestamp_updated,name) VALUES (1,current_timestamp(),current_timestamp(),'Literary');

INSERT INTO category(id,timestamp_created,timestamp_updated,name) VALUES (2,current_timestamp(),current_timestamp(),'Comic');

INSERT INTO category(id,timestamp_created,timestamp_updated,name) VALUES (3,current_timestamp(),current_timestamp(),'Action and adventure');

INSERT INTO category(id,timestamp_created,timestamp_updated,name) VALUES (4,current_timestamp(),current_timestamp(),'Poetry');

INSERT INTO category(id,timestamp_created,timestamp_updated,name) VALUES (5,current_timestamp(),current_timestamp(),'Thriller');

INSERT INTO category(id,timestamp_created,timestamp_updated,name) VALUES (6,current_timestamp(),current_timestamp(),'Romance');


/* Populate LANGUAGE Table */
INSERT INTO language(id,timestamp_created,timestamp_updated,name) VALUES (1,current_timestamp(),current_timestamp(),'English');

INSERT INTO language(id,timestamp_created,timestamp_updated,name) VALUES (2,current_timestamp(),current_timestamp(),'Viet Nam');

INSERT INTO language(id,timestamp_created,timestamp_updated,name) VALUES (3,current_timestamp(),current_timestamp(),'Italian');

INSERT INTO language(id,timestamp_created,timestamp_updated,name) VALUES (4,current_timestamp(),current_timestamp(),'Spanish');

INSERT INTO language(id,timestamp_created,timestamp_updated,name) VALUES (5,current_timestamp(),current_timestamp(),'Thai Land');


/* Populate PRODUCT Table */
INSERT INTO product(id,timestamp_created,timestamp_updated,imageUrl, name,originalPrice, sallingPrice,category_id,language_id, summary)
VALUES (1,current_timestamp(),current_timestamp(),"static/asset/product-images/harry01.jpg", "Harry Potter and the Sorcerer's Stone", 375000, 330000,3,1,"Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry.");

INSERT INTO product(id,timestamp_created,timestamp_updated,imageUrl, name,originalPrice, sallingPrice,category_id,language_id, summary)
VALUES (2,current_timestamp(),current_timestamp(),"static/asset/product-images/pinocchio.jpg", "Pinocchio", 175000, 170000,2,2,'Pinocchio - Chú bé người gỗ Kể tóm lược theo tiểu thuyết "Cuộc phiêu lưu của Pinocchio" của tác giả Carlo Collodi.');

INSERT INTO product(id,timestamp_created,timestamp_updated,imageUrl, name,originalPrice, sallingPrice,category_id,language_id, summary)
VALUES (3,current_timestamp(),current_timestamp(),"static/asset/product-images/alice01.jpg", "Alice's Adventures in Wonderland", 220000, 183000,1,2,'Cuộc phiêu lưu của Alice vào Xứ Sở Thần Tiên (tiếng Anh: Alice\'s Adventures in Wonderland) là cuốn tiểu thuyết dành cho thiếu nhi của tác giả người Anh Charles Lutwidge Dodgson dưới bút danh Lewis Carroll viết năm 1865. Câu chuyện kể về cô bé Alice chui qua một hang thỏ rồi lạc vào thế giới thần tiên có những sinh vật kì lạ.' );

INSERT INTO product(id,timestamp_created,timestamp_updated,imageUrl, name,originalPrice, sallingPrice,category_id,language_id, summary)
VALUES (4,current_timestamp(),current_timestamp(),"static/asset/product-images/catcher.jpg", "Catcher in the Rye", 269000, 268000,6,1,'The Catcher in the Rye is a novel by J. D. Salinger, partially published in serial form in 1945–1946 and as a novel in 1951. It was originally intended for adults, but is often read by adolescents for its themes of angst and alienation, and as a critique on superficiality in society. It has been translated widely.');

INSERT INTO product(id,timestamp_created,timestamp_updated,imageUrl, name,originalPrice, sallingPrice,category_id,language_id, summary)
VALUES (5,current_timestamp(),current_timestamp(),"static/asset/product-images/don.jpg", "Don Quixote", 199000, 177000,4,1,'The plot revolves around the adventures of a noble (hidalgo) from La Mancha named Alonso Quixano, who reads so many chivalric romances that he loses his mind and decides to become a knight-errant (caballero andante) to revive chivalry and serve his nation, under the name Don Quixote de la Mancha.');

INSERT INTO product(id,timestamp_created,timestamp_updated,imageUrl, name,originalPrice, sallingPrice,category_id,language_id, summary)
VALUES (6,current_timestamp(),current_timestamp(),"static/asset/product-images/lordoftherings.jpg", "Lord of the Rings", 319000, 250000,3,2,'The Lord of the Rings is a film series of three epic fantasy adventure films directed by Peter Jackson, based on the novel written by J. R. R. Tolkien. The films are subtitled The Fellowship of the Ring (2001), The Two Towers (2002), and The Return of the King (2003).');
