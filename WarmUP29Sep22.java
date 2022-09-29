import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WarmUP29Sep22 {
    public static void main(String[] args) {
        // References:
        // https://www.w3schools.com/java/java_files_create.asp

        // Instructions:
        // 1) Discuss this code with your lab partner
        //     a) what does it do?
        //     b) where does it do it?
        //     c) how are file and path names used?
        //     d) what is try and catch?
        // 2) Code up this warmup and examine your new files
        // 3) Create the genAnimalName function you are designing
        //
        // References:
        //   https://www.w3schools.com/java/java_files_read.asp
        //   https://www.w3schools.com/java/java_arrays.asp
        //   https://www.geeksforgeeks.org/searching-for-characters-and-substring-in-a-string-in-java/

        // Open a file and read it line by line.
        int lineCount = 1;
        try {
            File myObj = new File("C:/javaMidTermFiles/animalNames.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            Scanner scanner = new Scanner(myObj);
            lineCount = 1;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
                lineCount++;
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Get the lines into a 1D array.
        // Create an array. Note the initialized array size.
        String[] linesInAnimalNameFile = new String[lineCount];
        int elementNum = 0;

        try {
            File file = new File("C:/javaMidTermFiles/animalNames.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String fileLineAsString = scanner.nextLine();
                // Write string data to the array.
                linesInAnimalNameFile[elementNum] = fileLineAsString;
                elementNum++;
            }
            // Close the file.
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Display the array of file lines.
        System.out.println("\n The array looks like this..\n");
        for (int i=0; i<lineCount; i++){
            System.out.println(linesInAnimalNameFile[i]);
        }

        // Parse the array!
        String str = "Shenzi-Banzai-Ed-Zig-Bud-Lou-Kamari-Wema-Nne-Madoa-Prince Nevarah";
        String arrOfStr[] = str.split("-");

        System.out.println("\n----Max 3----");
        arrOfStr = str.split("-", 3);
        for (String a : arrOfStr)
            System.out.println(a);
    }
}