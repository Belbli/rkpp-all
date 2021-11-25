package com.github.belbli.laba9.client;

import java.io.BufferedReader;
import java.io.IOException;

public class ClientMessageListener implements Runnable {
    private BufferedReader reader;

    public ClientMessageListener(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void run() {
        while (true) {
            String receiveMessage;
            try {
                if ((receiveMessage = reader.readLine()) != null) //receive from server
                {
                    System.out.println(receiveMessage); // displaying at DOS prompt
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
