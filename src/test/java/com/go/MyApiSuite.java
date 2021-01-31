package com.go;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.go.tests.MyDeleteApiTest;
import com.go.tests.MyGetApiTest;
import com.go.tests.MyPatchApiTest;
import com.go.tests.MyPutApiTest;
import com.go.tests.MyPostApiTest;

@RunWith(Suite.class)
@SuiteClasses({MyGetApiTest.class, MyPostApiTest.class, 
                MyPutApiTest.class, MyPatchApiTest.class, MyDeleteApiTest.class})
public class MyApiSuite {

}
