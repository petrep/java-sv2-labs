CREATE TABLE track_point (id INT, tp_time DATE, lat DOUBLE(9, 7), lon DOUBLE(10, 7), FOREIGN KEY (id) REFERENCES activities(id));

-- MySQL permits a nonstandard syntax: FLOAT(M,D) or REAL(M,D) or DOUBLE PRECISION(M,D).
-- Here, (M,D) means than values can be stored with up to M digits in total, of which D digits may be after the decimal point.
-- For example, a column defined as FLOAT(7,4) is displayed as -999.9999.
-- MySQL performs rounding when storing values, so if you insert 999.00009 into a FLOAT(7,4) column, the approximate result is 999.0001.
-- As of MySQL 8.0.17, the nonstandard FLOAT(M,D) and DOUBLE(M,D) syntax is deprecated and you should expect support for it to be removed in a future version of MySQL.