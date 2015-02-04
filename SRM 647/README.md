# TopCoder SRM 647



### Задачи

**Division 1**

Level One [BuildingTowersEasy](http://community.topcoder.com/stat?c=problem_statement&pm=13634&rd=16279)

Level Two [CtuRobots](http://community.topcoder.com/stat?c=problem_statement&pm=13595&rd=16279)

Level Three [ConvenientBlock](http://community.topcoder.com/stat?c=problem_statement&pm=13558&rd=16279)

**Division 2**

Level One [PeacefulLine](http://community.topcoder.com/stat?c=problem_statement&pm=13632&rd=16279)

Level Two [TravellingSalesmanEasy](http://community.topcoder.com/stat?c=problem_statement&pm=13631&rd=16279)

Level Three [BuildingTowers](http://community.topcoder.com/stat?c=problem_statement&pm=13606&rd=16279)


## Решения

### PeacefulLine

Мое решение.

Подсчитываем для каждого возраста, сколько людей его имеет.
Итеративно выстраиваем людей в линию. Каждый раз выбираем человека с наибольшим возрастом, не равным предыдущему.
Если в конце не осталось людей, то выстроить линию удалось, иначе нет.

Другое решение.

Подсчитываем для каждого возраста, сколько людей его имеет.
Если количество людей какого-либо возраста больше `(n + 1) / 2`, то выстроить линию не получится.

### TravellingSalesmanEasy
Для каждого города составим список продаж в порядке убывания стоимости.
При посещении очередного города совершаем продажу с наибольшей стоимостью и убираем её из списка.


## Результаты

[Результаты](http://community.topcoder.com/stat?c=round_overview&er=5&rd=16279)

