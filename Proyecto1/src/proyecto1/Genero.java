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
public class Genero {
    
    private String cveGenero;
    private String nombre;
    private char tipomedio;

    public Genero() {
    }
    public Genero(String cveGenero, String nombre, char tipomedio) {
        this.cveGenero = cveGenero;
        this.nombre = nombre;
        this.tipomedio = tipomedio;
}
    public String getCveGenero() {
        return cveGenero;
    }

    public void setCveGenero(String cveGenero) {
        this.cveGenero = cveGenero;
    }
    
    public Genero(String cveGenero) {
        this(cveGenero, null, ' ');
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipomedio() {
        return tipomedio;
    }

    public void setTipomedio(char tipomedio) {
        this.tipomedio = tipomedio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.cveGenero);
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + this.tipomedio;
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
        final Genero other = (Genero) obj;
        if (!Objects.equals(this.cveGenero, other.cveGenero)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return this.tipomedio == other.tipomedio;
    }

    @Override
    public String toString() {
        return "Genero{" + "cveGenero=" + cveGenero + ", nombre=" + nombre + ", tipomedio=" + tipomedio + '}';
    }
    
}
