package com.roxket.clases;


import java.util.Objects;

public class Producto {
/*
    Cada producto consta de un nombre y un precio. Se debe crear una clase Producto que guarde la
    información especificada.
    Además, hay que sobrescribir los métodos equals y hashCode de la siguiente forma:
            • Dos productos se consideran iguales si tienen el mismo nombre y el mismo precio.
            • El hashCode se calcula sumando al precio del producto el código hash del nombre
            (recuerda que los Strings tienen el método hashCode ya implementado).
*/

    private String nombre;
    private double precio;

    public Producto(){}

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Producto p = (Producto) obj;
        return Objects.equals(this.getNombre(), p.getNombre()) && Objects.equals(this.getPrecio(), p.getPrecio());
        //p.getNombre().equals(this.getNombre()) ;
        //p.getPrecio().equals(this.getPrecio());
		
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		
//		Producto other = (Producto) obj;
//		if (nombre == null) {
//			if (other.precio != 0.0) {
//				return false;
//			}
//		} else if (!nombre.equals(other.nombre)) {
//			return false;
//		}
//		if (nombre == null) {
//			if (other.nombre != null) {
//				return false;
//			}
//		} else if (!nombre.equals(other.nombre)) {
//			return false;
//		}
//		return true;

    }

    @Override
    public int hashCode() {
        int precioHash = Double.hashCode(this.precio);
        int nombreHash = this.nombre.hashCode();
        int result = precioHash + nombreHash;
        return result;
    }
}
