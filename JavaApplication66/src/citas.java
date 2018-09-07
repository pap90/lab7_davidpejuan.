
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class citas {
    private Date fecha;
    private usuarios usuario;
    private String lugar;

    public citas() {
    }

    public citas(Date fecha, usuarios usuario, String lugar) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarios usuario) {
        this.usuario = usuario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
