package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book {
        private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        public MarkTwainBook getBook() {
            return this;
        }

        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        public AgathaChristieBook getBook() {
            return this;
        }

        public String getTitle() {
            return title;
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            if (getBook() instanceof AgathaChristieBook) output = agathaChristieOutput;
            else if (getBook() instanceof MarkTwainBook) output = markTwainOutput;

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
