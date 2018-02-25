import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;

public class Command{
  public static void main(String args[]) throws IOException, AWTException, InterruptedException{
    Runtime run = Runtime.getRuntime();
    run.exec(new String[] {"cmd", "/K", "Start"});
    try{
      Thread.sleep(100);
    }catch (InterruptedException e){
      e.printStackTrace();
    }
    ControlManager ctr = new ControlManager();
    ctr.type("telnet towel.blinkenlights.nl"); //enter the command you want to run in the cmd here
  }
}
