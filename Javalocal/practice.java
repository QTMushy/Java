import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class practice {
    public static void main(String[] args)
    throws IOException
    {
        
    

    FileReader reader = new FileReader("Numbers.txt");
    BufferedReader br = new BufferedReader(reader);
    ArrayList<Double> numbers = new ArrayList<>();
    String line = br.readLine();
    while(line!=null)
    {
        double temp = Double.parseDouble(line);
        numbers.add(temp);
        line = br.readLine();
        

    }
    br.close();
    reader.close();
    FileWriter write = new FileWriter("Results.txt");
    PrintWriter input = new PrintWriter(write);
    String[] name = {"shubham","malhotra","qweeqweq","ewedwqdqw"};

    for(int i=0;i<name.length;i++)
    {
        input.printf("%.1f\t",numbers.get(i));
        input.print(name[i]);
        input.println();
    }
    input.close();
    write.close();
    
    
    }
    
}
