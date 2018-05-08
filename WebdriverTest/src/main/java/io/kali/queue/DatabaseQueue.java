package io.kali.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class DatabaseQueue extends Thread {
    private LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>();

    public void queueData(String data) {
        queue.add(data);
    }

    public void run() {
        while (true) {
            try {
				String data = queue.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            // write data to database
        }
    }
}