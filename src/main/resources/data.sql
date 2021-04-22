insert into furniture_set (name, price, description) values ('Стенка Коста', 915, 'Цвет:	венге/прованс');
insert into furniture_set (name, price, description) values ('Стенка Марсель', 727, 'Цвет: венге/белый глянец');
insert into furniture_set (name, price, description) values ('Стенка Гамма', 915, 'Цвет: венге/дуб');

insert into furniture (name, price, description) values ('Тумбочка',50,'для книг');
insert into furniture (name, price, description) values ('Комод',65,'для белья');
insert into furniture (name, price, description) values ('Полка',35,'для посуды');
insert into furniture (name, price, description) values ('Шкаф',105,'для одежды');

insert into composition (furniture_set_id, furniture_id, quantity, description) values (1,1,2,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (1,2,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (1,3,2,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (1,4,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (2,1,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (2,2,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (2,3,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (2,4,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (3,1,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (3,2,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (3,3,1,'');
insert into composition (furniture_set_id, furniture_id, quantity, description) values (3,4,2,'');
