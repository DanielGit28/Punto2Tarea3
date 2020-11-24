package cr.ac.ucenfotec.Tarea3.controlador;

import cr.ac.ucenfotec.Tarea3.gestor.Gestor;
import cr.ac.ucenfotec.Tarea3.ui.UI;

import java.time.LocalDate;
import java.util.List;

public class Controlador {
    private UI ui = new UI();

    //private MaterialGestor gestor = new MaterialGestor();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma(){
        int opcion = 0;
        do {
            ui.mostrarMenu();
            opcion = ui.leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 4);
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion){
            case 1:
                crearCliente();
                break;
            case 2:
                ejecutarAbrirCuenta();
                break;
            case 3:
                ejecutarMovimiento();
                break;
            case 4:
                break;
        }

    }

    //----SECCION DE MATERIALES----

    //--SECCION DE CREACION DE MATERIALES--
    public void ejecutarAbrirCuenta(){
        int opcion = 0;
        do {
            ui.mostrarMenuAbrirCuenta();
            opcion = ui.leerOpcion();
            ejecutarOpcionAbrirCuenta(opcion);
        } while (opcion != 4);
    }

    private void ejecutarOpcionAbrirCuenta(int opcion) {
        switch (opcion){
            case 1:
                crearCuentaCorriente();
                break;
            case 2:
                crearCuentaAhorro();
                break;
            case 3:
                crearCuentaAhorroProgramado();
                break;
            case 4:
                break;
        }

    }
    private void crearCliente() {
        ui.imprimirMensaje("Nombre: ");
        String nombre = ui.leerTexto();
        ui.imprimirMensaje("Identificación: ");
        String id = ui.leerTexto();
        ui.imprimirMensaje("Dirección: ");
        String direccion = ui.leerTexto();

    }
    public boolean verificacionSignatura(String signatura) {
        boolean estado = false;
        List<MaterialTexto> textos = gestor.listarMaterialesTexto();
        for (MaterialTexto texto: textos) {
            if(texto.getSignatura().equals(signatura)) {
                estado = true;
                System.out.println("Texto sig repetida");
            }
        }
        List<MaterialAudio> audios = gestor.listarMaterialesAudio();
        for (MaterialAudio audio: audios) {
            if(audio.getSignatura().equals(signatura)) {
                estado = true;
            }
        }
        List<MaterialVideo> videos = gestor.listarMaterialesVideo();
        for (MaterialVideo video: videos) {
            if(video.getSignatura().equals(signatura)) {
                estado = true;
            }
        }
        List<OtroMaterial> otros = gestor.listarOtrosMateriales();
        for (OtroMaterial otro: otros) {
            if(otro.getSignatura().equals(signatura)) {
                estado = true;
            }
        }
        return estado;
    }

}
