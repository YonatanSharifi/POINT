
public class Date {
    private int day, month, year;
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() { return day + "/" + month + "/" + year; }
    public boolean isEquals(Date d) { return d.day==this.day && d.month==this.month && d.year==this.year; }
    }

