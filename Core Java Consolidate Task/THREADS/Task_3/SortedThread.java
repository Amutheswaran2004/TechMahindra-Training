package THREADS.Task_3;

import java.util.Arrays;

class SortThread implements Runnable {
    int[] arr;
    int left;
    int right;

    public SortThread(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        Arrays.sort(arr, left, right+1);
    }
}

