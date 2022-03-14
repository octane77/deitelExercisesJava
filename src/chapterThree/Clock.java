package chapterThree;

public class Clock {

    private Integer Hour;
    private Integer Minute;
    private Integer Second;

    public Clock(Integer Hour, Integer Minute, Integer Second) {
        this.Hour = Hour;
        this.Minute = Minute;
        this.Second = Second;
    }

    public void setHour(Integer Hour) {
        if(Hour < 24)
        this.Hour = Hour;
    }

    public Integer getHour(){
        return Hour;
    }

    public void setMinute(Integer Minute) {
        if(Minute < 60){
            this.Minute = Minute;
        }
        if (getHour()>23){
            setMinute(0);
        }
    }

    public Integer getMinute() {
        return Minute;
    }

    public void setSecond(Integer Second) {
        if (getHour()>23 && getMinute() >59){
            setSecond(0);
        }

        if(Second < 60) {
            this.Second = Second;
        }
    }

    public Integer getSecond(){
        return Second;
    }


}
