package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RepetidosTest {

  private Repetidos repetidos;

  @Before
  public void setUp() throws Exception {
    this.repetidos = new Repetidos();
  }

  @After
  public void tearDown() throws Exception {
    this.repetidos = null;
  }

  @Test public void test01 () {
    final List<Object> expected = new ArrayList<Object>();
    final List<Object> result = repetidos.apply(Arrays.asList());
    assertEquals(expected, result);  
  }

  @Test public void test02 () {
    final List<Object> expected = Arrays.asList(1);
    final List<Object> result = repetidos.apply(Arrays.asList(1));
    assertEquals(expected, result); 
  }

  @Test public void test03 () {
    final List<Integer> expected = Arrays.asList(1, 2);
    final List<Object> result = repetidos.apply(Arrays.asList(1, 2));
    assertArrayEquals(expected.toArray(new Integer[0]), result.toArray(new Integer[0]));
  }

  @Test public void test04 () {
    final List<Integer> expected = Arrays.asList(1, 2);
    final List<Object> result = repetidos.apply(Arrays.asList(1, 2, 2));
    assertArrayEquals(expected.toArray(new Integer[0]), result.toArray(new Integer[0]));
  }

  @Test public void test05 () {
    final List<Integer> expected = Arrays.asList(1, 2);
    final List<Object> result = repetidos.apply(Arrays.asList(1, 2, 2, 1));
    assertArrayEquals(expected.toArray(new Integer[0]), result.toArray(new Integer[0]));
  }


  @Test public void test06 () {
    final List<Integer> expected = Arrays.asList(1, 2);
    final List<Object> result = repetidos.apply(Arrays.asList(1, 2, 2, 1));
    assertArrayEquals(expected.toArray(new Integer[0]), result.toArray(new Integer[0]));
  }

  @Test public void test07 () {
    final List<Object> expected = Arrays.asList("a");
    final List<Object> result = repetidos.apply(Arrays.asList("a", "a"));
    assertEquals(expected, result); 
  }

  @Test public void test08 () {
    final List<Object> expected = Arrays.asList("a", "b");
    final List<Object> result = repetidos.apply(Arrays.asList( "a", "a", "b"));
    assertEquals(expected, result); 
  }

  @Test public void test09 () {
    final List<Object> expected = Arrays.asList("a", "b", "c");
    final List<Object> result = repetidos.apply(Arrays.asList("a", "a", "b", "b", "c", "c"));
    assertEquals(expected, result); 
  }


  @Test public void test10 () {
    final List<Object> expected = Arrays.asList("a", "b", "hola");
    final List<Object> result = repetidos.apply(Arrays.asList("a", "a", "b", "b", "hola"));
    assertEquals(expected, result);
  }

  @Test public void test11 () {
    final List<Object> expected = Arrays.asList("a", "b", "hola", "ola");
    final List<Object> result = repetidos.apply(Arrays.asList("a", "a", "b", "b", "hola", "ola"));
    assertEquals(expected, result); 
  }

  @Test public void test12 () {
    final List<Object> expected = Arrays.asList("a", "b", "hola", "ola");
    final List<Object> result = repetidos.apply(Arrays.asList("a", "a", "b", "b", "hola", "ola", "hola"));
    assertEquals(expected, result);  
  }

  @Test public void test13Null() {
    final List<Object> expected = null;
    final List<Object> result = repetidos.apply(null);
    assertEquals(expected, result); 
  }

}