# --MULTITHREADED--CHAT--APPLICATION
his project is a simple multithreaded chat application built with Java sockets. It demonstrates how to build a client-server architecture where the server can handle multiple clients simultaneously using threads.  Each client connects to the server, sends messages, and receives broadcasts of messages from other clients in real time. 
# Multi-Threaded Chat Application in Java

## 📌 Overview

A simple multi-threaded client-server chat application in **Java** using **sockets** and **threads**. The server accepts multiple client connections and broadcasts messages to all connected clients.

---

## 📂 Files

- `ChatServer.java` — handles multiple clients using threads.
- `ChatClient.java` — connects to server, sends and receives messages.

---

## 🚀 How to Run

1. Compile:
    ```bash
    javac ChatServer.java ChatClient.java
    ```

2. Start the server:
    ```bash
    java ChatServer
    ```

3. Start one or more clients:
    ```bash
    java ChatClient
    ```

4. Type messages in clients — see them broadcast to others!

---

## ✅ Features

- Multi-client support with threads.
- Simple broadcast mechanism.
- Clean shutdown on disconnect.
- Console-based, easy to test.

---

## 🔑 Requirements

- Java 8 or above.
- VS Code with Java Extension Pack.

---

## 📜 License

MIT License — free to use and extend.

---

**Happy chatting! 🚀**
