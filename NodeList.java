public class NodeList {
    private Node head; // Head of the node list

    public NodeList() {
        this.head = null;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNextNode();
        }
        return count;
    }

    public void add(int num) {
        Node newNode = new Node(num, null);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.nextNode = newNode;
        }
    }

    public boolean remove(int num) {
        if (head == null) {
            return false;
        }

        if (head.getNum() == num) {
            head = head.getNextNode();
            return true;
        }

        Node current = head;
        while (current.getNextNode() != null) {
            if (current.getNextNode().getNum() == num) {
                current.nextNode = current.getNextNode().getNextNode();
                return true;
            }
            current = current.getNextNode();
        }

        return false;
    }

    public boolean removeAll(int num) {
        boolean removed = false;

        while (remove(num)) {
            removed = true;
        }

        return removed;
    }

    public boolean find(int num) {
        Node current = head;
        while (current != null) {
            if (current.getNum() == num) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    public int findAll(int num) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.getNum() == num) {
                count++;
            }
            current = current.getNextNode();
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("NodeList: [");
        Node current = head;
        while (current != null) {
            result.append(current.getNum());
            if (current.getNextNode() != null) {
                result.append(", ");
            }
            current = current.getNextNode();
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        NodeList nodeList = new NodeList();
        nodeList.add(11);
        nodeList.add(34);
        nodeList.add(65);
        System.out.println("NodeList: " + nodeList);
        System.out.println("Size: " + nodeList.size());
        System.out.println("Removing 34: " + nodeList.remove(34));
        System.out.println("NodeList after removal: " + nodeList);
        System.out.println("Size: " + nodeList.size());
        System.out.println("Finding 11: " + nodeList.find(11));
        System.out.println("Finding 65: " + nodeList.find(65));
        nodeList.add(65);
        nodeList.add(65);
        System.out.println("NodeList after adding duplicates: " + nodeList);
        System.out.println("Removing all 65: " + nodeList.removeAll(65));
        System.out.println("NodeList after removing all 65: " + nodeList);
    }
}
