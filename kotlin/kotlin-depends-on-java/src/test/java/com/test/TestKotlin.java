package com.test;

import static junit.framework.TestCase.*;
import org.junit.Test;


public class TestKotlin
{
    @Test
    public void testAB()
    {
        assertNotNull( new A());
        assertNotNull( new B());
    }


    @Test
    public void testYouTrackRestKotlin ()
    {
        assertNotNull( new YouTrackRestKotlin2( "http://evgeny-goldin.org/youtrack" ));
    }
}
