package cr.ac.ucenfotec.Tarea3.gestor;

import cr.ac.ucenfotec.Tarea3.bl.entidades.Cliente;
import cr.ac.ucenfotec.Tarea3.bl.entidades.Cuenta;
import cr.ac.ucenfotec.Tarea3.bl.entidades.CuentaAhorro;
import cr.ac.ucenfotec.Tarea3.bl.entidades.CuentaAhorroProgramado;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {
    //----SECCION DE MATERIALES----
    public void guardarCliente(String nombre, String id, String direccion) {
        ArrayList<Cuenta> cuentasCorrientes = new ArrayList<>();
        ArrayList<CuentaAhorro> cuentasAhorro = new ArrayList<>();
        ArrayList<CuentaAhorroProgramado> cuentasAhorroProgramado = new ArrayList<>();
        Cliente cliente = new Cliente(nombre,id,direccion,cuentasCorrientes,cuentasAhorro,cuentasAhorroProgramado);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(cliente.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfClientes.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void guardarCuentaCorriente(String signatura, LocalDate fechaCompra, boolean restringido, String tema, FormatoVideo formato, String duracion, String idioma, String director) {
        MaterialVideo unVideo= new MaterialVideo(signatura, fechaCompra,restringido,tema,formato,duracion,idioma,director);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(unVideo.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfVideo.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void guardarMaterialAudio(String signatura, LocalDate fechaCompra, boolean restringido, String tema, FormatoAudio formato, String duracion, String idioma) {
        MaterialAudio unAudio = new MaterialAudio(signatura,fechaCompra,restringido,tema,formato,duracion,idioma);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(unAudio.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfAudio.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarOtroMaterial(String signatura, LocalDate fechaCompra, boolean restringido, String tema, String descripcion) {
        OtroMaterial otro = new OtroMaterial(signatura,fechaCompra,restringido,tema,descripcion);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(otro.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfOtro.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //--SECCION DE LISTADO DE MATERIALES--
    public ArrayList<Cliente> listarClientes(){
        ArrayList<Cliente> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfCliente.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Cliente(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<MaterialVideo> listarMaterialesVideo(){
        ArrayList<MaterialVideo> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfVideo.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new MaterialVideo(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<MaterialAudio> listarMaterialesAudio(){
        ArrayList<MaterialAudio> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfAudio.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new MaterialAudio(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<OtroMaterial> listarOtrosMateriales(){
        ArrayList<OtroMaterial> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfOtro.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new OtroMaterial(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
