package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.TooManyListenersException;

/**
 * Created by bz2 on 1/17/17.
 */

public abstract class Tweet implements Tweetable {
        private Date date;
        private String message;


        public Tweet(Date date, String message) throws TweetToLongEx{
            this.date = date;
            this.message = message;
        }

        public Tweet(String message) throws TweetToLongEx{
            this.message = message;
            this.date = new Date(); // current time and date
        }

    public abstract  Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetToLongEx{
            if(message.length() > 144) {
                throw new TweetToLongEx();
            }else{
                this.message = message;
            }
        }
}

