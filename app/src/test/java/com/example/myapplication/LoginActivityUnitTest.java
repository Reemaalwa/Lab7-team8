package com.example.myapplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginActivityUnitTest {
    private static final String VALID_STRING = "Login was successful";
    private static final String INVALID_STRING = "Invalid login!";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {
        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("admin", "admin");

        // ...then the result should be the expected one.
        assertThat(result, is(VALID_STRING));
    }

    @Test
    public void readStringFromContext_InvalidLogin() {
        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("notadmin", "notadmin");

        // ...then the result should be the expected one.
        assertThat(result, is(INVALID_STRING));
    }
}
