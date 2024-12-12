# Programa cargado en memoria
programa = {
    0: "cargar 1, 5",
    1: "cargar 2, 10",
    2: "sumar 1, 2, 3",
    3: "imprimir 3"
}

# Espacio de memoria para variables
variables = {
    1: 0,  # Variable 1
    2: 0,  # Variable 2
    3: 0   # Variable 3 (resultado)
}

# Lista de instrucciones a ejecutar
instrucciones = list(programa.values())

# Ciclo para ejecutar las instrucciones
for instruccion in instrucciones:
    if instruccion.startswith("cargar"):
        _, var, valor = instruccion.split(" ")
        var = int(var.strip(","))
        valor = int(valor)
        variables[var] = valor
    elif instruccion.startswith("sumar"):
        _, var1, var2, var3 = instruccion.split(" ")
        var1 = int(var1.strip(","))
        var2 = int(var2.strip(","))
        var3 = int(var3)
        variables[var3] = variables[var1] + variables[var2]
    elif instruccion.startswith("imprimir"):
        _, var = instruccion.split(" ")
        var = int(var)
        print(f"Variable {var}: {variables[var]}")

# Mostrar el estado final de las variables
print("Estado final de las variables:", variables)
