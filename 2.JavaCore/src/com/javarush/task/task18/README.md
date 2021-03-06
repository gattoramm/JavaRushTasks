## Знакомство с потоками: InputStream/OutputStream, FileInputStream, FileOutputStream

Решенные задачи среднего и повышенного уровней

### Medium

* [Максимальный байт](task1801/Solution.java)

  Ввести с консоли имя файла.
  Найти максимальный байт в файле, вывести его на экран.
  Закрыть поток ввода-вывода.


* [Самые редкие байты](task1804/Solution.java)

  Ввести с консоли имя файла.
  Найти байт или байты с минимальным количеством повторов.
  Вывести их на экран через пробел.
  Закрыть поток ввода-вывода.


* [Сортировка байт](task1805/Solution.java)

  Ввести с консоли имя файла.
  Считать все байты из файла.
  Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
  Вывести на экран.
  Закрыть поток ввода-вывода.
  
  Пример байт входного файла:

  `44 83 44`
  
  Пример вывода:

  `44 83`


* [Подсчет запятых](task1807/Solution.java)

  С консоли считать имя файла.
  Посчитать в файле количество символов `,`, количество вывести на консоль.


* [Реверс файла](task1809/Solution.java)

  Считать с консоли 2 имени файла: `файл1`, `файл2`.
  Записать в `файл2` все байты из `файл1`, но в обратном порядке.


* [DownloadException](task1810/Solution.java)

  * Считывать с консоли имена файлов.
  * Если файл меньше 1000 байт, то:
    * Закрыть потоки работы с файлами.
    * Выбросить исключение DownloadException.


* [Wrapper (Decorator)](task1811/Solution.java)

  Разберись, что делает программа.
  Аналогично классу `DecoratorRunnableImpl` создай класс `DecoratorMyRunnableImpl`.

  Вывод в консоль должен быть таким:

  `DecoratorRunnableImpl body`

  `DecoratorMyRunnableImpl body`

  `RunnableImpl body`


* [Расширяем AmigoOutputStream](task1812)

  Используя шаблон проектирования `Wrapper (Decorator)`, расширь функциональность `AmigoOutputStream`.
  В классе `QuestionFileOutputStream` при вызове метода close() должна быть реализована следующая функциональность:
  * Вывести в консоль фразу `Вы действительно хотите закрыть поток? Д/Н`.
  * Считай строку.
  * Если считанная строка равна `Д`, то закрыть поток.
  * Если считанная строка не равна `Д`, то не закрывать поток.


* [AmigoOutputStream](task1813/AmigoOutputStream.java)

  Измени класс AmigoOutputStream так, чтобы он стал `Wrapper`-ом для класса `FileOutputStream`. Используй наследование.
  При вызове метода `close()` должны выполняться следующая последовательность действий:
  * Вызвать метод `flush()`.
  * Записать в конец файла фразу `JavaRush © All rights reserved.`, используй метод `getBytes()`.


* [UnsupportedFileName](task1814)

  Измени класс `TxtInputStream` так, чтобы он работал только с txt-файлами (*.txt).
  Например, `first.txt` или `name.1.part3.txt`.
  Если передан не txt-файл, например, `file.txt.exe`, то конструктор должен выбрасывать исключение `UnsupportedFileNameException`.
  Подумай, что еще нужно сделать, в случае выброшенного исключения.


* [Таблица](task1815/Solution.java)

  Измени класс `TableInterfaceWrapper` так, чтобы он стал `Wrapper`-ом для `TableInterface`.
  Метод `setModel` должен вывести в консоль количество элементов в списке перед обновлением модели (вызовом метода `setModel` у объекта типа `TableInterface`).
  Метод `getHeaderText` должен возвращать текст в верхнем регистре - используй метод `toUpperCase()`.


* [Английские буквы](task1816/Solution.java)

  В метод main первым параметром приходит путь к файлу.
  Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
  Вывести на экран число (количество символов).


* [Пробелы](task1817/Solution.java)

  В метод main первым параметром приходит путь к файлу.
  Вывести на экран соотношение количества пробелов к количеству всех символов. Например, `10.45`.

  * Посчитать количество всех символов.
  * Посчитать количество пробелов.
  * Вывести на экран `п2/п1*100`, округлив до 2 знаков после запятой до ближайшего.


* [Два в одном](task1818/Solution.java)

  Считать с консоли 3 имени файла.
  Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.


* [Объединение файлов](task1819/Solution.java)

  Считать с консоли 2 имени файла.
  В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.


* [Файлы и исключения](task1824/Solution.java)

  Читайте с консоли имена файлов.
  Если файла не существует (передано неправильное имя файла), то перехватить исключение `FileNotFoundException`, вывести в консоль переданное неправильное имя файла и завершить работу программы.


* [Шифровка](task1826/Solution.java)

  Придумать механизм шифровки/дешифровки.
  
  Программа запускается с одним из следующих наборов параметров:

  `-e fileName fileOutputName`

  `-d fileName fileOutputName`
  
  где:

  `fileName` - имя файла, который необходимо зашифровать/расшифровать.

  `fileOutputName` - имя файла, куда необходимо записать результат шифрования/дешифрования.

  `-e` - ключ указывает, что необходимо зашифровать данные.

  `-d` - ключ указывает, что необходимо расшифровать данные.


### Hard

* [Самые частые байты](task1803/Solution.java)

  Ввести с консоли имя файла.
  Найти байт или байты с максимальным количеством повторов.
  Вывести их на экран через пробел.
  Закрыть поток ввода-вывода.


