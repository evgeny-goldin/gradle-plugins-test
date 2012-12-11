package com.test;


public class YouTrackRestJava2
{
    private final YouTrack youtrack;

    static class Issue{ Issue ( String issueId )   { super(); }}
    static class YouTrack
    {
        YouTrack ( String url ){ super(); }
        boolean issueExists( String issueId ){ return ! issueId.isEmpty(); }
        Issue    issue( String issueId ){ return new Issue( issueId ); }
    }


    public YouTrackRestJava2 ( String youtrackUrl )
    {
        this.youtrack = new YouTrack( youtrackUrl );
    }


    public boolean issueExists( String issueId ) { return youtrack.issueExists( issueId ); }
    public Issue   issue      ( String issueId ) { return youtrack.issue( issueId ); }
}
