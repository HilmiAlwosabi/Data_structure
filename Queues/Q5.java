/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queues;
import java.util.LinkedList;
import ;
public class Q5 {
    private LinkedList<Process> queue;
    private int timeQuantum;

    public Q5(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        this.queue = new LinkedList<>();
    }

    public void addProcess(Process process) {
        queue.add(process);
    }

    public void run() {
        while (!queue.isEmpty()) {
            Process process = queue.remove();
            int timeRemaining = process.getTimeRemaining();
            if (timeRemaining > timeQuantum) {
                process.setTimeRemaining(timeRemaining - timeQuantum);
                queue.add(process);
            } else {
                process.run(timeRemaining);
            }
        }
    }
}
