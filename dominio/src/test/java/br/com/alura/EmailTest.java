package br.com.alura;

import br.com.alura.aluno.Email;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void should_not_create_email_with_invalid_address() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("invalid"));
    }

    @Test
    void should_create_email_successfully() {
        new Email("test@gmail.com");
    }
}