/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DeviceNameTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Device.DeviceName(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Device.DeviceName.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Device.DeviceName x = Device.DeviceName.create().build();
        final Device.DeviceName y = Device.DeviceName.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Device.DeviceName.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceName.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceName.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", Device.DeviceName.create().name("x").build().name());
    }

    @Test
    public void testType() {
        assertEquals("x", Device.DeviceName.create().type("x").build().type());
    }
}