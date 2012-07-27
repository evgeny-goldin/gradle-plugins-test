package com.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;


/**
 * Tests {@link YouTrackRestKotlin} implemented in Kotlin.
 */
public class TestJava
{

    @Test
    public void testYouTrackRestJava ()
    {
        assertTrue  ( new YouTrackRestJava( "http://rest-clients.myjetbrains.com/youtrack/" ).
                      issueExists( "pl-359" ));
        assertEquals( "Fixed",
                      new YouTrackRestJava( "http://evgeny-goldin.org/youtrack/" ).
                      issue( "pl-645" ).getCustomField( "State" ) );
    }
}