* [Разделение файла](task1808/Solution.java)

  Считать с консоли три имени файла: `файл1`, `файл2`, `файл3`.
  Разделить `файл1` по следующему критерию:
  Первую половину байт записать в `файл2`, вторую половину байт записать в `файл3`.
  Если в `файл1` количество байт нечетное, то `файл2` должен содержать большую часть.


* [Округление чисел](task1820/Solution.java)

  Считать с консоли 2 имени файла.
  Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, `3.1415`.
  Округлить числа до целых и записать через пробел во второй файл.
  Закрыть потоки.
  
  Принцип округления:
  
  `3.49 => 3`
  
  `3.50 => 4`
  
  `3.51 => 4`
  
  `-3.49 => -3`
  
  `-3.50 => -3`
  
  `-3.51 => -4`


* [Встречаемость символов](task1821/Solution.java)

  Программа запускается с одним параметром - именем файла, который содержит английский текст.
  Посчитать частоту встречания каждого символа.
  Отсортировать результат по возрастанию кода ASCII.
  
  Пример:

  `','=44, 's'=115, 't'=116`
  
  Вывести на консоль отсортированный результат:

  `[символ1] частота1`

  `[символ2] частота2`

  Пример вывода:

  `, 19`

  `- 7`

  `f 361`


* [Поиск данных внутри файла](task1822/Solution.java)

  Считать с консоли имя файла.
  Найти в файле информацию, которая относится к заданному `id`, и вывести ее на экран в виде, в котором она записана в файле.
  Программа запускается с одним параметром: `id` (int).
  Закрыть потоки.
  
  В файле данные разделены пробелом и хранятся в следующей последовательности:

  `id productName price quantity`

  где

  `id` - int.

  `productName` - название товара, может содержать пробелы, `String`.

  `price` - цена, double.

  `quantity` - количество, int.
  
  Информация по каждому товару хранится в отдельной строке.
  
  Пример содержимого файла:

  `194 хлеб 12.6 25`

  `195 масло сливочное 52.2 12`

  `196 молоко 22.9 19`
  
  Пример вывода для `id = 195`:

  `195 масло сливочное 52.2 12`


* [Нити и байты](task1823/Solution.java)

  Читайте с консоли имена файлов, пока не будет введено слово `exit`.
  Передайте имя файла в нить `ReadThread`.
  Нить `ReadThread` должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь `resultMap`,
  где параметр `String` - это имя файла, параметр `Integer` - это искомый байт.


* [Собираем файл](task1825/Solution.java)

  Собираем файл из кусочков.
  Считывать с консоли имена файлов.
  Каждый файл имеет имя: `[someName].partN`.
  
  Например, `Lion.avi.part1`, `Lion.avi.part2`, ..., `Lion.avi.part37`.
  
  Имена файлов подаются в произвольном порядке. Ввод заканчивается словом `end`.
  В папке, где находятся все прочтенные файлы, создать файл без суффикса `[.partN]`.
  
  Например, `Lion.avi`.
  
  В него переписать все байты из файлов-частей используя буфер.
  Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.


* [Прайсы](task1827/Solution.java)

  `CRUD` для таблицы внутри файла.

  Напиши программу, которая считывает с консоли путь к файлу для операций `CRUD` и при запуске со следующим набором параметров:
  
  `-c productName price quantity`

  добавляет товар с заданными параметрами в конец файла, генерируя `id` (8 символов) самостоятельно путем инкремента максимального `id`, найденного в файле.
  
  Значения параметров:

  `-c` - флаг, который означает добавления товара.

  `productName` - название товара, 30 символов.

  `price` - цена, 8 символов.

  `quantity` - количество, 4 символа.
  
  В файле данные хранятся в следующей последовательности (без разделяющих пробелов):

  `id productName price quantity`
  
  Данные дополнены пробелами до их длины.
  Для чтения и записи файла нужно использовать `FileReader` и `FileWriter` соответственно.
  
  Пример содержимого файла:

  `19846   Шорты пляжные синие           159.00  12`

  `198478  Шорты пляжные черные с рисунко173.00  17`

  `19847983Куртка для сноубордистов, разм10173.991234`


* [Прайсы 2](task1828/Solution.java)

  `CRUD` для таблицы внутри файла.

  Напиши программу, которая считывает с консоли путь к файлу для операций `CRUD` и при запуске в зависимости от флага, переданного в параметрах обновляет данные товара с заданным `id` или производит физическое удаление товара с заданным `id` (удаляет из файла все данные, которые относятся к переданному `id`).
  
  `-u id productName price quantity`

  `-d id`
  
  Значения параметров:

  `-u` - флаг, который означает обновление данных товара с заданным `id`

  `-d` - флаг, который означает физическое удаление товара с заданным `id` (из файла удаляются все данные, которые относятся к переданному `id`)
  
  `id` - `id` товара, ` символов
  
  `productName` - название товара, 30 символов

  `price` - цена, 8 символов

  `quantity` - количество, 4 символа
  
  В файле данные хранятся в следующей последовательности (без разделяющих пробелов):

  `id productName price quantity`
  
  Данные дополнены пробелами до их длины.
  Для чтения и записи файла нужно использовать `FileReader` и `FileWriter` соответственно.
  
  Пример содержимого файла:

  `19847   Шорты пляжные синие           159.00  12`

  `198479  Шорты пляжные черные с рисунко173.00  17`

  `19847983Куртка для сноубордистов, разм10173.991234`