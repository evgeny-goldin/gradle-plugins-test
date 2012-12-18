package com.test

import org.junit.Test


class TestKotlin2
{
    [Test]
    fun testBottles()
    {
        bottles.printBottles( 5 )
    }


    [Test]
    fun testHtmlBuilder()
    {
        html.main( array( "a", "b" ))
    }


/*
    [Test]
    fun testLife()
    {
        life.main( array())
    }
*/


/*
    [Test]
    fun testMaze()
    {
        maze.main( array())
    }
*/
}