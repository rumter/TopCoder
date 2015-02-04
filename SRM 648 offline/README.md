# TopCoder SRM 648



## Задачи

**Division 1**

* AB [Statement][stmt_11], [Solution](#ab)
* KitayutaMart [Statement][stmt_12]
* Fragile [Statement][stmt_13]

**Division 2**

* KitayutaMart2 [Statement][stmt_21], [Solution](#kitayutamart2)
* Fragile2 [Statement][stmt_22], [Solution](#fragile2)
* ABC [Statement][stmt_23], [Solution](#abc)


## Решения

### KitayutaMart2

Геометрическая прогрессия. Необходимо найти порядковый номер последнего элемента, зная сумму и множитель.

### Fragile2

Перебираем все пары вершин и находим с помощью поиска в глубину количество компонент связности, на которые распадется граф при удалении выбранных вершин.

### ABC

В последовательности вида: `A...AB...BC...C1 будет наибольшее число пар, описанных в условии.
Оно будет равно `a * (b + c) + b * c`, где `a, b, c` - количество букв `A, B, C` соответственно.

Но не все количества пар можно составить строками вида `"ABC"`. Предположим, что это можно сделать строкой вида `"ABCABC"`.
Количество пар в таких строках равно `K1 + K2 + a1 * (b2 + c2) + b1 * c2`.

Перебрав все варианты входных данных, проверяем, что данный подход составления строки "работает".


### AB

Перебираем все последовательности вида A..AB..BA..AB..B. Для каждой находим K.


## Результаты

[Результаты](http://community.topcoder.com/stat?c=round_overview&er=5&rd=16312)


[stmt_11]: http://community.topcoder.com/stat?c=problem_statement&pm=13642&rd=16312
[stmt_12]: http://community.topcoder.com/stat?c=problem_statement&pm=13649&rd=16312
[stmt_13]: http://community.topcoder.com/stat?c=problem_statement&pm=13641&rd=16312
[stmt_21]: http://community.topcoder.com/stat?c=problem_statement&pm=13650&rd=16312
[stmt_22]: http://community.topcoder.com/stat?c=problem_statement&pm=13648&rd=16312
[stmt_23]: http://community.topcoder.com/stat?c=problem_statement&pm=13645&rd=16312
