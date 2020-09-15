package org.example;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    IAdd iAdd = Mockito.mock(IAdd.class);
    App app = new App(iAdd);
    @Test
    public void testPerform()
    {
        Mockito.when(iAdd.add(2,3)).thenReturn(5);
        assertEquals(10,app.perform(2,3));
    }

}