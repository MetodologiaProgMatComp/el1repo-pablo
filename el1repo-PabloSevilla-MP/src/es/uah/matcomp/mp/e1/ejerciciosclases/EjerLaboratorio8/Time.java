package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio8;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        String frase=hour+":"+minute+":"+second;
        if (hour<10){
            if (minute<10){
                if (second<10){
                    frase="0"+hour+":0"+minute+":0"+second;
                }
                else{
                    frase="0"+hour+":0"+minute+":"+second;
                }
            }
            else{
                if (second<10){
                    frase="0"+hour+":"+minute+":0"+second;
                }
                else{
                    frase="0"+hour+":"+minute+":"+second;
                }

            }
        }
        else{
            if (minute<10){
                if (second<10){
                    frase=hour+":0"+minute+":0"+second;
                }
                else{
                    frase=hour+":0"+minute+":"+second;
                }
            }
            else{
                if (second<10){
                    frase=hour+":"+minute+":0"+second;
                }
            }
        }
        return frase;
    }
    public Time nextSecond(){
        int x=getSecond();
        int y=getHour();
        int z=getMinute();               //    y    z    x
        if (x==59){
            if (z==59){
                if (y==23){
                    x=0;
                    y=0;
                    z=0;
                }
                else{
                    x=0;
                    y=y+1;
                    z=0;
                }
            }
            else{
                x=0;
                z=z+1;
            }
        }
        else{
            x=x+1;
        }
        this.hour=y;
        this.minute=z;
        this.second=x;
        return new Time(y,z,x);
    }
    public Time previousSecond(){
        int x=getSecond();
        int y=getHour();
        int z=getMinute();               //    y    z    x
        if (x==0){
            if (z==0){
                if (y==0){
                    x=59;
                    y=23;
                    z=59;
                }
                else{
                    x=59;
                    y=y-1;
                    z=59;
                }
            }
            else{
                x=59;
                z=z-1;
            }
        }
        else{
            x=x-1;
        }
        this.hour=y;
        this.minute=z;
        this.second=x;
        return new Time(y,z,x);
    }
}


