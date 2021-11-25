package com.github.belbli.laba9.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static List<ClientHandler> clients = new ArrayList<>();
    private static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws Exception {
        ServerSocket listener = new ServerSocket(8800);

        while (true) {
            Socket client = listener.accept();
            ClientHandler clientHandler = new ClientHandler(client);
            clients.add(clientHandler);
            executorService.execute(clientHandler);
        }

    }

}

