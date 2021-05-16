/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ConditionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Condition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Condition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", Condition.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Condition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Condition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Condition.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Condition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Condition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().identifier(value).build().identifier());
    }

    @Test
    public void testClinicalStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Condition.create().clinicalStatus(value).build().clinicalStatus());
    }

    @Test
    public void testVerificationStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Condition.create().verificationStatus(value).build().verificationStatus());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().category(value).build().category());
    }

    @Test
    public void testSeverity() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Condition.create().severity(value).build().severity());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Condition.create().code(value).build().code());
    }

    @Test
    public void testBodySite() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().bodySite(value).build().bodySite());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, Condition.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, Condition.create().encounter(value).build().encounter());
    }

    @Test
    public void testOnsetDateTime() {
        assertEquals("x", Condition.create().onsetDateTime("x").build().onsetDateTime());
    }

    @Test
    public void testOnsetAge() {
        final Age value = Age.create().build();
        assertEquals(value, Condition.create().onsetAge(value).build().onsetAge());
    }

    @Test
    public void testOnsetPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Condition.create().onsetPeriod(value).build().onsetPeriod());
    }

    @Test
    public void testOnsetRange() {
        final Range value = Range.create().build();
        assertEquals(value, Condition.create().onsetRange(value).build().onsetRange());
    }

    @Test
    public void testOnsetString() {
        assertEquals("x", Condition.create().onsetString("x").build().onsetString());
    }

    @Test
    public void testAbatementDateTime() {
        assertEquals("x", Condition.create().abatementDateTime("x").build().abatementDateTime());
    }

    @Test
    public void testAbatementAge() {
        final Age value = Age.create().build();
        assertEquals(value, Condition.create().abatementAge(value).build().abatementAge());
    }

    @Test
    public void testAbatementPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Condition.create().abatementPeriod(value).build().abatementPeriod());
    }

    @Test
    public void testAbatementRange() {
        final Range value = Range.create().build();
        assertEquals(value, Condition.create().abatementRange(value).build().abatementRange());
    }

    @Test
    public void testAbatementString() {
        assertEquals("x", Condition.create().abatementString("x").build().abatementString());
    }

    @Test
    public void testRecordedDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Condition.create().recordedDate(value).build().recordedDate());
    }

    @Test
    public void testRecorder() {
        final Reference value = Reference.create().build();
        assertEquals(value, Condition.create().recorder(value).build().recorder());
    }

    @Test
    public void testAsserter() {
        final Reference value = Reference.create().build();
        assertEquals(value, Condition.create().asserter(value).build().asserter());
    }

    @Test
    public void testStage() {
        final java.util.List<Condition.ConditionStage> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().stage(value).build().stage());
    }

    @Test
    public void testEvidence() {
        final java.util.List<Condition.ConditionEvidence> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().evidence(value).build().evidence());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, Condition.create().note(value).build().note());
    }
}