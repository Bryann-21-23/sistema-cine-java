# 🎬 Sistema de Reservas de Cine (Java)

> Sistema de gestión de reservas para cines desarrollado como proyecto de aprendizaje en Java. Evoluciona desde programación procedural con matrices hasta POO y próximamente Spring Boot.


## 📋 Funcionalidades Actuales

### ✅ Versión 1.0 - Lógica con Matrices
- 🎭 Visualización interactiva de sala (5 filas × 8 columnas)
- 🎲 Generación aleatoria de ocupación (10-15 asientos)
- 🔍 Búsqueda inteligente de asientos consecutivos
- 🏆 Clasificación por zonas (VIP y Normal)
- 📊 Cálculo de porcentaje de ocupación en tiempo real
- ✔️ Validación robusta de entradas del usuario

---

## 🛠️ Stack Tecnológico

### Actual
- **Java SE 17**
- Matrices bidimensionales
- `ThreadLocalRandom` para simulación
- `Scanner` para I/O

### Próximamente
- POO (Clases: Asiento, Sala, Reserva, Cliente)
- Collections Framework (ArrayList, HashMap)
- Manejo de excepciones personalizadas
- Persistencia en archivos/BD
- Spring Boot + REST API

---

## 🚀 Instalación y Uso

### Prerrequisitos
```bash
java -version  # Java 11 o superior
```

### Clonar repositorio
```bash
git clone https://github.com/Bryann-21-23/sistema-cine-java.git
cd sistema-cine-java
```

### Compilar y ejecutar
```bash
# Compilar
javac src/cine/Cine.java

# Ejecutar
java src.cine.Cine
```

---

## 📸 Demo del Sistema
```
        PANTALLA
========================
      1 2 3 4 5 6 7 8
    A L L O L L O L L
    B O L L L O O L L
    C L O L L L L O L
    D L L L O L L L L
    E O L L L L O L L

    (L=Libre, O=Ocupado)

Luego de vender algunas entradas
Entradas vendidas: 12

¿Cuántos asientos consecutivos deseas? 3
✅ Tienes 3 asientos libres desde la posición: B2 hasta B4

--- DISPONIBILIDAD POR ZONA ---
🌟 Zona VIP (A-B):    8 asientos libres en total
👥 Zona Normal (C-E): 20 asientos libres en total

El porcentaje de asientos ocupados es: 30%
```

---

## 📦 Estructura del Proyecto
```
sistema-cine-java/
├── src/
│   └── cine/
│       ├── Cine.java                # ⭐ Sistema principal
│       ├── matrizNotas.java         # Ejercicio 1: Calificaciones
│       ├── gestorVentas.java        # Ejercicio 2: Ventas
│       └── calculadoraMatrices.java # Ejercicio 3: Operaciones
├── .gitignore
└── README.md
```

---

## 🎯 Roadmap de Desarrollo

### ✅ Fase 1: Fundamentos con Matrices (COMPLETADO)
- [x] Sistema funcional con arrays 2D
- [x] 4 ejercicios progresivos (notas, ventas, calculadora, cine)
- [x] Algoritmos de búsqueda y validación
- [x] Subido a GitHub con documentación

### 🔄 Fase 2: Refactorización POO (Semanas 1-2)
- [ ] Clase `Asiento` (estado, métodos, encapsulamiento)
- [ ] Clase `Sala` (gestión de matriz de asientos)
- [ ] Clase `Pelicula` con información del filme
- [ ] Clase `Funcion` (horarios, precios por zona)
- [ ] Clase `Reserva` y `Cliente`
- [ ] Herencia: `AsientoVIP` extends `Asiento`
- [ ] Interfaces: `Reservable`, `Cancelable`
- [ ] Collections: `ArrayList<Reserva>`, `HashMap<String, Cliente>`

### 🔜 Fase 3: Persistencia (Semana 3-4)
- [ ] Guardar reservas en CSV
- [ ] Cargar cartelera desde JSON
- [ ] Manejo de excepciones personalizadas
- [ ] Testing con JUnit 5

### 🔜 Fase 4: API REST - Spring Boot (Semanas 5-6)
- [ ] Configuración Spring Boot + JPA
- [ ] Endpoints RESTful (GET, POST, PUT, DELETE)
- [ ] Base de datos H2/PostgreSQL
- [ ] DTOs y validaciones
- [ ] Documentación con Swagger/OpenAPI
- [ ] Deploy en Render/Railway

---
## 📚 Aprendizajes Técnicos

Durante este proyecto, he aplicado:

| Concepto | Implementación |
|----------|----------------|
| **Matrices 2D** | Representación de sala de cine |
| **Algoritmos de búsqueda** | Encontrar N asientos consecutivos |
| **Validación de datos** | Input sanitization y edge cases |
| **Modularización** | Métodos reutilizables y cohesivos |
| **Generación aleatoria** | Simulación de ocupación con `ThreadLocalRandom` |
| **Separación de responsabilidades** | Cada método una tarea específica |

---

## 🏆 Ejercicios de Práctica Incluidos

| Archivo | Objetivo | Nivel |
|---------|----------|-------|
| `matrizNotas.java` | Recorrido básico, cálculo de promedios | ⭐ Básico |
| `gestorVentas.java` | Análisis por filas/columnas, métodos auxiliares | ⭐⭐ Intermedio |
| `calculadoraMatrices.java` | Suma, transpuesta, búsqueda de máximo | ⭐⭐⭐ Intermedio+ |
| `Cine.java` | Sistema completo con validaciones | ⭐⭐⭐⭐ Avanzado |

---

## 👨‍💻 Autor

**Bryann Barrenechea**

- 🐙 GitHub: [@Bryann-21-23](https://github.com/Bryann-21-23)
