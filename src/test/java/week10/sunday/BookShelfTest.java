package week10.sunday;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BookShelfTest {

    @Test
    public void shouldGetBookNameProperly() {
        // given
        BookShelf bookShelf = new BookShelf();

        // when
        String actualResult = bookShelf.getBookName();

        // then
        Assertions.assertThat(actualResult)
                .isEqualTo("The Lord of the Rings")
                .endsWith("ings")
                .startsWith("Th")
                .doesNotContain("computer")
                .contains("ord");
    }

}