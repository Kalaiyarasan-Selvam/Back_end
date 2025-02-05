package Day_s_twenty;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


class Event{
    private String name;
    private LocalDateTime dateTime;
    private Duration duration;

    public Event(String name, LocalDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Duration getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("\"%s\",%s,%s",name,dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),duration.toHours()+" hours");
    }
}
public class SimpleScheduling{
    public static void main(String[] args) {
        List<Event> l=List.of(
                new Event("Meeting",LocalDateTime.of(2025,1,28,10,0),Duration.ofHours(1)),
                new Event("Workshop",LocalDateTime.of(2025,1,28,13,0),Duration.ofHours(2)),
                new Event("Client Meeting",LocalDateTime.of(2025,1,29,10,0),Duration.ofHours(1))
        );

        System.out.println("All Events :");
        l.forEach(System.out::println);
        LocalDate localDate=LocalDate.of(2025,1,28);
        System.out.println();
        System.out.println("Events on "+localDate+" :");
        l.parallelStream().filter(event -> event.getDateTime().toLocalDate().equals(localDate))
                .forEachOrdered(event -> System.out.println(event.getName()));
        System.out.println();
        System.out.println("Duration Between Consecutive Events");
        for(int i=0;i<l.size()-1;i++)
        {
            Event e1=l.get(i);
            Event e2=l.get(i+1);
            Duration duration=Duration.between(e1.getDateTime().plus(e1.getDuration()),e2.getDateTime());
            System.out.println(String.format("Between \"%s\" and \"%s\" : %s hours",e1.getName(),e2.getName(),duration.toHours()));
        }
    }
}
