package model;


/**
 * Created by scavenius on 12/1/15.
 */
public class Show {

    private Theater theater;
    private String name;
    //TODO figure out time keeping. My suggestion: LocalDateTime. current suggestion is only that -Scavenius
    //for info on LocalDateTime https://docs.oracle.com/javase/tutorial/datetime/iso/datetime.html and https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
    private String time;

    public Show(Theater theater, String name, String time) {
        this.theater = theater;
        this.name = name;
        this.time = time;
    }

    public Theater getTheater() {
        return theater;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
}
