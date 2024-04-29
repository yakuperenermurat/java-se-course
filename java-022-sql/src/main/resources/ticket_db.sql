CREATE TABLE public.mytable2
(
    id bigserial NOT NULL,
    adi character varying(30) NOT NULL,
    soyadi character varying(50),
    yas integer DEFAULT 0,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.mytable2
    OWNER to postgres;