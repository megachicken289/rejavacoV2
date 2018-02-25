package java.chapters.ch8;

public class Time2
{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time2 no-argument constructor:
    // initializes each insrance variable to zero
    public Time2() {
        this(0, 0, 0); // invoke constructor with three args
    }

    // Time2 constructor: hour supplied, min and second defaulted to 0
    public Time2(int hour) {
        this(hour, 0,0);    // invoke constructor with three args
    }

    // Time2 constuctor: hour and min supplied, second defaulted to 0
    public Time2(int hour, int minute) {
        this(hour, minute, 0);  // invoke constructor with three args
    }

    // Time2 constuctor: hour and min supplied, second defaulted to 0
    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour(s) must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute(s) must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second(s) must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time) {
        // invoke constructor with three args
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // set Methods
    // set a new time val useing universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour(s) must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute(s) must be 0-59");
        if (second < 0 || second >= 6)
            throw new IllegalArgumentException("Hour(s) must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // validate and set hour
    public void setHour(int hour) {
        if (hour< 0 || hour >=24)
            throw new IllegalArgumentException("Hour must be 0-23");
        this.hour = hour;
    }
    
    // validate and set minutes
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute(s) must be 0-59");
        this.minute = minute;
    }
    
    // valiate and set seconds
    public void setSecond(int second) {
        if (second < 0 || second >= 6)
            throw new IllegalArgumentException("Hour(s) must be 0-59");
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int  getSecond() {
        return second;
    }
    
    // covert to Strin in universal time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", 
                ((getHour() ==0 || getHour() == 12) ? 12 : getHour() %12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

