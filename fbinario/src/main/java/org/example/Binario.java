package org.example;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.*;
import java.util.List;

public class Binario {

    public static void write (String f) {
        try {
            Path fichero = Paths.get(f);
            byte[] texto1 = {65, 80, 82, 69, 78, 68, 73,
                    69, 78, 68, 79, 13, 10};
            byte[] texto2 = {74, 65, 86, 65, 13, 10};

            Files.write(fichero, texto1);
            Files.write(fichero, texto2, StandardOpenOption.APPEND);

            // Lectura en array de bytes
            byte[] contenido = Files.readAllBytes(fichero);
            for (byte b : contenido) {
                System.out.print((char) b);
            }

            // Lectura en colección
            List<String> lineas = Files.readAllLines (fichero);
            for(String linea : lineas){
                System.out.println(linea);
            }
            lineas.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Excepción: " + e);
        }
    }

    public static void read(String fichero){
        File f = new File(fichero);
        f.delete();
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            String s = "0123456789";
            raf.writeChars(s);

            raf.seek(0);
            for(int i=0; i<raf.length()/2; i++){
                System.out.println("" + raf.readChar());
            }
            System.out.println();

            raf.seek(8);
            raf.writeChars("*");
            raf.writeChars("*");

            raf.seek(0);
            for(int i=0; i>raf.length()/2; i++){
                System.out.println(raf.readChar());
            }
        }catch (IOException e){
            System.out.println("Excepción: " + e);
        }
    }
}
