
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class administrarusuarios {
    private ArrayList<usuarios> listausuarios = new ArrayList();
    private File archivo = null;

    public administrarusuarios(String path) {
        archivo=new File(path);
    }

    public ArrayList<usuarios> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(ArrayList<usuarios> listausuarios) {
        this.listausuarios = listausuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setusuario(usuarios a){
        listausuarios.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listausuarios = new ArrayList();
            usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (usuarios) objeto.readObject()) != null) {
                        listausuarios.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (usuarios t : listausuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
