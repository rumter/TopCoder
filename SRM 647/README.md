# TopCoder SRM 647



## Задачи

**Division 1**

* BuildingTowersEasy [Statement][stmt_11]
* CtuRobots [Statement][stmt_12]
* ConvenientBlock [Statement][stmt_13]

**Division 2**

* PeacefulLine [Statement][stmt_21], [Solution](#peacefulline)
* TravellingSalesmanEasy [Statement][stmt_22], [Solution](#travellingsalesmaneasy)
* BuildingTowers [Statement][stmt_23]


## Решения

### PeacefulLine

**Решение 1**

Подсчитываем для каждого возраста, сколько людей его имеет.
Итеративно выстраиваем людей в линию. Каждый раз выбираем человека с наибольшим возрастом, отличающимся от предыдущего.
Если в конце не осталось людей, то выстроить линию удалось, иначе нет.

**Решение 2**

Подсчитываем для каждого возраста, сколько людей его имеет.
Если количество людей какого-либо возраста больше `(n + 1) / 2`, то выстроить линию не получится.

### TravellingSalesmanEasy

Для каждого города составим список продаж в порядке убывания стоимости.
При посещении очередного города совершаем продажу с наибольшей стоимостью и убираем её из списка.


## Результаты

[Результаты](http://community.topcoder.com/stat?c=round_overview&er=5&rd=16279)


[stmt_11]: http://community.topcoder.com/stat?c=problem_statement&pm=13634&rd=16279
[stmt_12]: http://community.topcoder.com/stat?c=problem_statement&pm=13595&rd=16279
[stmt_13]: http://community.topcoder.com/stat?c=problem_statement&pm=13558&rd=16279
[stmt_21]: http://community.topcoder.com/stat?c=problem_statement&pm=13632&rd=16279
[stmt_22]: http://community.topcoder.com/stat?c=problem_statement&pm=13631&rd=16279
[stmt_23]: http://community.topcoder.com/stat?c=problem_statement&pm=13606&rd=16279
