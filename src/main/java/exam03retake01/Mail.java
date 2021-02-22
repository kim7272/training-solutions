package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class Mail {

    private Contact contact;
    private List<Contact> to = new ArrayList<>();
    private String subject;
    private String message;

    public Contact getContact() {
        return contact;
    }

    public List<Contact> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
