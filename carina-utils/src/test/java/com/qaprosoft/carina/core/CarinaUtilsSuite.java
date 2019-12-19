package com.qaprosoft.carina.core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qaprosoft.carina.core.foundation.db.mongo.MongoConnectorTest;
import com.qaprosoft.carina.core.foundation.exception.ExceptionsTest;
import com.qaprosoft.carina.core.foundation.jira.JiraTest;
import com.qaprosoft.zafira.listener.junit.JUnitSuite;

// TODO: 10/14/19 move to zafiras client examples after release
@RunWith(JUnitSuite.class)
@Suite.SuiteClasses({
    MongoConnectorTest.class,
    ExceptionsTest.class,
    JiraTest.class
})
public class CarinaUtilsSuite {

}