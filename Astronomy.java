import java.util.*;
public class Astronomy 
  { 
    public static void main(String[] args)
    {
Scanner keyboard = new Scanner(System.in);

System.out.println("Welcome to Astronomy Practice");
System.out.println("This is your chance to practice concepts we have learned in class");
System.out.print("Below are some practice problems, scroll through them, attempt them," + " and when you have trouble");
System.out.println("enter the number of the problem and we will provide you with the answer and an explanation!\n");

System.out.println("1. If Star A has a temperature of 6000 K but Star B has a temperature of 3000 K," + "how does the flux of Star A compare to Star B?\n");

System.out.print("3. How energetic a photon required to strip an electron away from a completely relaxed Hydrogen atom?" + " The wavelength of the photon is 92 nm");
System.out.println(" Answer in scientific notation.\n");
System.out.println("4. Which of the following is not one of the three regions of the Suns interior? ");
System.out.println("\t" + " a) Radiative Zone");
System.out.println("\t" + " b) Core");
System.out.println("\t" + " c) Convective Zone");
System.out.println("\t" + " d) Photosphere\n");
System.out.println("5. Which of the following statements is true?");
System.out.println("\t" + " a) red shift -> short wavelengths -> moving away from observer");
System.out.println("\t" + " b) blue shift -> short wavelengths -> moving away from observer");
System.out.println("\t" + " c) red shift -> long wavelengths -> moving away from observer");
System.out.println("\t" + " d) blue shift -> long wavelengths -> moving towards the osberver\n");
System.out.println("6. What kind of spectrum do you get from a transparent hot gas?");
System.out.println("\t" + " a) absorption");
System.out.println("\t" + " b) emission");
System.out.println("\t" + " c) continuous\n");
System.out.println("7. How hot can it get on Mercury?");
System.out.println("** Assume flux in = flux out");
System.out.println("Flux in (from Sun) - 13700 W m^-2");
System.out.println("Flux out = sT^4, s = 6x10-8 W m^-2 K^-4\n");
System.out.println("8. What is the most abundant gas in the Earth's atmosphere?");
System.out.println("\t" + " a) Carbon Dioxide (C02)");
System.out.println("\t" + " b) Water (H20)");
System.out.println("\t" + " c) Oxygen (O2)");
System.out.println("\t" + " d) Nitrogen (N2)\n");
System.out.println("9. Why does the Moon go through phases over the course of a month?");
System.out.println("\t" + " a) The Earth casts a shadow of varying size and shape on the Moon.");
System.out.println("\t" + " b) The illuminated portion of the Moon's face visible from Earth changes.");
System.out.println("\t" + " c) The shape of the Moon and its rotation combine to produce moon phases.\n");
System.out.println("10. Is it likely that a large Jovian planet would form at the distance of Mercury from the Sun? (yes or no)\n");
      
int help = keyboard.nextInt(); 

if( help == 1) {
  System.out.println("Answer: Star A will have a flux 16 times higher than star B\n");
  System.out.println(" Explanation: Remember the formula for calculating the flux of a Star --> F = sigmaT^4");
  System.out.println(" a) sigma is the Stefan Boltzman Constant which is: 5.67 x 10^-8");
  System.out.println(" b) T is the temperature of the Star");
  System.out.println(" c) Multiply the constant by the temperature, and then raise it to the 4th power to get the flux\n");
  System.out.println(" 1. F = (5.67 x 10^-8)(6000 K)^4 --> 1.3394831 x 10^-14. This is the flux of Star A.");
  System.out.println(" 2. (5.67 x 10^-8)(3000 K)^4 ---> 8.37176935 x 10^-16. This is the flux of Star B.");
  System.out.println(" 3. Finally, divide the flux of Star B by Star A.");
  System.out.println("\t" + "- (1.3394831 x 10^-14)/(8.37176935 x 10^-16) = 16.0\n");
  System.out.println("Star A's flux is 16 times higher than star B\n");
  
  
  if(help == 2) {
    System.out.println(" Answer: B\n");
    System.out.print(" Explanation: Remember, if a sunspot has a higher latitude, it is further from the equator");
    System.out.println(" so the rotation time is longer, which is why it is 27.5 days, not 25 ( sunspots close to equator\n");
    
    }
  if(help == 3) {
    System.out.println("Answer: 2.20E-18\n");
    System.out.println(" Explanation: Remember, E= hc/lambda\n");
    System.out.println(" 1. h = planck constant -> 6.6261 x 10 ^ -34 J\n");
    System.out.println(" 2. c = speed of light -> 3 x 10 ^ 8\n");
    System.out.println(" 3. lambda = wavelength -> 92 nm\n");
    System.out.println(" 4. (6.6261 x 10 ^ -34 * 3 x 10 ^8)/ 92 = 2.16 x 10 ^ -18\n");
    System.out.println(" 5. Using significant figures (you need to use one), it would round to 2 x 10 ^ -18\n"); 
                         
}
  
  if( help == 4)
  {
    System.out.println(" Answer: D\n");
    System.out.println(" Explanation: Remember the surface of the sun is the photosphere; it is the outer part, not the inner.");
  
    }
  
  if( help == 5)
  {
    System.out.println(" Answer: C\n");
    System.out.print(" Explanation: Remember, blue shift is towards us and short wavelength because of high frequency");
    System.out.println(" while red shift is moving away from us and has longer wavelengths as frequency decreases\n");
    System.out.println(" Blue Doppler Shift --> towards us --> short wavelengths\n");
    System.out.println(" Red Doppler Shift --> away from us --> long wavelengths\n");
}
   
if(help == 6)
{
  System.out.println(" Answer: B\n");
  System.out.println(" Explanation: Remember: a hot gas = emmission, a cool gas = absorption, continuous = no gas");
                       }
    
    
if( help == 7)
{
  System.out.println("Answer: 7E2 J (joules)");
  System.out.println("Explanation: You want to find the temperature, so we need to get t by itself");
  System.out.println("If we follow the equation: 13700 W m^-2 = (6x10^-8W m^-2 K^-4)(T^4)");
  System.out.println("We want to divide 13700 by 6x10^-8 to get t^4 by itself.");
  System.out.println("13700/6x10^-8 is 0.000022833");
  System.out.println("Then you raise that answer to the 1/4 to get rid of the 4th power");
  System.out.println("0.000022833^1/4 = 0.069126144");
  System.out.println("To put this answer in scientific notation you need to move the decimal two places to the right");
  System.out.println("It becomes 6.91....");
  System.out.println("In sig figs, the least amount of sig fig in the equation is 1, so you round 6.9 to 7");
  System.out.println("and you have two digits after the decimal so it becomes 7E2 J (joules)."); 
}

if(help == 8)
{
  System.out.println("Answer: D");
  System.out.print("Explanation: Remember, the Earth's atmosphere is made mostly of Nitrogen");
  System.out.println("with a total of 78%. Do not mix it up with Oxygen which is the most important gas for humans.");
}

if(help == 9)
{
  System.out.println("Answer: B");
  System.out.print("Explanation: The phases of the moon do not relate to shadows or the shape of the moon. It depends on the illumination portion");
  System.out.println("visible depending on your location on Earth as the sun rotates.");
}
  if(help == 10)
  {
    System.out.print("The answer is no. Remember Jovian planets are the larger ones in the outer part of the solar system.");
    System.out.print("It's composition and size is dependent on it's distance to the Sun and since Mercury is a terrestrial planet, a Jovian");
    System.out.println("planet can not form that close to the Sun.");
    System.out.println("Inner planets = heavy element, high density, rocky, small");
    System.out.println("Outer planets = light, low density, icy/gaseous, large");
    }
}
    }
