import java.util.Scanner;

class Time {

    int hour;
    int min; 
    int sec;

void inputTime(){
   hour=14;
   min=45;
   sec=20;
 }
void showTime(){
 if(hour>12){
            hour=hour-12;
            System.out.println(hour + ":" + min + ":" + sec + " pm");
        }

        else{
            System.out.println(hour + ":" + min + ":" + sec + " am");
        }
    }
}
  