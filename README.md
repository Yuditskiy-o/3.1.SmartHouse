# Цикломатическая сложность кода
Цикломатическая сложность части программного кода — количество линейно независимых маршрутов через программный код.
### Формула вычисления цикломатической сложности 
Согласно [Википедии](https://ru.wikipedia.org/wiki/%D0%A6%D0%B8%D0%BA%D0%BB%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F_%D1%81%D0%BB%D0%BE%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C)
цикломатическая сложность кода высчитывается по формуле:

**M** = **E** − **N** + **2P**,

где:
* **M** = цикломатическая сложность,
* **E** = количество рёбер в графе,
* **N** = количество узлов в графе,
* **P** = количество компонентов связности.

### Вычисляем цикломатическую сложность кода для методов nextStation и prevStation
Логика строится следующим образом — если исходный код не содержит никаких точек ветвления или циклов, то сложность равна единице, поскольку есть только единственный маршрут через код. 
Если код имеет единственный оператор IF, содержащий простое условие, то существует два пути через код: один если условие оператора IF имеет значение TRUE и один — если FALSE.

**Наглядная схема метода nextStation:**

![image](https://i.gyazo.com/146a5d8abb29ec2bb82a500c286f8a33.png)

На схеме выше овалы — это узлы (7), а линии — это рёбра (7). Количество компонентов связности равно 1, т.к. для одной программы (или подпрограммы, или метода), Р всегда равна 1 (информацию об этом взял [отсюда](https://ru.qwe.wiki/wiki/Cyclomatic_complexity)). 

Руководствуясь Википедией определяем, что в нашем случае формула будет выглядеть так:

**M** = **7** - **7** + **2** * **1** = **2**

Соответственно, такой же расчет цикломатической сложности будет и для метода prevStation, т.к. логика ветвления и количесто рёбер и узлов совпадает.

### Показатели метрики Complexity из плагина JaCoCo
![image](https://i.gyazo.com/65c3ea975d2e8150f67a54788c6e0ab7.png)

Плагин говорит нам о том, что согласно метрике необходимо по 2 теста на каждый метод.

### Вывод
На основании вычисления по формуле и показателях, генерируемых JaCoCo, можно говорить о том, что в данном случае для методов nextStation и prevStation будет достаточно по 2 unit-теста на каждый метод.
