/*
 * Copyright (C) 2007-2014, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.md;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class RestrictionTest {

    @Test
    public void testIdentifier() throws Exception {
        final Restriction id = Restriction.identifier("my id");
        assertThat(id, is(notNullValue()));
        assertThat(id.getType(), is(Restriction.Type.IDENTIFIER));
        assertThat(id.getValue(), is("my id"));
    }

    @Test
    public void testTitle() throws Exception {
        final Restriction id = Restriction.title("my title");
        assertThat(id, is(notNullValue()));
        assertThat(id.getType(), is(Restriction.Type.TITLE));
        assertThat(id.getValue(), is("my title"));
    }

    @Test
    public void testSummary() throws Exception {
        final Restriction id = Restriction.summary("my summary");
        assertThat(id, is(notNullValue()));
        assertThat(id.getType(), is(Restriction.Type.SUMMARY));
        assertThat(id.getValue(), is("my summary"));
    }
}