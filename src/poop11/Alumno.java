/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 *
 * @author Mariana Eduardo Adolfo 
 */
public class Alumno {
    private final String nombre;
    private final String apPat;
    private final String apMat;
    private final String numCuenta;
    private final int edad;

    // Constructor de la clase Alumno
    /**
     * 
     * @param nombre     Nombre del alumno 
     * @param apPat      Apellido paterno del alumno
     * @param apMat      Apellido Materno del alumno
     * @param numCuenta  Numero de cuenta del alumno
     * @param edad       Edad del alumno
     */
    public Alumno(String nombre, String apPat, String apMat, String numCuenta, int edad) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

  
    /**
     * Método para escribir los datos de los alumnos en un archivo CSV llamado "alumnos1.csv"
     * @param alumnos 
     */
    public static void escribirCSV(ArrayList<Alumno> alumnos) {
        escribirCSV(alumnos, "alumnos1.csv");
    }

    /**
     * 
     * @param alumnos Escribe los datos guardos en la lista de alumnos 
     * @param fileName 
     */
    public static void escribirCSV(ArrayList<Alumno> alumnos, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Nombre,ApPat,ApMat,NumCuenta,Edad");
            for (Alumno alumno : alumnos) {
                writer.println(alumno.nombre + "," + alumno.apPat + "," + alumno.apMat + "," + alumno.numCuenta + "," + alumno.edad);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer los datos de los alumnos desde un archivo CSV
    public static ArrayList<Alumno> leerCSV(String fileName) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Leer la primera línea (encabezados) y descartarla
            reader.readLine();

            // Leer el resto de las líneas
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                String nombre = tokenizer.nextToken();
                String apPat = tokenizer.nextToken();
                String apMat = tokenizer.nextToken();
                String numCuenta = tokenizer.nextToken();
                int edad = Integer.parseInt(tokenizer.nextToken());

                Alumno alumno = new Alumno(nombre, apPat, apMat, numCuenta, edad);
                alumnos.add(alumno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return alumnos;
    }

    // Método para crear y devolver una lista de 10 objetos Alumno inicializados
    public static ArrayList<Alumno> crearListaDeAlumnos() {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Alumno alumno = new Alumno("Nombre" + i, "ApellidoPat" + i, "ApellidoMat" + i, "Cuenta" + i, 20 + i);
            listaAlumnos.add(alumno);
        }
        return listaAlumnos;
    }

    // Getters para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public int getEdad() {
        return edad;
    }
    public String toCSV() {
        return String.join(",", nombre, apPat, apMat, numCuenta, Integer.toString(edad));
    }
}
