package scenario9;

import org.junit.Before;
import org.junit.Test;
import scenario9.ClassRoom;
import scenario9.Student;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClassRoomTest {

    private Student student;

    @Before
    public void setUp() {
        student = mock(Student.class);
        when(student.getName()).thenReturn("yingying");
    }

    @Test
    public void should_return_students_name() throws Exception {
        assertEquals(ClassRoom.getName(student), "yingying");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_student_is_null() throws Exception {
        when(student.getName()).thenThrow(new IllegalArgumentException("exception"));

        ClassRoom.getName(student);
    }

}
