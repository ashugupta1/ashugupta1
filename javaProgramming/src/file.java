// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.Reader;
// import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;


// //FIle Handling

// public class file {
//     public static void main(String[] args) {

//     //     try{
    //     File file = new File("myfile.txt"); 
    //     if (file.createNewFile()) {
    //         System.out.println("file is created "+file.getName());
    //     } else {
    //         System.out.println("file already exist ");
    //     }

    //     String path = file.getAbsolutePath();
    //     System.out.println(path);
    // }

    //     catch(IOException e) {
    //         System.out.println("an error is occupied");
    //         e.printStackTrace();
    //     }

//     try{
//         FileWriter Writer = new FileWriter("myfile.txt");
//         Writer.write("this is my new file ");
//         Writer.close();
//         System.out.println("file successfully updated ");
//     }
//     catch(IOException exception) {
//         System.out.println("error found");
//     }

    //   File file = new File("myfile1.txt");
    //   if (file.delete()) {
    //     System.out.println("file is succesfuly deleted");
    //   } else {
    //   System.out.println("failed to deleted the file");
    //   }


//     try{
//         File file = new File("myfile.txt");
//         Scanner obj = new Scanner(file);
//         while (obj.hasNextLine()) {
//             String data = obj.nextLine();
//             System.out.println(data);
//         }
//         obj.close();
//     } 
//     catch(FileNotFoundException exception) {
//         System.out.println("An error has occurred.");
//         exception.printStackTrace();
//     }

//    }
    
// }

import java.io.IOException;
import java.io.File;


class file {
    public static void main(String[] args) {
        
        try {
            File file = new File("file.txt");
            file.createNewFile();
            System.out.println("file created successfully....");
        }

    catch(IOException exception) {
        System.out.println("error found...");
        exception.fillInStackTrace();
    }

    if (file.createNewFile()) {
        
    }




    }
}