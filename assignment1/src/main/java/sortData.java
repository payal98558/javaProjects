import joinery.DataFrame;
import java.io.FileNotFoundException;
import java.io.IOException;

public class sortData {
    public static void main(String[] args) {

        try {
            //converting text file to dataframe
            DataFrame df = DataFrame.readCsv("src/main/resources/input_data.txt","," , null, false);
            System.out.println("Dataframe: "+df);
            df.rename("V0", "names");
            //sorting the dataframe through name column
            DataFrame sortedData= df.sortBy("names");
            // writing the sorted data to output_data.txt file
            sortedData.writeCsv("src/main/resources/output_data.txt");
            System.out.println(sortedData);
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception:");
        }

    }
}
