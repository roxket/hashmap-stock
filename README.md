Productos (HashMap) 
 
Crear un programa que simule el stock de productos de una tienda. 
Cada producto consta de un nombre y un precio. Se debe crear una clase Producto que guarde la información especificada. 
Además, hay que sobrescribir los métodos equals y hashCode de la siguiente forma:

• Dos productos se consideran iguales si tienen el mismo nombre y el mismo precio. 
• El hashCode se calcula sumando al precio del producto el código hash del nombre 
(recuerda que los Strings tienen el método hashCode ya implementado).

El programa principal debe hacer uso de un HashMap para almacenar la siguiente información: los productos serán la clave, y como valor pondremos el stock en la tienda (número entero). 
Implementar métodos para dar de alta productos, eliminar, modificar y borrar la lista de contactos. No hace falta que realices un menú, simplemente puedes escribir un main en el que se cree el HashMap, se añadan productos, se eliminen y se modifiquen. 
Haz algún ejemplo de operación con dos productos que el HashMap debe identificar como iguales. 
