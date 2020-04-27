package se.lexicon.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {
    public static final String NAME = "Fluffy";
    public static final String TYPE = "Tiger";
    private Pet testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new Pet(NAME, TYPE);
    }

    @Test
    public void testObject_has_correct_data() {
        assertEquals(NAME, testObject.getName());
        assertEquals(TYPE, testObject.getType());
    }
}
