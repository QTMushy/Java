import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Table {
    public static void main(String[] args)
    throws IOException
    
    {
        double[][] input = new double[3][4];
        FileReader file = new FileReader("2darray.txt");
        BufferedReader read = new BufferedReader(file);
        String line = read.readLine();
        int row =0;
        while(line!=null)
        {
            String[] split = line.split(" ");
            for(int i =0;i<split.length;i++)
            {
                double temp = Double.parseDouble(split[i]);
                input[row][i]=temp;

            }
            row++;
            line = read.readLine();
        }
        file.close();
        read.close();
        for(int i=0;i<input.length;i++)
        {
            for(int j=0;j<input[i].length;j++)
            {
                System.out.printf("%.1f ",input[i][j]);
            }
            System.out.println();
        }
    }
    
}
