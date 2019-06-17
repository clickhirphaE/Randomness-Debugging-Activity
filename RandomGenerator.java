import java.util.*;

public class RandomGenerator{
    public static void main(String[] args)
    {
        System.out.println("Generate 10 random integers between 0 and 6");
        Random rnd=new Random();

        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = 1 + rnd.nextInt(6);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}