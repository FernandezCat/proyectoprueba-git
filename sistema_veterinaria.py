
lista_mascotas = []

def registrar_mascota(lista_mascotas):
    nombre_mascota = input("Ingrese el nombre de la mascota: ")
    tipo_mascota = input("Ingrese el tipo de mascota (Perro, Gato, etc.): ")
    nombre_dueño = input("Ingrese el nombre del dueño: ")

    datos_mascota = {
        "nombre": nombre_mascota,
        "tipo": tipo_mascota,
        "dueño": nombre_dueño
    }

    lista_mascotas.append(datos_mascota)
    print("Mascota registrada correctamente.")

def mostrar_mascotas(lista_mascotas):
    if len(lista_mascotas) == 0:
        print("No hay mascotas registradas.")
    else:
        print("\n--- Lista de Mascotas ---")

        for i in range(len(lista_mascotas)):
            print(f"Mascota {i + 1}")
            print("Nombre:", lista_mascotas[i]["nombre"])
            print("Tipo:", lista_mascotas[i]["tipo"])
            print("Dueño:", lista_mascotas[i]["dueño"])
            print("-----------------------")

def eliminar_mascota(lista_mascotas):
    if len(lista_mascotas) == 0:
        print("No hay mascotas registradas.")
    else:
        nombre_eliminar = input("Ingrese el nombre de la mascota a eliminar: ")
        mascota_eliminada = False

        for mascota in lista_mascotas:
            if mascota["nombre"].lower() == nombre_eliminar.lower():
                lista_mascotas.remove(mascota)
                mascota_eliminada = True
                print("Mascota eliminada correctamente.")
                break

        if mascota_eliminada == False:
            print("Mascota no encontrada.")

def mostrar_menu():
    print("\n===== Veterinaria =====")
    print("1. Registrar mascota")
    print("2. Mostrar mascotas registradas")
    print("3. Eliminar mascota")
    print("4. Salir")

while True:
    mostrar_menu()
    opcion_menu = input("Ingrese una opción: ")

    if opcion_menu == "1":
        registrar_mascota(lista_mascotas)
    elif opcion_menu == "2":
        mostrar_mascotas(lista_mascotas)
    elif opcion_menu == "3":
        eliminar_mascota(lista_mascotas)
    elif opcion_menu == "4":
        print("Total de mascotas registradas:", len(lista_mascotas))
        print("Saliendo del sistema...")
        break
    else:
        print("Opción inválida. Intente nuevamente.")