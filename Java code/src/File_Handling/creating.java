import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

class creating{
    public static void main(String[] args) {
        // creating a File 


        // File myFile = new File("C:\\Java Programms\\Java code\\src\\File_Handling\\sample.txt");
        // try {
        //    myFile.createNewFile();    
        // } catch (IOException e) {
        //     System.out.println("Unable to create a File");
        //     e.printStackTrace();
        // }


        // Writing a file

        // try {
            
        //     FileWriter fileWriter = new FileWriter("sample.txt");
        //     fileWriter.write("I am writing a into a File and again!");
            
        //     fileWriter.close();
        //     System.out.println("Done");
        // } catch (Exception e) {
        //     System.out.println("Sorry we cant write this file");
        // }


    //   Reading a File
//     try {
//     File myFile = new File("C:\\Java Programms\\Java code\\src\\File_Handling\\sample.txt");
//     Scanner sc = new Scanner(myFile);
//     while(sc.hasNextLine()){
//         String line = sc.nextLine();
//         System.out.println(line);
//     }
//     sc.close();

// } catch (FileNotFoundException e) {
//     System.out.println("Sorry we cant read your File!");
//     e.printStackTrace();
// }



// Deleting the File

try {
        File myFile = new File("C:\\Java Programms\\Java code\\src\\File_Handling\\sample.txt");
        if(myFile.delete()){
            System.out.println("Your file " + myFile.getName() + "has been deleted successfully");
        }
    } catch (Exception e) {
       System.out.println("Some issue occured!");
    }


    }
}