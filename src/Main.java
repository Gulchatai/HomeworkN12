public class Main {
      
        public static void main(String[] args) {
            System.out.println("Домашняя работа № 12");
            Author bulgakov = new Author("Михаил ", "Булгаков");
            Author tolstoy = new Author("Лев", "Толстой");
            Book masterAndMargarita =  new Book("Мастер и Маргарита", bulgakov, 2022);
            Book annaKarenina = new Book("Анна Каренина", tolstoy , 1907);
            System.out.println("masterAndMargarita.bookName = " + masterAndMargarita.getBookName());
            System.out.println("masterAndMargarita.yearPublication = " + masterAndMargarita.getYearPublication());
            System.out.println("bulgakov.getAuthorName() = " + bulgakov.getAuthorName());
            System.out.println("bulgakov.getAuthorFamily() = " + bulgakov.getAuthorFamily());
            System.out.println("annaKarenina.getBookName = " + annaKarenina.getBookName());
            System.out.println("annaKarenina.getYearPublication = " + annaKarenina.getYearPublication());
            System.out.println("tolstoy.getAuthorName() = " + tolstoy.getAuthorName());
            System.out.println("tolstoy.getAuthorFamily() = " + tolstoy.getAuthorFamily());
            masterAndMargarita.setYearPublication(1940);
            System.out.println("masterAndMargarita.setYearPublication = " + masterAndMargarita.getYearPublication());
        }
}