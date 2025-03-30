package lr3.Example11;

public class Main {
    public static void main(String[] args) {
        // Создание списка с головы
        Node head1 = null;
        for (int i = 9; i >= 0; i--) {
            head1 = new Node(i, head1);
        }

        Node ref1 = head1;
        System.out.println("Список с головы:");
        while (ref1!= null) {
            System.out.print(" " + ref1.value);
            ref1 = ref1.next;
        }

        // Создание списка с хвоста
        Node head2 = null;
        Node tail = null;
        for (int i = 0; i <= 9; i++) {
            Node node = new Node(i);
            if (head2 == null) {
                head2 = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        Node ref2 = head2;
        System.out.println("\nСписок с хвоста:");
        while (ref2!= null) {
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}

