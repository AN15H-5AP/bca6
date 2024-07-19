/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab2;

/**
 *
 * @author devil
 */
import java.net.URI;

public class ResolveRelativeURI {
    public static void main(String[] args) throws Exception {
        URI baseUri = new URI("http://www.oic.edu.np/folder/");
        URI relativeUri = new URI("page.html");
        URI resolvedUri = baseUri.resolve(relativeUri);
        
        System.out.println("Resolved URI: " + resolvedUri);
    }
}
