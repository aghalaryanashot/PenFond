alter table if exists job_info drop constraint if exists fk_job_info_person_id;
drop index if exists ix_job_info_person_id;

alter table if exists job_info drop constraint if exists fk_job_info_company_id;
drop index if exists ix_job_info_company_id;

drop table if exists company cascade;

drop table if exists job_info cascade;

drop table if exists person cascade;

