package lecture06;

import java.time.*;
public class Clock{

    public static void main(String[] args){
      LocalDateTime now;
      int nowSec;
      int prevSec = 0;
      for (;;){
         now = LocalDateTime.now();
         nowSec = now.getSecond();

            System.out.println(now.getHour() + ":" +
               now.getMinute() + ":" + nowSec);
            prevSec = nowSec;

      }
   }
}
