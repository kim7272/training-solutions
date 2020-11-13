package introconstructors;

public class TaskMain {
    public static void main(String[] args) {

        Task task = new Task("Minőségvizsgálat", "Beérkezett termékek ellenőrzése");
        System.out.println("Task elnevezése: "+ task.getTitle());
        System.out.println("Task leírása: " + task.getDescription());
        task.start(2020,02,25,8,15);
        System.out.println("Projekt indulása: " + task.getStartDateTime());
        task.setDuration(45);
        System.out.println("Projekt időtartama: " + task.getDuration() + " perc");
    }
}
