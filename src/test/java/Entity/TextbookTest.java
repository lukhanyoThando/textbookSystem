package Entity;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextbookTest
{
    @Test
    public void rightBuild()
    {
        Textbook.Builder builder = new Textbook.Builder();
        Textbook book1= builder
                .setBookNum(123456)
                .setBookISBN("978-3-16-148410-0")
                .setBookEdition(2020)
                .setBookName("Métriser les Maths 2")
                .setBookVolume(20)
                .setBookPrice(2000)
                .build();
        System.out.println(book1.toString());
    }

    @Test
    public void wrongBuild()
    {
        final Textbook.Builder builder = new Textbook.Builder();
        Textbook book2 = builder
                .setBookEdition(0)
                .setBookISBN("")
                .setBookName("")
                .setBookPrice(0)
                .build();
        System.out.println(book2.toString());
    }

    @Test
    public void textbkBuild()
    {
        final Textbook.Builder builder = new Textbook.Builder();
        Textbook textbook1 = builder
                .setBookName("Ce Monde Merveilleux")
                .setBookISBN("9876541235478")
                .setBookEdition(2019)
                .setBookPrice(230)
                .build();
        System.out.println(textbook1.toString());
    }
}