package collectionsmap;

import java.util.Date;

public class Entry {

    private String ipAddress;
    private Date entryDate;
    private String logIn;

    public Entry(String ipAddress, Date entryDate, String logIn) {
        this.ipAddress = ipAddress;
        this.entryDate = entryDate;
        this.logIn = logIn;
    }

    public String getLogin() {
        return logIn;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public Date getEntryDate() {
        return entryDate;
    }
}
