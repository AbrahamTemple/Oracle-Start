# 安装篇

``` shell

SQL> create tablespace vuepress_blog datafile 'E:/oracle/tbspace/vuepress_blog.dbf' size 100m;

表空间已创建。

SQL> create user admin identified by admin16 default tablespace vuepress_blog;

用户已创建。

SQL> grant dba to admin;

授权成功。

--查询当前实例对象

SQL> select instance_name from v$instance;

INSTANCE_NAME
----------------
orcl

SQL> conn admin/admin16@orcl

SQL> select * from dual;

D
-
X

```

# 入门篇

``` mysql
create table product(
       p_name varchar2(20),              --oracle推荐使用varchar2可变字符长度
       p_price number(4,2),              --number(总长度,小数长度)
       p_time date,
       p_category varchar2(5)
);

--添加列
alter table product add (
      p_weight number(4,2),
      p_color varchar2(5)
);

--修改列类型
alter table product modify p_weight varchar2(10);

alter table product drop column p_weight;

drop table product;

create table product(
       p_id number primary key,   --设置主键约束
       p_name varchar2(10) unique,             --设置唯一约束
       p_time date not null,      --设置非空约束
       p_category varchar(5) not null, --设置非空
       p_color varchar2(6) check (p_color in ('红','黄','蓝')) --设置检查约束 
);

insert into product values(1,'柠檬茶',current_date,'饮料','黄');
insert into product values(2,'鸡尾酒',current_date,'酒类','蓝');
insert into product values(3,'西瓜汁',current_date,'甜品','红');

select * from product

--外键关联表
create table category(
       c_id number primary key,
       c_name varchar(10) not null
);

delete from product

insert into category values(1,'酒类');
insert into category values(2,'饮料');
insert into category values(3,'甜品');

--数字类型
alter table product modify p_category number;

--添加外键
alter table product add foreign key(p_category) references category(c_id);

insert into product values(1,'柠檬茶',current_date,2,'黄');
insert into product values(2,'鸡尾酒',current_date,1,'蓝');
insert into product values(3,'西瓜汁',current_date,3,'红');
insert into product values(4,'草莓圣代',current_date,3,'红');
insert into product values(5,'葡萄酒',current_date,1,'蓝');
insert into product values(6,'东鹏特饮',current_date,2,'黄');

select * from product
select * from category

select p.p_name,c.c_name from product p
       left join category c on p.p_category = c.c_id
       where c.c_id = 3

```