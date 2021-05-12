--set simple user with uid: user, pwd: user
insert into USERS (id, username, password, address, email, fullname, instructions, mobile) values
(1, 'user', '$2a$10$RfGoQbp9Q5OI4LNBoXO.suQCuGxMT/dnIqgC6g35PTxf60x1TIjF6', 'add1', 'email1', 'fullname1', 'instruction1', '323233'),
(2, 'admin', '$2a$10$.J5fdM7YNK8UXRQIKt993.PEjR1AYjkQxKGp27vBKGQTrPi4e5I3m', 'admin', 'admin', 'admin', 'admin', '000000');

INSERT INTO restaurants VALUES (1,'Iowas, fairfield 6th street',' +1 01234-56789, +1 01234-56789','105423.jpg','15-20 min','Classic Burger Joint: Secrets Revealed. It\'s become the face of the Lebanese-born burger chain serving up delicious flame-grilled burgers and seasoned fries','','','','\0','Classic Burger','Burger.jpg');
INSERT INTO restaurants VALUES (2,'Iowas, fairfield 6th street',' +1 01234-56789, +1 01234-56789','105423.jpg','15-20 min','Classic Burger Joint: Secrets Revealed. It\'s become the face of the Lebanese-born burger chain serving up delicious flame-grilled burgers and seasoned fries','','','','\0','Roadster','sand.jpg');
INSERT INTO restaurants VALUES (3,'Iowas, fairfield 6th street',' +1 01234-56789, +1 01234-56789','105423.jpg','15-20 min','Classic Burger Joint: Secrets Revealed. It\'s become the face of the Lebanese-born burger chain serving up delicious flame-grilled burgers and seasoned fries','','','','\0','Pizza Nini','Pizza.jpg');
INSERT INTO restaurants VALUES (4,'Iowas, fairfield 6th street',' +1 01234-56789, +1 01234-56789','105423.jpg','15-20 min','Classic Burger Joint: Secrets Revealed. It\'s become the face of the Lebanese-born burger chain serving up delicious flame-grilled burgers and seasoned fries','','','','\0','Bite me','Indian.jpg');
INSERT INTO restaurants VALUES (5,'Iowas, fairfield 6th street',' +1 01234-56789, +1 01234-56789','105423.jpg','15-20 min','Classic Burger Joint: Secrets Revealed. It\'s become the face of the Lebanese-born burger chain serving up delicious flame-grilled burgers and seasoned fries','','','','\0','Italian House','Pasta.jpg');


INSERT INTO items_category VALUES (1,'Dishes');
INSERT INTO items_category VALUES (2, 'Sandwiches');
INSERT INTO items_category VALUES (3, 'Salads');
INSERT INTO items_category VALUES (4, 'Drinks');
--
--
INSERT INTO items_type VALUES (1,'Veg','text-success');
INSERT INTO items_type VALUES (2,'Chicks','text-warning');
INSERT INTO items_type VALUES (3,'Beef','text-danger');
INSERT INTO items_type VALUES (4,'Fish','text-info');
INSERT INTO items_type VALUES (5,'Other','text-muted');
--
--
INSERT INTO restaurant_items VALUES (1,'Ground Chicken, onion, and garlic over medium heat until well browned','Chicken Tikka Meal','Large Dish',6.3,1,2,1);
INSERT INTO restaurant_items VALUES (2,'Cook sausage, ground Chicken, onion, and garlic over medium heat until well browned','Chicken Fajita Meal','Large Dish',6.7,1,2,1);
INSERT INTO restaurant_items VALUES (3,'Cook sausage, ground Chicken, onion, and garlic over medium heat until well browned','Chicken Fajita Meal','Large Dish',6.7,1,2,1);
INSERT INTO restaurant_items VALUES (4,'Cook sausage, ground Chicken, onion, and garlic over medium heat until well browned','Chicken Fajita','30 cm',3.2,2,2,1);
INSERT INTO restaurant_items VALUES (5,'Cook sausage, ground Beef, onion, and garlic over medium heat until well browned','Steak Fajita','30 cm',3.2,2,3,1);
INSERT INTO restaurant_items VALUES (6,'Cook sausage, ground Beef, onion, and garlic over medium heat until well browned','Steak Submarin','30 cm',3.2,2,3,1);
INSERT INTO restaurant_items VALUES (7,'Tomato, Corn, Tuna, Crab, Fish','Seafood Salad','Large Dish for Two',7.5,3,4,1);
INSERT INTO restaurant_items VALUES (8,NULL,'Pepsi','Can',1,4,5,1);
--
--
--
