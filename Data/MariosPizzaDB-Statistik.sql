SELECT * FROM marriospizza.statistik;
create table statistik(
Pizza_Nr int,
Pizza_name varchar(225),
Topping varchar(255),
Antal int,
Omsætning int
);
INSERT INTO statistik (Pizza_Nr, Pizza_name, Topping, Antal, Omsætning)
VALUES (1,"Vesuvio","Tomatsauce Ost Skinke og Oregano","",""),
(2,"Amerikaner","Tomatsauce Ost Oksefars og Oregano","",""),
(3,"Cacciatore","Tomatsauce Ost Opepperoni og Oregano","",""),
(4,"Carbona","Tomatsauce Ost Kødsauce Spaghetti Cocktailpølser og oregano","",""),
(5,"Dennis","Tomatsauce Ost Skinke Pepperoni Cocktailpølse og Oregano","",""),
(6,"Bertil","Tomatsauce Ost Bacon og Oregano","",""),
(7,"Silvia","Tomatsauce Ost Pepperoni Rød peber Løg Oliven og Oregano","",""),
(8,"Victoria","Tomatsauce Ost Skinke Ananas Champignon Løg og Oregano","",""),
(9,"Toronfo","Tomatsauce Ost Skinke Bacon Kebab Chili og Oregano","",""),
(10,"Capricciosa","Tomatsauce Ost Skinke Champignon og Oregano","",""),
(11,"Hawai","Tomatsauce Ost Skinke Ananas og Oregano","",""),
(12,"La Blissola","Tomatsauce Ost Skinke Rejer og Oregano","",""),
(13,"Venezia","Tomatsauce Ost Skinke Bacon og Oregano","",""),
(14,"Mafia","Tomatsauce Ost Pepperoni Bacon Løg og Oregano","","");

UPDATE statistik SET antal = antal + 1 WHERE Pizza_nr = 1;
  (SELECT * FROM statistik WHERE Pizza_nr = 1);
  
  SELECT p.Pizza_Nr, p.Pizza_name, p.Topping, p.Pris, (p.pris*s.antal) Omsætning from pizzamenu p, statistik s where p.Pizza_nr = s.Pizza_nr;
SELECT p.Pizza_Nr, p.Pizza_name, p.Topping, s.Antal, p.Pris, (p.pris*s.antal) Omsætning from pizzamenu p, statistik s where p.Pizza_nr = s.Pizza_nr ORDER BY Omsætning DESC;