package org.example;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        Runtime rTime = Runtime.getRuntime();
        String url = "C:\\Users\\44746\\IdeaProjects\\BusinessTripReimbursementCalculationApplication\\src\\main\\java\\org\\example\\index.html";
        File htmlFile = new File(url);
        Desktop.getDesktop().browse(htmlFile.toURI());




    }
}