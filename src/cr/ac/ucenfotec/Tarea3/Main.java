package cr.ac.ucenfotec.Tarea3;

import cr.ac.ucenfotec.Tarea3.controlador.Controlador;
import cr.ac.ucenfotec.Tarea3.gestor.Gestor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Controlador control = new Controlador();
	    control.ejecutarPrograma();
    }
}
