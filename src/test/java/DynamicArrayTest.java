import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamicArrayTest {

    DynamicArray Mas = new DynamicArray();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getKol() {
    }

    @Test
    public void getElem() {
    }

    @Test
    public void add() {
        Mas.add(1234);
        assertEquals("GOOD", Mas.getKol(), 1);
        assertEquals("GOOD", Mas.getElem(0), 1234);
    }

    @Test
    public void delete() {
        Mas.add(123);
        Mas.delete(0);
        assertEquals("GOOD", Mas.getKol(), 0);
    }

    @Test
    public void change() {
        Mas.add(1234);
        Mas.change(0, 123);
        assertEquals("GOOD", Mas.getElem(0), 123);
    }

    @Test
    public void info() {
    }
}