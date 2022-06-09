package Assignment8;

public class Multi_Threading {
    /*
    * 1- Compare process vs thread. Why we should use thread?
    * Thread is small portion of process and that's why we call that light-weight process. It is basic unit of CPU Utilization.
    * Each program associate 1 or more processes and each process may execute 1 or more Threads(Traditional Thread and multiple Thread.
    * different between Process and Thread:
    * context switch is more heavy in process than Thread.
    * process don't share memory but Thread can share memory with peer memory
    * more time for communication between processes but let time between Threads
    * If process locked the other processes can execute but if a Thread block the peer Threads will block as well.
    * processes are independent but Threads are dependent of each other
    * Processes get more time for creation and termination but threads less time.
    * We use Thread because (Multi-Thread) to perform more than one task at a time.
    *
    * 2- How  do you implement thread and when to use what approach?
    * There is 2 main way: first is Extend Thread Class and second is using implement Runnable Interface.
    * If we need to extend another class or subclass we better use Implement Runnable Interface instead of extend Thread.
    *
    * 3- What is the difference between start() vs run()? Can we call run() method of a thread class?
    * In Start() method the threads can implement at the same time but in run() method the threads
    * should implement one by one, when the first thread implementing the other should wait for that and implement step by step.
    *
    * 4- Compare wait() vs sleep():
    * Wait() method release the lock but Sleep method doesn't.
    * wait() is the method of object class but the Sleep() is java.lang.thread.
    * Wait() should be notified by notify() or notifyAll() method but SLeep() is complete after a specific time.
    * Wait() is non static method but sleep() is a static method.
    *
    * 5- with 3 method, 2 to 3 threads can communicate with each other: wait(), notify() and notifyAll()
    * */
}
