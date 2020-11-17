drop table if exists books;
create table books (id int, title varchar(50),author varchar(50),price float,qty int, primary key (id));
insert into books values

  (1001,"Java for dummies", "Tan Ah Teck", 11.11,11),
  (1002, "More Java for dummies", "Tan Ah Teck",22.22,22),
  (1003,"More Java for more dummies", "Mohammad Ali", 33.33,33),
  (1004, "A cup of Java", "Kumar",44.44,44),
  (1005, "A Teaspoon of Java", "Kevin Jones",55.55,55);
