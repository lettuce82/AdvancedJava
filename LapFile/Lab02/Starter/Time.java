public class Time {
    int hour;
    int minute;
    int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public int getTime() {
        return this.second;
    }

    public void displayTime() {
        System.out.printf("%d:%d:%d", this.hour, this.minute, this.second);    
    }
}
