import org.example.Macska;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//TDD = Test driven development = Először teszt és csak utána üzemi kód
//TDD = piros zöld piros

public class Test1 {
    @Test
    public void macskaklon_test1() {

        //unit teszt: fix input, expected, actual/hívás, assert

        String nev = "Szushi";
        int labakSzama = 4;
        Macska m1 = new Macska(nev, labakSzama);
        String actualNev = m1.getNev();
        Assertions.assertEquals(nev, actualNev);
        int actualLabakSzama = m1.getLabakSzama();
        Assertions.assertEquals(labakSzama, actualLabakSzama);

    }

    @Test
    public void macskaklon_test2() {

        String nev = "Szushi";
        int labakSzama = 4;
        Macska m1 = new Macska(nev, labakSzama);
        Macska klon = m1.clone();

        // a klon megeggyezik mindent tekintetben, minden mezőjében az m1-el
        //de masik memória cimen

        String expected = m1.getNev();
        String actual = klon.getNev();
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(m1 == klon );


    }

    @Test
    public void macskaklon_test3() {
        String nev = "Szushi";
        int labakSzama = 4;
        Macska m1 = new Macska(nev, labakSzama);
        Macska m2 = m1; // m1 és m2-is ugyanarra a macskára mutat
        m2.setNev("Kormi");
        Assertions.assertEquals(m1.getNev(), "Kormi");
    }

}
