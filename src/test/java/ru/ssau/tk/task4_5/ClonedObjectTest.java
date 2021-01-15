package ru.ssau.tk.task4_5;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.task4_5.*;

import static org.testng.Assert.*;

public class ClonedObjectTest {
    @Test
    public void test() {
        ClonedObject clonedObject = new ClonedObject();
        NotClonedObject notClonedObject = new NotClonedObject();

        try {
            clonedObject.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Assert.assertThrows(CloneNotSupportedException.class, () -> {
            notClonedObject.clone();
        });
    }
}