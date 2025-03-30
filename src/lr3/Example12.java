package lr3;

public class Example12 {
    class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    class LinkedList {
        private Node head;

        public LinkedList() {
            this.head = null;
        }

        // Ввод с головы
        public void createHead(int[] elements) {
            head = null;
            for (int i = elements.length - 1; i >= 0; i--) {
                head = new Node(elements[i], head);
            }
        }

        // Ввод с хвоста
        public void createTail(int[] elements) {
            head = null;
            if (elements.length == 0) return;
            head = new Node(elements[0], null);
            Node current = head;
            for (int i = 1; i < elements.length; i++) {
                current.next = new Node(elements[i], null);
                current = current.next;
            }
        }

        // Преобразование в строку
        public String toString() {
            StringBuilder result = new StringBuilder();
            Node current = head;
            while (current != null) {
                result.append(current.value).append(" -> ");
                current = current.next;
            }
            return result.length() > 0 ? result.substring(0, result.length() - 4) : "";
        }

        // Добавление элемента в начало
        public void AddFirst(int value) {
            head = new Node(value, head);
        }

        // Добавление элемента в конец
        public void AddLast(int value) {
            if (head == null) {
                head = new Node(value, null);
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value, null);
        }

        // Вставка элемента с указанным номером
        public void Insert(int index, int value) {
            if (index == 0) {
                AddFirst(value);
                return;
            }
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) return;
                current = current.next;
            }
            if (current != null) {
                current.next = new Node(value, current.next);
            }
        }

        // Удаление первого элемента
        public void RemoveFirst() {
            if (head != null) {
                head = head.next;
            }
        }

        // Удаление последнего элемента
        public void RemoveLast() {
            if (head == null) return;
            if (head.next == null) {
                head = null;
                return;
            }
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        // Удаление элемента с указанным номером
        public void Remove(int index) {
            if (index == 0) {
                RemoveFirst();
                return;
            }
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null || current.next == null) return;
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }
    }
    public static void main(String[] args) {
        Example12 example = new Example12();
        LinkedList list = example.new LinkedList();

        list.createHead(new int[]{1, 2, 3, 4, 5});
        System.out.println("Создание списка с головы: " + list.toString());

        list.createTail(new int[]{6, 7, 8, 9, 10});
        System.out.println("Создание списка с хвоста " + list.toString());

        list.AddFirst(0);
        System.out.println("Добавление элементов(0): " + list.toString());
        list.AddLast(11);
        System.out.println("Добавление элементов(11): " + list.toString());

        list.Insert(3, 99);
        System.out.println("Вставка элемента(3, 99): " + list.toString());

        list.RemoveFirst();
        System.out.println("Удаление первого(): " + list.toString());
        list.RemoveLast();
        System.out.println("Удаление последнего(): " + list.toString());
        list.Remove(2);
        System.out.println("Удаление конкретного(2): " + list.toString());
    }
}

