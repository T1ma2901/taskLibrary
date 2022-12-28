package models;

import java.util.Arrays;

public class Reader {
    private String fio;
    private long readerNum;
    private String faculty;
    private String birthDay;
    private String phone;

    public Reader(String fio, long readerNum, String faculty, String birthDay, String phone) {
        this.fio = fio;
        this.readerNum = readerNum;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public long getReaderNum() {
        return readerNum;
    }

    public void setReaderNum(long readerNum) {
        this.readerNum = readerNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void takeBook(int bookCunt){
        if(bookCunt==1) {
            System.out.printf("\nСтудент %s из факультета %s взял %d книгу!",fio,faculty,bookCunt);
        }else if (bookCunt>1&&bookCunt<5){
            System.out.printf("\nСтудент %s из факультета %s взял %d книги!",fio,faculty,bookCunt);
        }else {
            System.out.printf("\nСтудент %s из факультета %s взял %d книг!",fio,faculty,bookCunt);
        }

    }
    public void takeBook(String[]nameBook){
        System.out.printf("\nСтудент %s взял книги: %s!",fio, Arrays.toString(nameBook));
    }

    public void takeBook(Book[] books){
        if (books.length==1){
            System.out.printf("\nСтудент %s из факультета %s взял книгу %s !",fio,faculty,books[0]);
        }
        else {
            System.out.printf("\nСтудент %s из факультета %s взял книги %s !",fio,faculty,new Book().booksInfo(books));
        }
    }
    public void returnBook(){
    }
    public void returnBook(Book[] books){
        if (books.length==1){
            System.out.printf("\nСтудент %s из факультета %s вернул книгу %s !",fio,faculty,books[0]);
        }
        else {
            System.out.printf("\nСтудент %s из факультета %s вернул книги %s !",fio,faculty,new Book().booksInfo(books));
        }

    }
}
