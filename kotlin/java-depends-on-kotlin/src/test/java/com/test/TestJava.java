package com.test;

import static junit.framework.Assert.assertNotNull;
import org.junit.Test;


/**
 * Tests {@link YouTrackRestKotlin} implemented in Kotlin.
 */
public class TestJava
{

    @Test
    public void testYouTrackRestJava ()
    {
        assertNotNull( new YouTrackRestJava( "http://evgeny-goldin.org/youtrack/" ));
    }
}
