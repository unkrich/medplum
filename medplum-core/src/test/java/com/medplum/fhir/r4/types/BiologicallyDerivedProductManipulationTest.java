/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class BiologicallyDerivedProductManipulationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
    final BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation x =
            BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().build();
    final BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation y =
            BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().description("x").build().description());
    }

    @Test
    public void testTimeDateTime() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().timeDateTime("x").build().timeDateTime());
    }

    @Test
    public void testTimePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().timePeriod(value).build().timePeriod());
    }
}