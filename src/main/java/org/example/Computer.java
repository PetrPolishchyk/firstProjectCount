package org.example;

public class Computer {
    //Proc
    class Processor{
        private boolean isStart = false;

        public void start (){
            isStart = true;
            System.out.println("Start of processor = " + isStart);
        }
        public void shutdown (){
            isStart = false;
            System.out.println("Start of processor = " + isStart);
        }
    }
    //RAM
    class Ram{
        private boolean isStart = false;
        public void start (){
            isStart = true;
            System.out.println("Start of RAM = " + isStart);
        }
        public void shutdown (){
            isStart = false;
            System.out.println("Start of RAM = " + isStart);
        }
    }
    Processor i7 = new Processor();
    Ram transcend = new Ram();
}
