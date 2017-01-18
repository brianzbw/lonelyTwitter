package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bz2 on 1/17/17.
 */

public class importantTweet extends Tweet {

    public importantTweet(Date date, String message) throws TweetToLongEx{
        super(date, message);
    }

    public importantTweet(String message) throws TweetToLongEx {
        super(message);
    }
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
    @Override
    public String getMessage(){
        return super.getMessage() + "!!!";

    }

}
