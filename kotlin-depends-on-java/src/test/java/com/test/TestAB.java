package com.test;

import org.junit.Test;
import static junit.framework.TestCase.*;


public class TestAB
{
    @Test
    public void testA()
    {
        assertNotNull( new A());
    }


    @Test
    public void testB()
    {
        assertNotNull( new B());
        assertTrue   ( new B().issueExists    ( "http://evgeny-goldin.org/youtrack", "pl-646" ));
        assertEquals ( "pl-646", new B().issue( "http://evgeny-goldin.org/youtrack", "pl-646" ).getId());
    }
}
