package pl.grzeslowski.transport.tools;

import android.app.Activity;
import android.content.Intent;

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
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_SUBJECT, email.mSubject);
        intent.putExtra(Intent.EXTRA_TEXT, email.mText);
        intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{email.mTo});

        activity.startActivity(intent);
    }
}
