SELECT * FROM marriospizza.pizzamenu;
Create TABLE Pizzamenu (
Pizza_Nr int,
Pizza_name varchar(225),
Topping varchar(255),
Pris int
);
Select * from pizzamenu; 
INSERT INTO pizzamenu (Pizza_Nr, Pizza_name, Topping, Pris)
VALUES (1,"Vesuvio","Tomatsauce Ost Skinke og Oregano",57),
(2,"Amerikaner","Tomatsauce Ost Oksefars og Oregano",53),
(3,"Cacciatore","Tomatsauce Ost Opepperoni og Oregano",57),
(4,"Carbona","Tomatsauce Ost Kødsauce Spaghetti Cocktailpølser og oregano",63),
(5,"Dennis","Tomatsauce Ost Skinke Pepperoni Cocktailpølse og Oregano",65),
(6,"Bertil","Tomatsauce Ost Bacon og Oregano",57),
(7,"Silvia","Tomatsauce Ost Pepperoni Rød peber Løg Oliven og Oregano",61),
(8,"Victoria","Tomatsauce Ost Skinke Ananas Champignon Løg og Oregano",61),
(9,"Toronfo","Tomatsauce Ost Skinke Bacon Kebab Chili og Oregano",61),
(10,"Capricciosa","Tomatsauce Ost Skinke Champignon og Oregano",61),
(11,"Hawai","Tomatsauce Ost Skinke Ananas og Oregano",61),
(12,"La Blissola","Tomatsauce Ost Skinke Rejer og Oregano",61),
(13,"Venezia","Tomatsauce Ost Skinke Bacon og Oregano",61),
(14,"Mafia","Tomatsauce Ost Pepperoni Bacon Løg og Oregano",61);

SELECT * FROM marriospizza.pizzamenu;
select (p.pris*s.antal) Total, p.pris, s.antal from pizzamenu p, statistik s 
where p.Pizza_nr = s.Pizza_nr;
select sum(p.pris*s.antal) Total from pizzamenu p, statistik s 
where p.Pizza_nr = s.Pizza_nr;