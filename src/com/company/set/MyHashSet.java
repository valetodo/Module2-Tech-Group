package com.company.set;

import com.company.list.MyDoublyLinkedList;


public class MyHashSet<T> {

    private MyDoublyLinkedList<T>[] index;
    private int size;

    public MyHashSet(int size) {
        this.size = size;
        this.index = new MyDoublyLinkedList[this.size];
        for (int i = 0; i < size; i++) {
            this.index[i] = new MyDoublyLinkedList<T>();
        }
    }

    public int getIndexSize() {
        return this.index.length;
    }

    public boolean add(T data) {
        for (int i = 0; i < this.size; i++){
            if (this.index[i].getFirst() == null){
                this.index[i].add(data);
                return true;
            }
        }
        return false;
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.size; i++){
            if (this.index[i].contains(data)) {
                return true;
            }
        }

        return false;
    }

    public int size(){
        int size = 0;
        for (int i = 0; i < this.size; i++){
            if (this.index[i].size() != 0)
                size++;
        }
        return size;
    }
}
