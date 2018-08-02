create table company (
  id                            bigserial not null,
  name                          varchar(255) not null,
  constraint pk_company primary key (id)
);

create table job_info (
  id                            bigserial not null,
  person_id                     bigint,
  company_id                    bigint,
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
  date_of_birth                 timestamptz,
  constraint pk_person primary key (id)
);

alter table job_info add constraint fk_job_info_person_id foreign key (person_id) references person (id) on delete restrict on update restrict;
create index ix_job_info_person_id on job_info (person_id);

alter table job_info add constraint fk_job_info_company_id foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_job_info_company_id on job_info (company_id);

