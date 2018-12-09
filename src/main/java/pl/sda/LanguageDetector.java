package pl.sda;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LanguageDetector {

    public static void main(String[] args) throws APIError, IOException {
//        String language = detect("das auto fährt schnell");
//        System.out.println("Język to " + language);
//
//        String lines = readLinesFromFile("/home/n2god/Pobrane/Languages/chunichi.txt");
//        System.out.println(detect(lines));

//        List<String> filePaths = readAllFilePaths("/home/n2god/Pobrane/Languages");
//        System.out.println(filePaths.toString());
        detectLanguagesInFolder("/home/n2god/Pobrane/Languages");

    }

    private static void detectLanguagesInFolder(String folderPath) throws IOException, APIError {
        List<String> filePaths = readAllFilePaths(folderPath);
        for (String filePath : filePaths){
            String lines = readLinesFromFile(filePath);
            System.out.println(filePath + " : " + detect(lines));
        }
    }

    private static List<String> readAllFilePaths(String path) {
        List<String> filePathsList = new ArrayList<>();
        File folderName = new File(path);

        for (File file : folderName.listFiles()) {
            if (file.isFile()) {
                filePathsList.add(file.getAbsolutePath());
            }
        }
        return filePathsList;
    }




    private static String readLinesFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private static String detect(String words) throws APIError {
        DetectLanguage.apiKey = "3937959c7e0878cc47b14f0e92644548";
        List<Result> results = DetectLanguage.detect(words);
        Result result = results.get(0);
        return result.language;
    }


}
