<h1>Паттерны проектирования</h1>
<h2>1. Порождающие паттерны (Creational)</h2>

+ **Фабричный метод (Factory Method)**
> порождающий шаблон проектирования, предоставляющий подклассам (дочерним классам) интерфейс для создания экземпляров 
> некоторого класса. В момент создания наследники могут определить, какой класс создавать. Иными словами, данный шаблон
> делегирует создание объектов наследникам родительского класса. Это позволяет использовать в коде программы не
> специфические классы, а манипулировать абстрактными объектами на более высоком уровне.
+ **Абстрактная фабрика (Abstract Factory)**
> порождающий шаблон проектирования, предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых
> объектов, не специфицируя их конкретных классов. Шаблон реализуется созданием абстрактного класса Factory, который
> представляет собой интерфейс для создания компонентов системы (например, для оконного интерфейса он может создавать
> окна и кнопки). Затем пишутся классы, реализующие этот интерфейс.
+ **Одиночка (Singleton)**
> порождающий шаблон проектирования, гарантирующий, что в однопоточном приложении будет единственный экземпляр
> некоторого класса, и предоставляющий глобальную точку доступа к этому экземпляру.
+ **Строитель (Builder)**
>  порождающий шаблон проектирования предоставляет способ создания составного объекта.
+ **Прототип (Prototype)**
> порождающий шаблон проектирования задаёт виды создаваемых объектов с помощью экземпляра-прототипа и создаёт новые
> объекты путём копирования этого прототипа. Он позволяет уйти от реализации и позволяет следовать принципу
> «программирование через интерфейсы». В качестве возвращающего типа указывается интерфейс/абстрактный класс на
> вершине иерархии, а классы-наследники могут подставить туда наследника, реализующего этот тип.
>
<h2>2. Структурные паттерны (Structural)</h2>
+ **Адаптер (Adapter)**
> структурный шаблон проектирования, предназначенный для организации использования функций объекта, недоступного 
> для модификации, через специально созданный интерфейс. Другими словами — это структурный паттерн проектирования, 
> который позволяет объектам с несовместимыми интерфейсами работать вместе.
+ **Мост (Bridge)**
> структурный шаблон проектирования, используемый в проектировании программного обеспечения чтобы «разделять абстракцию
> и реализацию так, чтобы они могли изменяться независимо». Шаблон мост использует инкапсуляцию, агрегирование и может
> использовать наследование для того, чтобы разделить ответственность между классами.
+ **Компоновщик (Composite)**
> структурный шаблон проектирования, объединяющий объекты в древовидную структуру для представления иерархии от
> частного к целому. Компоновщик позволяет клиентам обращаться к отдельным объектам и к группам объектов одинаково.
+ **Декоратор (Decorator)**
> структурный шаблон проектирования, предназначенный для динамического подключения дополнительного поведения к объекту.
> Шаблон Декоратор предоставляет гибкую альтернативу практике создания подклассов с целью расширения функциональности.
+ **Фасад (Facade)**
> структурный шаблон проектирования, позволяющий скрыть сложность системы путём сведения всех возможных внешних
> вызовов к одному объекту, делегирующему их соответствующим объектам системы.
+ **Приспособленец (Flyweight)**
> структурный шаблон проектирования, при котором объект, представляющий себя как уникальный экземпляр в разных местах
> программы, по факту не является таковым.
+ **Заместитель (Proxy)**
> структурный шаблон проектирования, предоставляющий объект, который контролирует доступ к другому объекту,
> перехватывая все вызовы (выполняет функцию контейнера).