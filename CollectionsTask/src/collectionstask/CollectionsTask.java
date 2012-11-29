/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstask;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class CollectionsTask {
    
    private static LinkedBlockingQueue<Integer> someInts = new LinkedBlockingQueue<Integer>();
    
    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }
    
    private static class Producer implements Runnable {
        
        private final Random RANDOM = new Random();
        
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Putting new int");
                    someInts.put(RANDOM.nextInt());
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                
            }
        }
    }
    
    private static class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Integer i = someInts.take();
                    System.out.println("Consumer retrieved " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                
            }
        }
    }
}
