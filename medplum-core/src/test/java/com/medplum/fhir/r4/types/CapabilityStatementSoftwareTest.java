/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CapabilityStatementSoftwareTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CapabilityStatement.CapabilityStatementSoftware(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CapabilityStatement.CapabilityStatementSoftware.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSoftware.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementSoftware.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementSoftware.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSoftware.create().name("x").build().name());
    }

    @Test
    public void testVersion() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSoftware.create().version("x").build().version());
    }

    @Test
    public void testReleaseDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, CapabilityStatement.CapabilityStatementSoftware.create().releaseDate(value).build().releaseDate());
    }
}