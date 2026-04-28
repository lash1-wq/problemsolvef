public class LinkedListQueue extends AQueue<T> {
  public void push(T element) {
    if (tail != null) {
      setPrev(tail);

    }
    if (head == null) {
      head = element;
    }
    tail = element;
  }

  public T pop() {
    if (head == null) {
      return null;
    }
    else {
      element = head;
      head = getNext();
    }
    return element;
  }
}
