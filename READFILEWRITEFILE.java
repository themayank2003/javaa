import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {

    public static void main(String[] args) {
        String data = "This is an example of writing to a file using FileOutputStream.";
        String filePath = "example.txt";

        // Writing to the file
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Convert string data to bytes and write to the file
            fos.write(data.getBytes());
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading from the file
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            System.out.println("Reading data from the file:");
            // Reading each byte until the end of the file
            while ((content = fis.read()) != -1) {
                // Print each byte as a character
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}


//output
//Data has been written to the file.
//Reading data from the file:
//This is an example of writing to a file using FileOutputStream.

//
//