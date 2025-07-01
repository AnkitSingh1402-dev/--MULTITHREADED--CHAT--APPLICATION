import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 1234;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT)) {
            System.out.println("Connected to the chat server");

            new Thread(new ReadHandler(socket)).start();
            new Thread(new WriteHandler(socket)).start();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static class ReadHandler implements Runnable {
        private Socket socket;

        public ReadHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Server: " + message);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    static class WriteHandler implements Runnable {
        private Socket socket;

        public WriteHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try (
                BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
            ) {
                String input;
                while ((input = console.readLine()) != null) {
                    out.println(input);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

