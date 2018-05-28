package excercises.lesson1;

/**
 * Time
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int Hour, int Minute, int Second) {
        hour = Hour;
        minute = Minute;
        second = Second;
    }

    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int Hour) {
        hour = Hour;
    }

    public void setMinute(int Minute) {
        minute = Minute;
    }

    public void setSecond(int Second) {
        second = Second;
    }

    public void setTime(int Hour, int Minute, int Second){
        hour = Hour;
        minute = Minute;
        second = Second;
    }

    public String toString() {
        String strHour, strMinute, strSecond;
        
        if(hour < 10) strHour = "0" + String.valueOf(hour);
        else strHour = String.valueOf(hour);
        if(minute < 10) strMinute = "0" + String.valueOf(minute);
        else strMinute = String.valueOf(minute);
        if(second < 10) strSecond = "0" + String.valueOf(second);
        else strSecond = String.valueOf(second);

        return strHour+":"+strMinute+":"+strSecond;
    }

    public Time nextSecond() {
        Time next =  new Time(hour, minute, second+1);
        if(next.getSecond() == 60) {
            next.setMinute(minute+1);
            next.setSecond(0);
            if(next.getMinute() == 60){
                next.setMinute(0);
                next.setHour(hour+1);
                if(next.getHour()==24)
                    next.setHour(0);
                
            }
        }
        
        
        return next;
    }

    public Time previousSecond() {
        Time next =  new Time(hour, minute, second-1);
        if(next.getSecond() == -1) {
            next.setMinute(minute-1);
            next.setSecond(59);
            if(next.getMinute() == -1){
                next.setMinute(59);
                next.setHour(hour-1);
                if(next.getHour()==-1)
                    next.setHour(23);
            }
        }
        return next;
    }
}
