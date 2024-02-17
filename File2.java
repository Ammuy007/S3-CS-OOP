//Write to a file and copy the contents to another file
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String fileName2 = "file2.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName);
             FileWriter fw = new FileWriter(fileName2);
             BufferedReader bff = new BufferedReader(new FileReader(fileName))) {

            System.out.println("Enter text (type '-1' to stop):");

            String data;
            while (!(data = br.readLine()).equals("-1")) {
                writer.write(data);
                writer.write(System.lineSeparator());
            }

            System.out.println("Data has been written to " + fileName);

        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        try (BufferedReader bff = new BufferedReader(new FileReader(fileName));
             FileWriter fw = new FileWriter(fileName2)) {

            String input;
            while ((input = bff.readLine()) != null) {
                fw.write(input);
                fw.write(System.lineSeparator());
            }

            System.out.println("Data has been written to " + fileName2);

        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
