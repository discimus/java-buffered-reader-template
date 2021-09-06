import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    private static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    private static Boolean isNotEOF(Integer current) 
    {
        return current != -1;
    }

    private static Boolean isNotEOL(Character current) 
    {
        return current != '\n';
    }

    // private static Boolean isNotEOL(Integer current) 
    // {
    //     return current != 10 && current != 13;
    // }

    public static void main(String[] args) throws IOException
    {
        Integer currentInteger, result = 0, length = 0;
        Character currentCharacter = null;
        Boolean run = true;

        while(run)
        {
            currentInteger = bufferedReader.read();
            currentCharacter = (char) currentInteger.intValue();

            run = isNotEOF(currentInteger);

            if(isNotEOL(currentCharacter) && isNotEOF(currentInteger))
            {
                System.out.print(currentCharacter);
            }
            else
            {
                System.out.print('\n');
            }

        }
        
        bufferedReader.close();   
    }
}