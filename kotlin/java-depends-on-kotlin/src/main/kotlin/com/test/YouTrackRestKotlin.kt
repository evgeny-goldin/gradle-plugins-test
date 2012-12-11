package com.test


class Issue( id: String )

class YouTrack( url: String )
{
    fun issueExists( issueId: String ): Boolean = ( issueId != "" )
    fun issue      ( issueId: String ): Issue   = Issue( issueId  )
}


open class YouTrackRestKotlin( youTrackUrl: String )
{
    private val youtrack = YouTrack( youTrackUrl )

    fun issueExists( issueId: String ): Boolean = youtrack.issueExists( issueId )
    fun issue      ( issueId: String ): Issue   = youtrack.issue      ( issueId )
}