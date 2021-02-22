package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> getMails() {
        return mails;
    }

    public void addMail(Mail mail){
       mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria) {
        List<Mail> result = new ArrayList<>();
        criteria.toLowerCase();
        List<Mail> selected = new ArrayList<>();
        if (!criteria.contains(":")) {
            for (Mail mail : mails) {
                if (mail.getMessage().contains(criteria)) {
                    selected.add(mail);
                }
            }
            result = selected;
        } else if (criteria.contains("from:john")) {
            String[] parts = criteria.split(":");
            for (Mail mail : mails) {
                if (mail.getFrom().getName().equals(parts[1]) || mail.getFrom().getEmail().equals(parts[1])) {
                    selected.add(mail);
                }
            }
            result = selected;
        } else if (criteria.contains("to:john")) {
            String[] parts = criteria.split(":");
            for (Mail mail : mails) {
                if (mail.getFrom().equals(parts[1]) || mail.getFrom().getEmail().equals(parts[1])) {
                    selected.add(mail);
                }
            }
            result = selected;

        }
        return result;
    }
}

