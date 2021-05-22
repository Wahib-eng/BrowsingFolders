package com.withWahib;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            // أحصل على الملف المختار
            File file = fileChooser.getSelectedFile();
            // كون مدخل للملف
            Scanner input = new Scanner(file);
            // أقراء النصوص من الملف
            String text = "";
            while (input.hasNext()) {
                text += input.nextLine() + "\n";
            }
            JOptionPane.showMessageDialog(null, text);
            // اغلق الملف
            input.close();
        } else {
            System.out.println("No file selected");
        }
    }

}
