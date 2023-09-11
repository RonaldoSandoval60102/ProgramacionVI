public class CalendarAPIImpl implements CalendarAPI{

    private String eventName;

    private String date;

    public CalendarAPIImpl(String eventName, String date){
        this.date = date;
        this.eventName = eventName;
    }

    @Override
    public String scheduleEvent() {
        return "Event send: " + eventName + " the " + date;
    }

    @Override
    public String toString(){
        return "[" + eventName + "," + date + "]";
    }

}
