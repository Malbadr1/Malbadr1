import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public Time() {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

   String getTime() {
        Scanner t = new Scanner(System.in);
        System.out.println("enter hour");
       hour = t.nextInt();
        System.out.println("enter minute");
        minute = t.nextInt();
        System.out.println("enter second");
      second = t.nextInt();
        return String.valueOf("time is : "+hour +":"+ minute +":"+ second);

    }

   String getTimeArray(){
    String []hour=new String[1];
        String []min=new String[1];
        String []sec=new String[1];
        String []time=new String[1];
        Scanner s1=new Scanner(System.in);
        for (int i = 0; i <time.length; i++) {
            System.out.println("enter hour");
            hour[i]=s1.nextLine();
            System.out.println("enter minute");
           min[i]=s1.nextLine();
            System.out.println("enter second");
            sec[i]=s1.nextLine();
            time [i]="time is "+" hour: "+hour[i]+" minute: "+min[i]+" second: "+sec[i];

        }
        for (String i:time
             ) {
            System.out.println(i);

        }
        return "thanks";
    }

    String getDate(){
        Date date=new Date();

        return String.valueOf(date);
    }
    String getAddDate(){
        Calendar date = Calendar.getInstance();
        System.out.println("Current Date and TIme : " + date.getTime());
        long timeInSecs = date.getTimeInMillis();
        Date afterAdding10Mins = new Date(timeInSecs + (10 * 60 * 1000));
        System.out.println("After adding 10 mins : " + afterAdding10Mins);
        return "";
    }

    @Override
    public String toString() {
        return "Time1 is " +
                "hour" + hour +
                ", minute" + minute +
                ", second=" + second;
    }

    public static void main(String[] args) {

        Time time = new Time();
        System.out.println(time.getAddDate());

    }

}


