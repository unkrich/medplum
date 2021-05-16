/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DetectedIssueMitigationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DetectedIssue.DetectedIssueMitigation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DetectedIssue.DetectedIssueMitigation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", DetectedIssue.DetectedIssueMitigation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DetectedIssue.DetectedIssueMitigation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DetectedIssue.DetectedIssueMitigation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAction() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DetectedIssue.DetectedIssueMitigation.create().action(value).build().action());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, DetectedIssue.DetectedIssueMitigation.create().date(value).build().date());
    }

    @Test
    public void testAuthor() {
        final Reference value = Reference.create().build();
        assertEquals(value, DetectedIssue.DetectedIssueMitigation.create().author(value).build().author());
    }
}