package CollectionMap;

import collectionsmap.Entry;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LogParser {


    private static final String logDivide = "\n";
    private static final String entryDivide = ":";
    private static final String dateDivide = "-";

    List<String> IPNumbers = new ArrayList<>();
    List<String> dates = new ArrayList<>();
    List<String> logins = new ArrayList<>();


    public Map<String, List<Entry>> parseLog(String log) {

        String[] logParts = log.split(logDivide);

        for (String entry : logParts) {
            String[] entryParts = entry.split(entryDivide);
            if (entryParts.length < 3) {
                throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
            }
            String[] entryPartsForDate = entry.split(dateDivide);
            if (entryPartsForDate.length < 3) {
                throw new IllegalArgumentException("Incorrect log: incorrect date");
            }
            IPNumbers.add(entryParts[0]);
            dates.add(entryParts[1]);
            logins.add(entryParts[2]);
        }
        List<Entry> allEntries = new ArrayList<>();
        Map<String, List<Entry>> values = new HashMap<>();


        Set<String> soleIPNumbers = new HashSet<>();
        for (String ipNumber : IPNumbers) {
            soleIPNumbers.add(ipNumber);
        }

        List<Date> datesInFormat = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        for (String date : dates) {
            try {
                datesInFormat.add(formatter.parse(date));
            }
            catch(ParseException e){
                throw new IllegalArgumentException("Bad data format!", e);
            }
        }

        for (int i = 0; i < IPNumbers.size(); i++) {
            allEntries.add(new Entry(IPNumbers.get(i), datesInFormat.get(i), logins.get(i)));
        }

        List<Entry> entries = new ArrayList<>();

        for (String number : soleIPNumbers) {
            for (Entry entry : allEntries) {
                if (entry.getIpAddress() == number) {
                    entries.add(entry);
                }
            }
            values.put(number, entries);
            entries.clear();
        }
        return values;
    }
}
