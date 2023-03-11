public class Book {
    private final String bookName;
    private final Author author;
    private int yearPublication;
    public Book(String bookName, Author author, int yearPublication) {
        this.bookName = bookName;
        this.yearPublication = yearPublication;
        this.author = author;
        //this (Author);
        }
        public String getBookName() {
        return bookName;
    }
    public int getYearPublication() {
        return yearPublication;
    }
    public Author getAuthor() {
        return author;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
   }

