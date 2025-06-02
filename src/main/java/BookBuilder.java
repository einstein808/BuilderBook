public class BookBuilder {
    private Book book;

    public BookBuilder() {
        book = new Book();
    }

    public Book build() {
        if (book.getIsbn().equals("")) {
            throw new IllegalArgumentException("ISBN inválido");
        }
        if (book.getTitle().equals("")) {
            throw new IllegalArgumentException("Título inválido");
        }
        return book;
    }

    public BookBuilder setIsbn(String isbn) {
        book.setIsbn(isbn);
        return this;
    }

    public BookBuilder setTitle(String title) {
        book.setTitle(title);
        return this;
    }

    public BookBuilder setAuthor(String author) {
        book.setAuthor(author);
        return this;
    }

    public BookBuilder setPublicationYear(int year) {
        book.setPublicationYear(year);
        return this;
    }

    public BookBuilder setGenre(String genre) {
        book.setGenre(genre);
        return this;
    }

    public BookBuilder setPublisher(String publisher) {
        book.setPublisher(publisher);
        return this;
    }

    public BookBuilder setPages(int pages) {
        book.setPages(pages);
        return this;
    }

    public BookBuilder setLanguage(String language) {
        book.setLanguage(language);
        return this;
    }

    public BookBuilder setFormat(String format) {
        book.setFormat(format);
        return this;
    }

    public BookBuilder setPrice(double price) {
        book.setPrice(price);
        return this;
    }
}
