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
        assertTrue   ( new YouTrackRestKotlin2( "http://evgeny-goldin.org/youtrack" ).issueExists( "pl-646" ));
        assertEquals ( "pl-646", new YouTrackRestKotlin2( "http://evgeny-goldin.org/youtrack" ).
                                 issue( "pl-646" ).getId());
    }
}