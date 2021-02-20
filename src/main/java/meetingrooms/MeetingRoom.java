package meetingrooms;

public class MeetingRoom  {

    private String name;
    private int length;
    private int width;


    @Override
    public String toString() {
        return "length: " + length + ", width: " + width + ",  area: " + getArea();
    }

    public MeetingRoom(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){

        return getLength() * getWidth();
    }
}
