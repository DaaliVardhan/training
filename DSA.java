
// class Stack {

//     private int size;
//     private int top = -1;
//     private int[] stack;

//     boolean empty() {
//         return this.top == -1 ? true : false;
//     }

//     Stack(int n) {
//         this.size = n;
//         this.stack = new int[this.size];
//     }

//     public void push(int n) {
//         if (this.size == this.top + 1) {
//             System.out.println("Stack overflow");
//             return;
//         }
//         this.stack[++this.top] = n;
//     }

//     public int pop() {
//         if (this.top < 0 || this.top >= this.size)
//             return -1;
//         return this.stack[this.top--];
//     }

//     public int peek() {
//         if (this.top < 0 || this.top >= this.size)
//             return -1;
//         return this.stack[this.top];
//     }

//     public void print() {
//         if (this.top < 0 || this.top >= this.size) {
//             System.out.println("Empty stack");
//             return;
//         }
//         ;

//         int temp = this.top;
//         while (temp >= 0) {
//             System.out.print(this.stack[temp--] + " ");
//         }
//         System.out.println();
//     }

//     public int size() {
//         return this.top + 1;
//     }

// }

// class Queue {
//     private int size;
//     private int rear;
//     private int[] queue;

//     Queue(int n) {
//         this.size = n;
//         this.queue = new int[this.size];
//         this.rear = -1;
//     }

//     public void enqueue(int n) {
//         if (this.rear + 1 >= this.size) {
//             System.out.println("Queue overflow");
//             return;
//         }
//         this.queue[++rear] = n;
//     }

//     public int dequeue() {
//         if (this.empty()) {
//             System.out.println("Empty Queue");
//             return -1;
//         }
//         int temp = this.queue[0];
//         for (int i = 1; i <= this.rear; i++) {
//             this.queue[i - 1] = this.queue[i];
//         }
//         this.rear--;
//         return temp;

//     }

//     public int front() {
//         if (!this.empty())
//             return this.queue[0];
//         return -1;
//     }

//     public int size() {
//         if (!this.empty())
//             return this.rear + 1;
//         return -1;
//     }

//     public boolean empty() {
//         if (this.rear < 0 || this.rear >= this.size)
//             return true;
//         return false;
//     }

//     public void print() {
//         if (this.empty())
//             return;
//         for (int i = 0; i <= this.rear; i++) {
//             System.out.print(this.queue[i] + " ");
//         }
//         System.out.println();
//     }
// }

// class ListNode {
//     int data;
//     ListNode next;

//     ListNode(int n) {
//         this.data = n;
//         this.next = null;
//     }
// }

// class SingleLinkedList {

//     ListNode head;

//     SingleLinkedList() {
//         this.head = null;
//     }

//     public boolean empty() {
//         if (this.head == null)
//             return true;
//         return false;
//     }

//     public void insert(int n) {
//         if (this.head == null) {
//             this.head = new ListNode(n);
//             return;
//         }
//         ListNode temp = new ListNode(n);
//         temp.next = this.head;
//         this.head = temp;
//         return;
//     }

//     public void delete() {
//         if (this.head == null)
//             return;
//         this.head = head.next;
//     }

//     public void print() {
//         ListNode temp = this.head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

// }

// class DListNode {
//     int data;
//     DListNode prev;
//     DListNode next;

//     DListNode(int data) {
//         this.data = data;
//         this.prev = null;
//         this.next = null;
//     }
// }

// class DoubleLinkedList {
//     private DListNode head;

//     DoubleLinkedList() {
//         this.head = null;
//     }

//     void insert(int data) {
//         if (this.head == null) {
//             this.head = new DListNode(data);
//             return;
//         }
//         DListNode temp = new DListNode(data);
//         temp.next = head;
//         head.prev = temp;
//         head = temp;
//         return;
//     }

//     void delete() {
//         if (this.head == null)
//             return;
//         if (this.head.next != null) {
//             this.head.next.prev = null;
//         }
//         this.head = this.head.next;
//     }

//     void print() {
//         DListNode temp = this.head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

// }

// class TreeNode {
//     int data;
//     TreeNode left, right;

//     TreeNode(int n) {
//         this.data = n;
//         this.left = null;
//         this.right = null;
//     }
// }

// class StackUsingQueue {
//     int size;
//     Queue q1;
//     Queue q2;

//     StackUsingQueue(int n) {
//         this.q1 = new Queue(n);
//         this.q2 = new Queue(n);
//         this.size = n;
//     }

//     public void push(int n) {
//         if (this.q1.empty()) {
//             this.q1.enqueue(n);
//             while (!this.q2.empty()) {
//                 this.q1.enqueue(this.q2.dequeue());
//             }
//         } else {
//             this.q2.enqueue(n);
//             while (!this.q1.empty()) {
//                 this.q2.enqueue(this.q1.dequeue());
//             }
//         }
//     }

//     public int pop() {
//         if (this.q1.empty()) {
//             return this.q2.dequeue();
//         }
//         return this.q1.dequeue();

//     }

//     public int peek() {
//         if (this.q1.empty())
//             return this.q2.front();
//         return this.q1.front();
//     }

//     public boolean empty() {
//         if (this.q1.empty() && this.q2.empty())
//             return true;
//         return false;
//     }

//     public void print() {

//         if (!this.q1.empty()) {
//             this.q1.print();
//             return;
//         }
//         this.q2.print();
//     }
// }

// public class DSA {

//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void reverse(int[] arr, int i, int j) {
//         while (i < j)
//             swap(arr, i++, j--);
//     }

//     public static void main(String[] args) {

//         // int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
//         // int k = 4;

//         // for (int a : arr)
//         // System.out.print(a + " ");
//         // System.out.println();

//         // for (int i = 0; i < arr.length; i += k) {
//         // int j = i + k < arr.length ? i + k - 1 : arr.length - 1;
//         // reverse(arr, i, j);
//         // }

//         // for (int a : arr)
//         // System.out.print(a + " ");

//         // SingleLinkedList s= new SingleLinkedList();
//         // s.insert(10);
//         // s.insert(20);
//         // s.insert(30);
//         // s.insert(40);
//         // s.insert(50);
//         // s.print();
//         // s.delete();
//         // s.delete();
//         // s.print();

//         // DoubleLinkedList d = new DoubleLinkedList();
//         // d.insert(10);
//         // d.insert(20);
//         // d.insert(130);
//         // d.insert(140);
//         // d.insert(50);
//         // d.print();
//         // d.delete();
//         // d.delete();
//         // d.delete();
//         // d.print();

        

//         // Stack s = new Stack(5);
//         // s.push(1);
//         // s.push(2);
//         // s.push(3);
//         // s.push(4);
//         // s.push(5);
//         // s.push(6);
//         // s.print();
//         // Stack s2 = new Stack(5);
//         // while (!s.empty()) {
//         // s2.push(s.pop());
//         // }
//         // s2.print();

//         // Queue q = new Queue(5);
//         // q.enqueue(1);
//         // q.enqueue(2);
//         // q.enqueue(3);
//         // q.enqueue(4);
//         // q.print();
//         // System.out.println(q.front());
//         // q.dequeue();
//         // q.dequeue();
//         // q.print();
//         // System.out.println(q.size());
//     }
// }
