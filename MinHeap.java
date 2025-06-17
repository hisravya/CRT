import java.util.ArrayList;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Swap helper method
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Insert a new value into the heap
    public void insert(int val) {
        heap.add(val); // Add to end
        int i = heap.size() - 1;

        // Heapify up
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) < heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    // Print all heap elements
    public void printHeap() {
        System.out.println("MinHeap Elements:");
        for (int val : heap) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        MinHeap mh = new MinHeap();
        mh.insert(10);
        mh.insert(5);
        mh.insert(20);
        mh.insert(3);
        mh.insert(15);

        mh.printHeap();
    }
}
