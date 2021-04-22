create table furniture_set (
    id integer not null auto_increment,
    name varchar(255),
    price integer,
    description varchar(255),
    primary key(id)
);
create table furniture (
    id integer not null auto_increment,
    name varchar(255),
    price integer,
    description varchar(255),
    primary key(id)
);
create table composition (
    id integer not null auto_increment,
    furniture_set_id integer,
    furniture_id integer,
    quantity integer,
    description varchar(255),
    primary key(id),
    FOREIGN KEY(furniture_set_id) REFERENCES furniture_set(id),
    FOREIGN KEY(furniture_id) REFERENCES furniture(id)
);
