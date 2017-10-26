package controller;

import java.io.File;
import java.util.ArrayList;

public class Controller {
    File srcFile;
    ArrayList<String> lineList;

    Controller(String fileName){
        //Instantiates a file from the filename given

    }

    public static void processFile(){
        //reads the srcFile

        //turns it into an arraylist with each node being a word.

        for(/**every line in the file**/) {
            // arrayList gets circular shifted with each shifted line being made into a new string
            // Each of the aforementioned strings gets sent to the line list
        }

        sortLineList();

        //For every line in the line list
            //Send each line to the console
            //Send each line to the new file
    }

    public static String circularShift(){
        //Shifts the array list, first word gets appended to the end
        //Turns the ArrayList into a string
        //String line = lineList.toString.

        return line;
    }

    public static void sortLineList(){
        //rearranges the linelist into alphabetical order in thier places in the list.
    }
}
