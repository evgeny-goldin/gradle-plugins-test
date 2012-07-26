package com.test

import com.test.A
import com.github.goldin.rest.youtrack.Issue

class B() : A()
{
    public override fun doNothing() {}

    fun issueExists( url: String, issueId: String ): Boolean = YouTrackRestJava( url ).issueExists( issueId )
    fun issue      ( url: String, issueId: String ): Issue   = YouTrackRestJava( url ).issue      ( issueId )!!
}