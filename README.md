# Sistema de Reservas de Cine (Java)

Proyecto Java puro para practicar logica con matrices en consola.

## Objetivo
Simular una sala de cine y permitir buscar asientos consecutivos disponibles.

## Funcionalidades
- Generacion de sala de 5x8 asientos(por ahora estandar).
- Venta aleatoria inicial de asientos.
- Visualizacion de asientos libres (`L`) y ocupados (`O`).
- Busqueda de asientos consecutivos en una misma fila.
- Conteo de asientos libres por zona (VIP y normal).
- Calculo de porcentaje de ocupacion.

## Estructura
- `src/cine/Cine.java`: clase principal con toda la logica del ejercicio.

## Ejecutar
Desde la carpeta del proyecto:

```bash
javac -d out src/cine/Cine.java
java -cp out cine.Cine
```

## Estado
Version base para portafolio. La evolucion posterior (POO avanzada y Spring Boot) se puede construir a partir de este punto subiendo la evolucion de ese proyecto conforme va evolucionando.
