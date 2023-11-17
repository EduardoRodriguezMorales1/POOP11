/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author Mariana, Eduardo, Adolfo
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        System.out.println("###########FILE#################");
        File archivo = new File("archivo.txt");
        System.out.println("Archivo Existe: "+archivo.exists());
        if(!archivo.exists()){
            try {
                boolean seCreo = archivo.createNewFile();
                System.out.println("Se creo un archivo: "+seCreo);
                System.out.println("Archivo existe: " +archivo.exists());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                
            }
        }
        
        System.out.println("###########File Writer#################");
        try {
            System.out.println("###########Lectura desde teclado#################");
            BufferedReader br = new BufferedReader(new InputStreamReader( System.in) );
            System.out.println("Escriba el texto para el archivio");
            String texto = br.readLine();
            System.out.println("El usurario escribio: "+texto);
            
            System.out.println("###########Escritura del archivo#################");
            FileWriter fw = new FileWriter("Archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos = new PrintWriter(bw);
            impresoraDeArchivos.print(texto);
            impresoraDeArchivos.close();
            
            System.out.println("###########Escritura del archivo#################");
            FileReader fr = new FileReader("archivo.txt");
            br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
            
            System.out.println("###########StringTokenizer#########");
            String alumno = "Hectro,Jimenez,Maya,123456789,20,8.3";
            System.out.println("Cadena a tokenizar"+alumno);
            StringTokenizer tokenizador = new StringTokenizer(alumno, ",");
            while( tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
            }
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
        */
        /*
        System.out.println("###########Actividad Extra##########");
        try {
             
            
            System.out.println("###########Escritura del archivo#################");
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter impresoraDeArchivos = new PrintWriter(bw);
            impresoraDeArchivos.println("Rodrigo,Sanchez,Perez,20,12345,9.9,Copilco 300 Coyoacan");
            impresoraDeArchivos.println("Sandra,Sanchez,Perez,20,12345,9.9,Copilco 300 Coyoacan");
            impresoraDeArchivos.println("Itzel,Sanchez,Perez,20,12345,9.9,Copilco 300 Coyoacan");
            impresoraDeArchivos.println("Eduardo,Sanchez,Perez,20,12345,9.9,Copilco 300 Coyoacan"); 
            impresoraDeArchivos.println("Ramon,Sanchez,Perez,20,12345,9.9,Copilco 300 Coyoacan");
            
            impresoraDeArchivos.close();
            
            System.out.println("###########Lectura del archivo#################");
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
            
            System.out.println("###########StringTokenizer#########");
            String alumno = "Hectro,Jimenez,Maya,123456789,20,8.3";
            System.out.println("Cadena a tokenizar"+alumno);
            StringTokenizer tokenizador = new StringTokenizer(alumno, ",");
            while( tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
            }
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        */
        
        System.out.println("###########Actividad Extra##########");
        try {
            // Crear una lista de 10 objetos Alumno con datos de muestra
            ArrayList<Alumno> listaAlumnos = new ArrayList<>();
            listaAlumnos.add(new Alumno("Rodrigo", "Sanchez", "Perez", "12345", 20));
            listaAlumnos.add(new Alumno("Sandra", "Sanchez", "Perez", "54321", 22));
            listaAlumnos.add(new Alumno("Itzel", "Gomez", "Lopez", "98765", 21));
            listaAlumnos.add(new Alumno("Eduardo", "Martinez", "Garcia", "56789", 23));
            listaAlumnos.add(new Alumno("Ramon", "Hernandez", "Jimenez", "45678", 19));
            listaAlumnos.add(new Alumno("Laura", "Gutierrez", "Ramirez", "34567", 22));
            listaAlumnos.add(new Alumno("Juan", "Perez", "Lopez", "67890", 20));
            listaAlumnos.add(new Alumno("Maria", "Lopez", "Gutierrez", "23456", 21));
            listaAlumnos.add(new Alumno("Pedro", "Garcia", "Hernandez", "78901", 22));
            listaAlumnos.add(new Alumno("Karla", "Ramirez", "Gomez", "11223", 20));

            // Escribir los datos en un archivo CSV llamado "alumnos1.csv"
            FileWriter fw = new FileWriter("alumnos1.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            try (PrintWriter impresoraDeArchivos = new PrintWriter(bw)) {
                for (Alumno alumno : listaAlumnos) {
                    impresoraDeArchivos.println(alumno.toCSV());
                }
            }
            System.out.println("Datos escritos en el archivo alumnos1.csv");

            // Leer los datos desde el archivo CSV "alumnos1.csv"
            FileReader fr = new FileReader("alumnos1.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("###########Lectura del archivo#################");
            String linea = br.readLine();

            // Crear una nueva lista de objetos Alumno desde el archivo CSV
            ArrayList<Alumno> listaAlumnosDesdeArchivo = new ArrayList<>();
            while (linea != null) {
                StringTokenizer tokenizador = new StringTokenizer(linea, ",");
                String nombre = tokenizador.nextToken();
                String apPat = tokenizador.nextToken();
                String apMat = tokenizador.nextToken();
                String numCuenta = tokenizador.nextToken();
                int edad = Integer.parseInt(tokenizador.nextToken());

                listaAlumnosDesdeArchivo.add(new Alumno(nombre, apPat, apMat, numCuenta, edad));

                linea = br.readLine();
            }
            br.close();

            // Imprimir los datos de los alumnos leídos desde el archivo
            System.out.println("\nDatos leídos desde el archivo:");
            for (Alumno alumno : listaAlumnosDesdeArchivo) {
                System.out.println("Nombre: " + alumno.getNombre() + ", Apellido Paterno: " + alumno.getApPat() +
                        ", Apellido Materno: " + alumno.getApMat() + ", Número de Cuenta: " + alumno.getNumCuenta() +
                        ", Edad: " + alumno.getEdad());
            }


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
       
} 