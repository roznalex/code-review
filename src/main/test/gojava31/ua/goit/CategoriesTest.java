package gojava31.ua.goit;

import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;

public class CategoriesTest {

    @org.junit.Test
    public void testDoGet() throws Exception {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        assertEquals(request.getRequestURI(), "http://localhost:8080/categories");
    }
}