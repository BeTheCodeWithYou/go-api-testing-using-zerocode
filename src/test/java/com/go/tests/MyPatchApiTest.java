package com.go.tests;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("hostconfig_ci.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class MyPatchApiTest {

    @Test
    @Scenario("tests/patch_api_204.json")
    public void testPatch() throws Exception{

    }
    
}