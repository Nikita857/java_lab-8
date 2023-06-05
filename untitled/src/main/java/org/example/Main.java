package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Лев Николаевич Толстой");
        Librarian1 librarian1 = new Librarian1("Немцов Сережка");
        Administrator1 administrator1 = new Administrator1("Витек");
        User user1 = new User("Кирилл","Сусликов");
        Supplier1 supplier1 = new Supplier1("Табян");


        librarian1.issueBook(book, user1);
        supplier1.supply(book);
        librarian1.overdueNotification(user1);
    }
}