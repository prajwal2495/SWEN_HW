package session;

public class Main {
    public static void main(String[] args) {
        Heap heap = new ArrayHeap();

        heap.add(10);
        System.out.println(heap);
        heap.add(20);
        System.out.println(heap);
        heap.add(15);
        System.out.println(heap);
        heap.add(18);
        System.out.println(heap);
        heap.add(5);
        System.out.println(heap);
        heap.add(67);
        System.out.println(heap);
        heap.add(99);
        System.out.println(heap);
        heap.add(106);
        System.out.println(heap);
        heap.add(2);
        System.out.println(heap);
        heap.add(1);
        System.out.println(heap);

        heap.remove();
        System.out.println(heap);
    }
}
