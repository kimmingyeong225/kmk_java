package structure.ch03;

public class IntArrayQueue {

	private int[] array;
	private int front; // 큐의 시작점
	private int rear; // 큐의 끝 지점
	private int capacity; // 용량 -> 큐의 용량
	private int size; // 요소의 개수

	public IntArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0; // 시작 지점이 0이다
		this.rear = -1; // 맨 뒤 -1
		this.size = 0;

	}

	// 편의 기능 만들어 보기
	public boolean isEmpty() {
		return size == 0;
	}

	// 가득 찬 상태
	public boolean isFull() {
		return size == capacity;
	}

	// todo -1 데이터 넣기 기능 구현
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득");
		} else {
			rear++; // 0 <-- (촛 동작 시)
			array[rear] = item; // array[0] = itme;
			size++;
		}

	}

	// todo -2 데이터 꺼내기
	public int dequeue() {
		int item = -9999;

		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
		} else {

			// 잠시 데이터 꺼내 보기
			item = array[front]; // 0번째 요소에 접근
			for (int i = front; i < rear; i++) {
				array[i] = array[i + 1];
			}
			// 마지막 요소를 초기화 처리 한다.
			array[rear] = 0;
			rear--;
			size--;

		}

		return item;
	}

	// todo -3 데이터 찾기 (peek)
	public int peek() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다");
			return -9999;
		} else {
			// peek --> 맨 앞에 데이터를 리턴 시켜주는 기능일 뿐

		}
		// 하나만 꺼내기
		return array[front];

	}

	// 코드 테스트
	public static void main(String[] args) {

		IntArrayQueue queue = new IntArrayQueue(3);

		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400); // 안 들어감

		// 데이터 꺼내고 삭제 처리
		// queue.dequeue(); // 맨 처음 들어온 녀석부터 꺼내지고 삭제 처리 된다.

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}// end of main

}
