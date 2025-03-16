# 🎮 Tic Tac Toe - Java

¡Bienvenide a **Tic Tac Toe**! Un juego clásico de tres en raya desarrollado en **Java** para jugar en la terminal. 🚀
<p align="center">
  <img src="https://github.com/user-attachments/assets/88d16dfe-a884-4a84-9a60-11b79afa1c97" alt="Tic Tac Toe Demo" width="500">
</p>

## 📌 Descripción
Este proyecto implementa el popular juego **Tic Tac Toe** (Tres en raya) en la terminal, permitiendo que dos jugadores se turnen para colocar sus símbolos en un tablero de 3x3 hasta que haya un ganador o se declare un empate.

## 🛠️ Tecnologías Utilizadas
- **Versión de Java:** OpenJDK 21.0.6
- **Scanner** para entrada de datos
- ANSI Colors para mejorar la visualización en consola

## 📜 Reglas del Juego
1. **Dos jugadores** se turnan para ingresar su jugada (`X` y `O`).
2. Eligen una **fila y una columna** separadas por un tabulador.
3. El sistema valida el movimiento:
   - Si la casilla está ocupada, se pedirá una nueva entrada.
   - Si la casilla está libre, se actualizará el tablero.
4. A partir del **quinto turno**, el sistema verifica si hay un ganador.
5. Si se completan los **9 turnos** sin un ganador, el juego termina en **empate**.

## 📷 Diagrama de Flujo
Aquí tienes un **diagrama de flujo** del funcionamiento del juego:

(https://miro.com/app/board/uXjVIQIlLYY=/)

## 🚀 Instalación y Ejecución

### 1 Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/tic-tac-toe-java.git
cd tic-tac-toe-java
```
### 2 Compilar el Código
```java 
javac TicTacToe.java
```
### 3 Ejecutar el Juego
```java
java TicTacToe
```

## 🏆 Funcionalidades Implementadas
✅ Creación de tablero vacío

✅ Alternancia entre jugadores

✅ Validación de movimientos

✅ Detección de ganador o empate

✅ Mensajes en colores ANSI

## 🔧 Mejoras Futuras
Implementar una interfaz gráfica

Agregar un modo contra la computadora 

Permitir reiniciar el juego sin cerrar la terminal

## 🤝 Contribución
¡Las contribuciones son bienvenidas! Para colaborar:

1. Haz un fork del repositorio.

2. Crea una rama
(git checkout -b feature-nueva).

3. Sube tus cambios (git commit -m "Agregada nueva funcionalidad" && git push origin feature-nueva).

4. Abre un Pull Request.

## 📜 Licencia
Este proyecto está bajo la [Licencia de producción de pares feministas 2F2](https://labekka.red/licencia-f2f/).  
<br>
<img src="https://github.com/user-attachments/assets/90acbc07-7ba9-45e1-867b-6d284f4e6288" alt="f2f-license" width="150">
<br>
Puedes usarlo, modificarlo y compartirlo libremente. 🎉

Hecho con ❤️ por Kat Leverton y Larissa Saud. 

## ☎️ Contactos

<table style="border-collapse: collapse; border: none;">
  <tr>
    <td align="center" style="border: none;">
      <img src="https://github.com/user-attachments/assets/6b926678-a291-45ee-ab90-ca1dbfd3dfd3" alt="kat-avatar" width="80">
      <br><b>Kat Leverton</b>
      <br>
      <a href="https://www.linkedin.com/in/kat-leverton/">LinkedIn</a> |
      <a href="https://github.com/Kat-lev/">GitHub</a>
    </td>
    <td align="center" style="border: none;">
      <img src="https://github.com/user-attachments/assets/89108af5-007e-428f-b199-692beac81cc6" alt="larissa-avatar" width="80">
      <br><b>Larissa Saud</b>
      <br>
      <a href="https://www.linkedin.com/in/larissasaud/">LinkedIn</a> |
      <a href="https://github.com/Kat-lev/">GitHub</a>
    </td>
  </tr>
</table>
