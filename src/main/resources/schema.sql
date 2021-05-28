

CREATE TABLE user (
    id   INTEGER   identity,
    name VARCHAR(128) unique NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE todo_list (
    id   INTEGER   identity,
    name VARCHAR(128) unique NOT NULL,
    user integer foreign key references user(id),
    PRIMARY KEY (id)
);



CREATE TABLE todo (
    id   INTEGER   identity,
    description VARCHAR(300)  NOT NULL,
    todolist integer foreign key references todo_list(id),
    PRIMARY KEY (id)
);