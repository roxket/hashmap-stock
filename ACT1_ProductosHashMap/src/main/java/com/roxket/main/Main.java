package com.roxket.main;

import com.roxket.clases.Producto;

import java.util.HashMap;

public class Main {

/*  El programa principal debe hacer uso de un HashMap para almacenar la siguiente
    información: los productos serán la clave, y como valor pondremos el stock en la
    tienda (número entero). Implementar métodos para dar de alta productos, eliminar,
    modificar y borrar la lista de productos. No hace falta que realices un menú,
    simplemente puedes escribir un main en el que se cree el HashMap, se añadan
    productos, se eliminen y se modifiquen. Haz algún ejemplo de operación con dos
    productos que el HashMap debe identificar como iguales.
*/

        public static void main(String [] args){

            //Iniciando HashMap
            HashMap<Producto, Integer> listaProductos = new HashMap<>();

            //Creando productos
            Producto prod1 = new Producto("Alfa Romeo 4C", 50000.54);
            Producto prod2 = new Producto ("Alfa Romeo Spider", 15000.50);
            Producto prod3 = new Producto ("Alfa Romeo 147 GTA", 18000.50);
            Producto prod4 = new Producto ("Alfa Romeo 147 GTA", 18000.50);

            //Introduciendo producto en la lista
                System.out.println("==============================================");
            crearProducto(listaProductos, prod1, 3);
                System.out.println("==============================================");
            crearProducto(listaProductos, prod2, 4);
                System.out.println("==============================================");
            //Test de crear sobrescritura
            crearProducto(listaProductos, prod1, 4);
                System.out.println("==============================================");
            //Test de crear producto duplicado
            crearProducto(listaProductos, prod2, 4);
                System.out.println("==============================================");
            //Modificar producto
            modificarProducto(listaProductos, prod2, prod3, 2);
                System.out.println("==============================================");
            //Test listado con metodos del Hash
            //mostrarProductosMetodoHash(listaProductos);
            //System.out.println("==============================================");
            //Mostrar listado con bucle foreach
            mostrarProductosFor(listaProductos);
                System.out.println("==============================================");
            //Comprobar método equals
            comprobarEquals(prod3, prod4);
                System.out.println("==============================================");
             //Eliminar un producto
            eliminarProducto(listaProductos, prod3);
                System.out.println("==============================================");
             //Eliminar listado completo
            eliminarListaProductos(listaProductos);
                System.out.println("==============================================");

        }

        //Mostrar productos
        public static void mostrarProductosFor(HashMap<Producto, Integer> listaProductos){
            //Test foreach simple
            int index = 1;
            for(Producto clave : listaProductos.keySet()){
                System.out.println("Producto " + index + ":"
                        + "\n Nombre: "  + clave.getNombre()
                        + "\n Precio: "  + clave.getPrecio()
                        + "\n En stock: " + listaProductos.get(clave)
                );
                index++;
            }

            //Test foreach map.entry
         /*
             for(Map.Entry<Producto, Integer> clave : listaProductos.keySet()){
                System.out.println("Clave: " + clave.getKey() + " Producto: " + clave.getValue());
            }


        //Test foreach  Stream - lambda
        listaProductos.forEach(
                (key, valor) -> System.out.println("Clave: " + key + " Valor: " + valor)
        );
        */
        }

        public static void mostrarProductosMetodoHash (HashMap<Producto, Integer> listaProductos){
            System.out.println(listaProductos.keySet());
            System.out.println("==============================================");
            System.out.println(listaProductos.entrySet());
            System.out.println("==============================================");
            System.out.println(listaProductos.values());
        }
        //Crear producto
        public static void crearProducto(HashMap< Producto, Integer> listaProductos, Producto clave, Integer stock){

            //Comprobar si el producto ya está introducido en el hashmap
            if (!listaProductos.containsKey(clave)){
                //Añadir producto
                listaProductos.put(clave,stock);
                System.out.println("Producto añadido correctamente.");
                System.out.println("Clave: " + clave + " Valor: " + stock);
            } else{
                System.out.println("Producto repetido.");
            }
        }

        //Eliminar producto
        public static void eliminarProducto(HashMap< Producto, Integer> listaProductos, Producto clave){
            //Buscar si el producto ya está introducido en el hashmap
            if(listaProductos.containsKey(clave)){
                //borrar producto
                listaProductos.remove(clave);
                System.out.println("Producto eliminado correctamente.");
            } else{
                System.out.println("Producto no encontrado.");
            }
        }

        //Modificar producto
        public static void modificarProducto(HashMap< Producto, Integer> listaProductos, Producto claveOld, Producto claveNew, Integer stock){
            //Buscar si el producto ya está introducido en el hashmap
            if(listaProductos.containsKey(claveOld)){
                //Eliminar producto old
                listaProductos.remove(claveOld);
                //Introducir producto new
                listaProductos.put(claveNew,stock);
                System.out.println("Producto editado correctamente.");
                System.out.println("Clave: " + claveNew + " Valor: " + stock);
            } else{
                System.out.println("Producto no encontrado.");
            }
        }

        //Borrar la lista de productos
        public static void eliminarListaProductos(HashMap<Producto, Integer> listaProductos){
            listaProductos.clear();
            System.out.println("Listado eliminado.");
        }

        public static void comprobarEquals(Producto prod1, Producto prod2){
            if(prod1.equals(prod2)){
                System.out.println("Productos iguales.");
            } else{
                System.out.println("Productos diferentes");
            }
        }
    }