package com.test;

import com.github.goldin.rest.youtrack.Issue;
import com.github.goldin.rest.youtrack.YouTrack;


public class YouTrackRestJava
{
    private final YouTrack youtrack;

    public YouTrackRestJava ( String youtrackUrl )
    {
        this.youtrack = new YouTrack( youtrackUrl );
    }


    public boolean issueExists( String issueId ) { return youtrack.issueExists( issueId ); }
    public Issue   issue      ( String issueId ) { return youtrack.issue( issueId ); }
}
