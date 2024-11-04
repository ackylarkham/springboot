INSERT INTO employee(id,name,age)
VALUES('1','Tom',30);

INSERT INTO m_user (user_id, password, user_name, date_of_birth, gender, department_id, role)
VALUES
    ('sysadm@example.com', 'password', 'システム管理者', '2000-01-01', 1, 1,'ROLE_ADMIN') 
    , ('user@example.com', 'password', 'ユーザー1', '2000-01-01', 2, 2,'ROLE_GENERAL')
;

INSERT INTO m_department (
    department_id
    , department_name
)
VALUES
    (1, 'システム管理部')
    , (2, '営業部')
;

INSERT INTO t_salary (
    user_id
    , year_month
    , salary
)
VALUES
    ('user@example.com','2024/01',280000)
    , ('user@example.com','2024/02',300000)
    , ('user@example.com','2024/03',300000)
;
