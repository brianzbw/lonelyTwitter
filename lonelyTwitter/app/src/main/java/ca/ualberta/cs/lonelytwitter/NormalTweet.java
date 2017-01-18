package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bz2 on 1/17/17.
 */

public abstract class NormalTweet extends Tweet {
    public NormalTweet(Date date, String message) throws TweetToLongEx {
        super(date, message);
    }

    public NormalTweet(String message) throws TweetToLongEx {
        super(message);
    }

    public Boolean isImporatnt(){
        return Boolean.FALSE;
    }
}
