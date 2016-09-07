/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Objects;

/**
 *
 * @author Asus
 */
public class Medio {
    
    protected String clave;
    protected String titulo;
    protected String genero;
    protected int duracion;
    protected int fecha;
    

    public Medio() {
    }

    public Medio (String clave, String titulo, String genero, int duracion, int fecha){
        
        this.clave = clave;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.fecha = fecha;
        
        
    }
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.clave);
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.genero);
        hash = 89 * hash + this.duracion;
        hash = 89 * hash + this.fecha;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medio other = (Medio) obj;
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (this.duracion != other.duracion) {
            return false;
        }
        return this.fecha == other.fecha;
    }

    @Override
    public String toString() {
        return "Medio{" + "clave=" + clave + ", titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", fecha=" + fecha + '}';
    }
    
}
