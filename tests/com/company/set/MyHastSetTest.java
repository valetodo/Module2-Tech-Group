package com.company.set;

import com.company.list.MyDoublyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHastSetTest {

    @Test
    public void testHashSetGetNonExistingIndex(){
        MyHashSet<Integer> myHashSet = new MyHashSet<>(5);

        assertEquals(5, myHashSet.getIndexSize());
    }

    @Test
    public void testAddHashSetAddSuccess(){
        MyHashSet<Integer> myHashSet = new MyHashSet<>(5);

        myHashSet.add(10);
        myHashSet.add(5);
        myHashSet.add(4);
        myHashSet.add(2);

        assertEquals(4, myHashSet.size());
        assertTrue(myHashSet.contains(10));
        assertFalse(myHashSet.contains(0));

    }
}
