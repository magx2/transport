package pl.grzeslowski.transport.tools;

import android.app.Activity;
import android.content.Intent;

import static android.content.Intent.*;

public class EmailIntent {
    public static class Email {
        private final String mSubject;
        private final String mText;
        private final String mTo;

        public Email(String subject, String text, String to) {
            mSubject = subject;
            mText = text;
            mTo = to;
        }
    }

    public void showEmailIntent(Activity activity, Email email) {
        Intent intent = new Intent(ACTION_SEND);

        intent.setType("message/rfc822");
        intent.putExtra(EXTRA_SUBJECT, email.mSubject);
        intent.putExtra(EXTRA_TEXT, email.mText);
        intent.putExtra(EXTRA_EMAIL, new String[]{email.mTo});

        activity.startActivity(intent);
    }
}
