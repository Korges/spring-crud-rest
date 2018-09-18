DROP TABLE IF EXISTS public.customer;

CREATE TABLE public.customer
(
    id serial PRIMARY KEY NOT NULL,
    first_name VARCHAR(45) DEFAULT NULL ,
    last_name VARCHAR(45) DEFAULT NULL,
    email VARCHAR(45) DEFAULT NULL
);

ALTER SEQUENCE public.customer_id_seq
    RESTART WITH 6
    INCREMENT BY 1;
