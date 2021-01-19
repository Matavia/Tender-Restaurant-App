
CREATE TABLE address
(

id              serial,
house_number    varchar(16) NOT NULL,
street          varchar(64) NOT NULL,
street2         varchar(64),
city            varchar(64) NOT NULL,
province        varchar(64) NOT NULL,
postal_code     varchar(16) NOT NULL,

CONSTRAINT pk_address PRIMARY KEY (id)
);

CREATE TABLE person
(

id              serial PRIMARY KEY,
first_name      varchar(64),
last_name       varchar(64),
date_added      TIMESTAMP NOT NULL DEFAULT now() --keyword to use timestamps
);


INSERT INTO person(first_name, last_name) VALUES ('Katherine', 'Johnson');

SELECT * FROM person;

CREATE TABLE person_address
(

person_id       int             NOT NULL,
address_id      int             NOT NULL,
is_primary      boolean         NOT NULL DEFAULT false,
is_billing      boolean         NOT NULL DEFAULT false,

        CONSTRAINT pk_person_address PRIMARY KEY (person_id, address_id),
--      constraint name            constraint type (column) references table(column)
        CONSTRAINT fk_person_id_id FOREIGN KEY (person_id) REFERENCES person(id),
        CONSTRAINT fk_address_id_id FOREIGN KEY (address_id) REFERENCES person(id)
);      


COMMIT;


-- Can have multiple primary keys

