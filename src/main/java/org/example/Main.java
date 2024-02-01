package org.example;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        readURL(args[0],args[1]);
        readURL(args[2],args[3]);
    }
public static void readURL(String url, String fileName) {

    try {
        //step 1
        URL urlLink = new URL(url);
        System.out.println(" URL: " + urlLink);

        //Readers
        InputStream stream = urlLink.openStream();
        InputStreamReader inputReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(inputReader);

        //Writers
        FileWriter filewriter = new FileWriter(fileName);
        BufferedWriter writer = new BufferedWriter(filewriter);
        String inputLine = "";
        while
        (inputLine != null) {
            //step 2
            inputLine = reader.readLine();



            writer.write(inputLine);
        }
    } catch (Exception e) {
    }
}


};

