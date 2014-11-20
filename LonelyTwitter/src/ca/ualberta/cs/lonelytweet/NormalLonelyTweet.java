package ca.ualberta.cs.lonelytweet;

import java.io.Serializable;
import java.util.Date;

import android.util.Log;

public class NormalLonelyTweet extends LonelyTweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String string = getTweetDate() + " | " + getTweetBody();
		Log.i("",string);
		return string ;
	}

	public String getTweetBody() {
		return tweetBody;
	}
}