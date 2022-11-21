package lesson8;

/**Методы-
 Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы. Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы собраны в одном классе;
 Формула создания метода-
 1- модификатор доступа - это одно из 4-х видов слов, указывается перед методом или классом:
 public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используется);
 protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других пакетах в данном проекте;
 ————— (package-private)- будет доступен только внутри текущего пакета (текущей папки);
 private - только внутри текущего класса (файла);
 -Статичность - два варианта: может быть указан признак статичности, либо нет:
 - не static, если метод будет вызываться у переменной text.split(" ");, то он не должен быть static; static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);
 -Возвращаемый тип или слово void если метод ни чего не возвращает:
 public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
 public static String - если возвращает строку;
 public static ******  - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает, а просто выполняется, например, печать на консоль;
 4 - Название метода: поясняющее его суть, с моленькай буквы;
 5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа
 6 - тело метода (то что должно происходить, когда метод вызовут);
 public static void         printMassiveToConsole(int[][] mass)
 Модификаторы доступа метода      Сигнатура метода
 */

public class Application {
    public static void print() {
        System.out.println("Результат суммы:");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        print();
        System.out.println(sum(3, 2));

        // Конструкторы и создание объектов классов

        String s = "";
        String s1 = new String("");
        Contact denis = new Contact("Денис", "www.denis@mail.ru", "89124567889");
        Contact damir = new Contact("Дамир", "www.demir@mail.ru", "89124567890");
        Contact dasha = new Contact("Даша", "www.dasha@mail.ru", "89124567891");
        Contact demis = new Contact("Демис", "www.demis@mail.ru", "89124567892");
        Contact denzel = new Contact("Дензел", "www.denzel@mail.ru", "89124567893");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(demis);
        phoneBook.addContact(denis);
        phoneBook.addContact(damir);
        phoneBook.addContact(dasha);
        phoneBook.addContact(denzel);
    }





}
