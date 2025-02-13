package Thursday_13_02_2025.ListSample;

public class ListSample {
    public static void main(String[] args) {
        LinkedListSample thread_1=new LinkedListSample();
        VectorSample thread_2=new VectorSample();
        StackSample thread_3=new StackSample();
        thread_1.start();
        thread_2.start();
        thread_3.start();
    }
}
