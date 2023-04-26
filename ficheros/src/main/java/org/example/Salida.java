package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class Salida {

    static void escribir() {
        byte CR = 13;
        byte LF = 10;

        try {
            FileOutputStream fos = new FileOutputStream("C:\\ficheros\\fich3.txt");
            fos.write((byte)'a');
            fos.write((byte)'e');
            fos.write((byte)'i');
            fos.write(CR);
            fos.write(LF);
            fos.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}