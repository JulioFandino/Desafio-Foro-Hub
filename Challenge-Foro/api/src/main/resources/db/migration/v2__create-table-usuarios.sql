--Creacion tabla usuarios
create table usuarios(

    id bigint not null auto_increment,
    nombre varchar(100) not null unique,
    email varchar(100) not null unique,
    clave varchar(300) not null,

    primary key(id)
);
