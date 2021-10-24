/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Computer Science
 */
public class TV {
     int channel;
     int volumlevel;
     boolean on;
     
    public TV()
    {
        channel=120;
        volumlevel=7;
        on=true;
     }
    public void turnOn()
    {
     on=true;   
    }
     public void turnOff()
    {
        on=false;
    }
     public void setChannel(int newChannel)
     {
         channel=newChannel;
     }
      public void setVolume(int newVolume)
     {
         volumlevel=newVolume;
     }
     public void ChannelUp()
     {
         channel++; 
     }
     public void ChannelDown()
     {
        channel--; 
     }
     public void volumUp()
     {
          volumlevel++;
     }
      public void volumDown()
     {
           volumlevel--;
     }
      public void print_TV_data()
      {
          System.out.println("channel "+channel);
          System.out.println("volumlevel "+volumlevel);
          System.out.println("on "+on);
      }
    
}
