def materias():
    
    cantidad_cursos = int(input("¿Cuántos cursos se desea registrar?: "))
    
    lista_cursos = []  # Lista vacía donde se guardarán los cursos
    
    for i in range(cantidad_cursos):
        nombre_curso = input(f"Ingrese el nombre del curso {i + 1}: ")
        lista_cursos.append(nombre_curso)
    
    # -------- ORDENAMIENTO BURBUJA --------
    
    # Recorremos toda la lista
    for i in range(len(lista_cursos)):
        
        # Comparar elementos uno por uno
        for j in range(0, len(lista_cursos) - i - 1):
            
            # Si el curso actual es mayor al siguiente
            if lista_cursos[j] > lista_cursos[j + 1]:
                
                # Intercambiamos los valores
                temporal = lista_cursos[j]
                lista_cursos[j] = lista_cursos[j + 1]
                lista_cursos[j + 1] = temporal
    
    print("\nCursos ordenados alfabéticamente:")
    for curso in lista_cursos:
        print(curso)

materias()