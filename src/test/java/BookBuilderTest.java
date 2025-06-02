import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookBuilderTest {

    @Test
    void deveRetornarExcecaoParaLivroSemIsbn() {
        try {
            BookBuilder bookBuilder = new BookBuilder();
            Book book = bookBuilder
                    .setTitle("Clean Code")
                    .setAuthor("Robert C. Martin")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ISBN inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaLivroSemTitulo() {
        try {
            BookBuilder bookBuilder = new BookBuilder();
            Book book = bookBuilder
                    .setIsbn("9780132350884")
                    .setAuthor("Robert C. Martin")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarLivroValido() {
        BookBuilder bookBuilder = new BookBuilder();
        Book book = bookBuilder
                .setIsbn("9780132350884")
                .setTitle("Clean Code")
                .setAuthor("Robert C. Martin")
                .setPublicationYear(2008)
                .setGenre("Programming")
                .setPublisher("Prentice Hall")
                .build();

        assertNotNull(book);
        assertEquals("9780132350884", book.getIsbn());
        assertEquals("Clean Code", book.getTitle());
        assertEquals("Robert C. Martin", book.getAuthor());
        assertEquals(2008, book.getPublicationYear());
        assertEquals("Programming", book.getGenre());
        assertEquals("Prentice Hall", book.getPublisher());
    }
}
