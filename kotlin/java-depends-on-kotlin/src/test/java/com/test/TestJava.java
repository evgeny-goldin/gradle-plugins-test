package com.test;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 * Tests {@link YouTrackRestKotlin} implemented in Kotlin.
 */
public class TestJava
{

    @Test
    public void testYouTrackRestJava ()
    {
        assertEquals( "pl-359", new YouTrackRestJava( "http://evgeny-goldin.org/youtrack/" ).issue( "pl-359" ).getId());
        assertEquals( "Fixed",  new YouTrackRestJava( "http://evgeny-goldin.org/youtrack/" ).issue( "pl-645" ).getCustomField( "State" ));
    }
}
