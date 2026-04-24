lista_productos = []

def agregar_producto():
    producto = input("Ingrese el nombre del producto: ")
    
    if producto.strip() == "":
        print("Error: No puede ingresar un nombre vacío.")
    else:
        lista_productos.append(producto)
        print("Producto agregado correctamente.")

def mostrar_productos():
    if len(lista_productos) == 0:
        print("No hay productos registrados.")
    else:
        print("\nLista de productos:")
        for i, producto in enumerate(lista_productos, 1):
            print(f"{i}. {producto}")

# Función principal
def menu():
    opcion = 0

    while opcion != 3:
        print("\n--- Menú de Productos ---")
        print("1. Agregar producto")
        print("2. Mostrar productos")
        print("3. Salir")

        opcion = int(input("Seleccione una opción: "))

        if opcion == 1:
            agregar_producto()
        elif opcion == 2:
            mostrar_productos()
        elif opcion == 3:
            print("Saliendo del programa...")
        else:
            print("Opción inválida.")
            
menu()