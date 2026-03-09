# 📱 Proyecto Android – Lista de Tareas  
Aplicaciones Móviles | Kotlin + Jetpack Compose + Clean Architecture

## 📌 Objetivo de la actividad

Crear un proyecto Android utilizando **Android Studio**, **Kotlin** y **Jetpack Compose**, organizado con una estructura básica de **Arquitectura Limpia (Clean Architecture)**, ejecutar la primera pantalla y conectar el proyecto con **GitHub** para control de versiones.

---

## 🎯 Propósito del proyecto

Desarrollar la aplicación **Lista de Tareas**, la cual servirá como base para las siguientes prácticas del curso.

En esta actividad se realizará:

- Creación del proyecto en Android Studio
- Configuración con Jetpack Compose
- Organización de paquetes con arquitectura limpia
- Creación de la primera pantalla
- Ejecución en emulador o dispositivo físico
- Inicialización de repositorio Git
- Conexión con GitHub
- Primer commit del proyecto

---

## 🛠 Tecnologías utilizadas

- Kotlin
- Jetpack Compose
- Android Studio
- Gradle Kotlin DSL
- Git
- GitHub

---

## 🧱 Arquitectura utilizada

Se utilizará una estructura básica basada en **Clean Architecture**:
com.ejemplo.listatareas
│
├── data
│ └── repository
│
├── domain
│ └── model
│ └── usecase
│
├── ui
│ └── screen
│ └── components
│ └── theme
│
└── MainActivity.kt

Descripción:

| Paquete | Descripción |
|---------|------------|
| data | Acceso a datos, repositorios, API, BD |
| domain | Modelos y casos de uso |
| ui | Pantallas y componentes Compose |
| theme | Colores, tipografía, estilos |
| MainActivity | Punto de entrada |

---

## ⚙️ Paso 1 – Crear proyecto en Android Studio

1. Abrir Android Studio
2. Seleccionar **New Project**
3. Elegir:

4. Configurar:
   
Name: ListaTareas
Language: Kotlin
Minimum SDK: 24 o superior
Use Jetpack Compose: ✔

6. Finalizar

---

## ⚙️ Paso 2 – Crear paquetes de arquitectura limpia

Dentro de `java/com.ues.listatareas`

Crear:
data
domain
ui

Dentro de `ui` crear:
screen
components
theme


---

## ⚙️ Paso 3 – Crear primera pantalla en Compose

Ejemplo simple:

```
@Composable
fun HomeScreen() {
    Text(text = "Hola Lista de Tareas")
}
```
En MainActivity.kt
```
setContent {
    HomeScreen()
}
```
Ejecutar la app.





