import java.util.Scanner;
import java.io.*;


public class YukSpaceAge
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please enter your age: ");

    int earthAge = keyboard.nextInt();
    
    printMercuryAge(earthAge);
    printVenusAge(earthAge);
    printMarsAge(earthAge);
    printJupiterAge(earthAge);
    printSaturnAge(earthAge);
    printUranusAge(earthAge);
    printNeptuneAge(earthAge);
    printPlutoAge(earthAge);
  }

 public static double printMercuryAge(int age)
  {
    double earthDay = 365.25; 
    double mercuryAge = (earthDay * age) / 88;
    System.out.printf("Mercury age = %.2f\n", mercuryAge);
    return mercuryAge;
  }
  public static double printVenusAge(int age)
  {
    double earthDay = 365.25;
    double venusAge = (earthDay * age) / 224.7;
    System.out.printf("Venus age = %.2f\n", venusAge);
    return venusAge;
  }
  public static double printMarsAge(int age)
  {
    double earthDay = 365.25;
    double marsAge = (earthDay * age) / 687;
    System.out.printf("Mars age = %.2f\n", marsAge);
    return marsAge;
  }
  public static double printJupiterAge(int age)
  {
    double earthDay = 365.25;
    double jupiterAge = (earthDay * age) / (earthDay * 11.86);
    System.out.printf("Jupiter age = %.2f\n", jupiterAge);
    return jupiterAge;
  }
  public static double printSaturnAge(int age)
  {
    double earthDay = 365.25;
    double saturnAge = (earthDay * age) / (earthDay * 29.46);
    System.out.printf("Saturn age = %.2f\n", saturnAge);
    return saturnAge;
  }
  public static double printUranusAge(int age)
  {
    double earthDay = 365.25;
    double uranusAge = (earthDay * age) / (earthDay * 84);
    System.out.printf("Uranus age = %.2f\n", uranusAge);
    return uranusAge;
  }
  public static double printNeptuneAge(int age)
  {
    double earthDay = 365.25;
    double neptuneAge = (earthDay * age) / (earthDay * 164.8);
    System.out.printf("Neptune age = %.2f\n", neptuneAge);
    return neptuneAge;
  }
  public static double printPlutoAge(int age)
  {
    double earthDay = 365.25;
    double plutoAge = (earthDay * age) / (earthDay * 248);
    System.out.printf("Pluto age = %.2f\n", plutoAge);
    return plutoAge;
  }

}