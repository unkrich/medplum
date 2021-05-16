/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CoverageEligibilityResponseInsuranceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CoverageEligibilityResponse.CoverageEligibilityResponseInsurance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCoverage() {
        final Reference value = Reference.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create().coverage(value).build().coverage());
    }

    @Test
    public void testInforce() {
        assertEquals(true, CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create().inforce(true).build().inforce());
    }

    @Test
    public void testBenefitPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create().benefitPeriod(value).build().benefitPeriod());
    }

    @Test
    public void testItem() {
        final java.util.List<CoverageEligibilityResponse.CoverageEligibilityResponseItem> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseInsurance.create().item(value).build().item());
    }
}