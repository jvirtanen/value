package org.jvirtanen.value;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValueTest {

    @Test
    public void equal() {
        Foo a = new Foo(1, "abc");
        Foo b = new Foo(1, "abc");

        assertEquals(a, b);
    }

    @Test
    public void nonEqualFields() {
        Foo a = new Foo(1, "abc");
        Foo b = new Foo(2, "abc");

        assertFalse(a.equals(b));
    }

    @Test
    public void nonEqualClasses() {
        Foo a = new Foo(1, "abc");
        Bar b = new Bar(1, "abc");

        assertFalse(a.equals(b));
    }

    @Test
    public void string() {
        assertEquals("Foo(1,abc)", new Foo(1, "abc").toString());
    }

}
