/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab4;

/**
 *
 * @author devil
 */
import java.io.File;
import java.nio.file.Files;

public class GetMimeTypeLocalFiles {
    public static void main(String[] args) throws Exception {
        File pdfFile = new File("path/to/pdf/file.pdf");
        File imageFile = new File("path/to/image/file.jpg");
        File textFile = new File("path/to/text/file.txt");

        System.out.println("MIME Type of PDF file: " + Files.probeContentType(pdfFile.toPath()));
        System.out.println("MIME Type of Image file: " + Files.probeContentType(imageFile.toPath()));
        System.out.println("MIME Type of Text file: " + Files.probeContentType(textFile.toPath()));
    }
}