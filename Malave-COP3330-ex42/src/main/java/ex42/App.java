package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 42 Solution
 *  Copyright 2021 Jose Malave
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

    public class App {

        public static void output_File(String path)
        {
            //have this variable ready to take in the file line by line
            String line = "";

            try{
                //have th bufferReader take in the file path
                BufferedReader br = new BufferedReader(new FileReader(path));
                //get the dimensions ready for printing out the file
                System.out.printf("%-12s%-12s%-10s%n","Last","First","Salary");
                System.out.println("---------------------------------------");

                //here we are going to read in the lines and then split them up, so they are in a table format
                //similarly to the dimentions up above.
                while(  (line = br.readLine()) != null  )
                {
                    String[] values = line.split(",");
                    System.out.printf("%-12s%-12s%-10s%n", values[0],values[1],values[2]);
                }

                //have the catch see if we are about to make any errors reading in or writing
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
//send the path to the output method
        public static void main(String[] args) {
            String path = "C:\\Users\\JD\\Desktop\\COP3330\\assign1_part3\\Malave-COP3330-ex42\\exercise42_input.txt";
            output_File(path);

        }
    }

