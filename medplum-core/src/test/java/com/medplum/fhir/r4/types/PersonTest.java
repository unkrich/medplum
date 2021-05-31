/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Person(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Person.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Person x = Person.create().build();
        final Person y = Person.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Person.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Person.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Person.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Person.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Person.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().identifier(value).build().identifier());
    }

    @Test
    public void testName() {
        final java.util.List<HumanName> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().name(value).build().name());
    }

    @Test
    public void testTelecom() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().telecom(value).build().telecom());
    }

    @Test
    public void testGender() {
        assertEquals("x", Person.create().gender("x").build().gender());
    }

    @Test
    public void testBirthDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Person.create().birthDate(value).build().birthDate());
    }

    @Test
    public void testAddress() {
        final java.util.List<Address> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().address(value).build().address());
    }

    @Test
    public void testPhoto() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, Person.create().photo(value).build().photo());
    }

    @Test
    public void testManagingOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, Person.create().managingOrganization(value).build().managingOrganization());
    }

    @Test
    public void testActive() {
        assertEquals(true, Person.create().active(true).build().active());
    }

    @Test
    public void testLink() {
        final java.util.List<Person.PersonLink> value = java.util.Collections.emptyList();
        assertEquals(value, Person.create().link(value).build().link());
    }
}