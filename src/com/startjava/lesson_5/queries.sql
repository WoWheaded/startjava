-- выведите всю таблицу
SELECT * FROM jaegersinfo;

--отобразите только не уничтоженных роботов
SELECT * FROM jaegersinfo WHERE status != 'Destroyed';

--отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jaegersinfo WHERE mark = 'Mark-1' OR mark = 'Mark-6';

--отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jaegersinfo ORDER BY mark DESC;

--отобразите самого старого робота
SELECT MIN(launch) FROM jaegersinfo;
SELECT * FROM jaegersinfo WHERE launch = (SELECT MIN(launch) FROM jaegersinfo);

--отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT MAX(kaijukill) FROM jaegersinfo;
SELECT * FROM jaegersinfo WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegersinfo);

SELECT MIN(kaijukill) FROM jaegersinfo;
SELECT * FROM jaegersinfo WHERE kaijukill = (SELECT MIN(kaijukill) FROM jaegersinfo);

--отобразите средний вес роботов
SELECT AVG(weight) FROM jaegersinfo;

--увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
SELECT * FROM jaegersinfo WHERE status != 'Destroyed';
UPDATE jaegersinfo SET kaijukill = kaijukill + 1 WHERE status = 'Alive';

--удалите уничтоженных роботов
DELETE FROM jaegersinfo WHERE status = 'Destroyed';



