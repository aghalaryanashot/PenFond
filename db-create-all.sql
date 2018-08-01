create table company (
  id                            bigserial not null,
  name                          varchar(255) not null,
  constraint pk_company primary key (id)
);

create table job_info (
  id                            bigserial not null,
  id_person                     bigint not null,
  id_company                    bigint not null,
  base_rate                     integer not null,
  date_arrival                  timestamptz,
  date_exit                     timestamptz,
  constraint pk_job_info primary key (id)
);

create table person (
  id                            bigserial not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  patronymic                    varchar(255),
  inn                           bigint not null,
  snils                         bigint not null,
  date_of_birth                 timestamptz not null,
  constraint pk_person primary key (id)
);

