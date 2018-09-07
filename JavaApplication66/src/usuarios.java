
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class usuarios implements Serializable{

    private String nombre;
    private int edad;
    private String sexo;
    private String usuario;
    private String contraseña;
    private ArrayList<String> intereses = new ArrayList();
    private ArrayList<usuarios> amigos = new ArrayList();
    private ArrayList<usuarios> amigosinteresados = new ArrayList();
    private String descripcion;
    private Icon imagen;
    private ArrayList<mensajes> mensajes = new ArrayList();
    private ArrayList<usuarios> solicitudes = new ArrayList();
    private ArrayList<usuarios> bloqueados = new ArrayList();
    private ArrayList<citas> calendario = new ArrayList();
    private boolean premium;

    public usuarios() {
    }

    public usuarios(String nombre, int edad, String sexo, String usuario, String contraseña, String descripcion, Icon imagen, boolean premium) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.premium = premium;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<String> intereses) {
        this.intereses = intereses;
    }

    public ArrayList<usuarios> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<usuarios> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<usuarios> getAmigosinteresados() {
        return amigosinteresados;
    }

    public void setAmigosinteresados(ArrayList<usuarios> amigosinteresados) {
        this.amigosinteresados = amigosinteresados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public ArrayList<mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<usuarios> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<usuarios> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList<usuarios> getBloqueados() {
        return bloqueados;
    }

    public void setBloqueados(ArrayList<usuarios> bloqueados) {
        this.bloqueados = bloqueados;
    }

    public ArrayList<citas> getCalendario() {
        return calendario;
    }

    public void setCalendario(ArrayList<citas> calendario) {
        this.calendario = calendario;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
