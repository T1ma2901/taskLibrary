import models.*;
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Zlatan Ibrahimovic","\"I'm Zlatan\"");
        Book book1 = new Book("Leo Tolstoy","\"Anna Karenina\"");
        Book book2 = new Book("Gustave Flaubert","\"Madame Bovary\"");
        Book book3 = new Book("Leo Tolstoy","\"War and Peace\"");
        Book book4 = new Book(" F. Scott Fitzgerald","\"The Great Gatsby\"");
        Book book5 = new Book(" Vladimir Nabokov","\"Lolita\"");

        Reader reader = new Reader("Oleg Kenzov",234,"Philosophical",
                "24/02/1990","+996773339232");

        reader.takeBook(3);

        reader.takeBook(new String[]{book1.getName(),book2.getName(),book4.getName()});

        reader.takeBook(new Book[]{book,book1,book3,book5});

        reader.returnBook(new Book[]{book1,book4,book3,book2});
    }

}
// Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
// ФИО,номер читательского билета,факультет,дата рождения,телефон.Методы takeBook(),
// returnBook().Разработать программу, в которой создается массив объектов данного класса.
// Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение
// "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать массив названий книг. Выводит на консоль сообщение
// "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать массив объектов класса Book (создать новый класс,
// содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги:
// Приключения, Словарь, Энциклопедия". Аналогичным образом перегрузить метод returnBook().
// Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь,
// Энциклопедия". Или  "Петров В. В. вернул 3 книги"
