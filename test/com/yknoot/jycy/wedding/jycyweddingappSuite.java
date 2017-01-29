package com.yknoot.jycy.wedding;

import com.yknoot.jycy.wedding.client.jycyweddingappTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class jycyweddingappSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for jycyweddingapp");
    suite.addTestSuite(jycyweddingappTest.class);
    return suite;
  }
}
