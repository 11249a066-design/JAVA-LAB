
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Name: Rahul\n");
            writer.write("Roll No: 101\n");
            writer.write("Course: Java\n");
            writer.close();

            System.out.println("Data written successfully.");

            Scanner sc = new Scanner(file);
            System.out.println("\nFile contents:");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
