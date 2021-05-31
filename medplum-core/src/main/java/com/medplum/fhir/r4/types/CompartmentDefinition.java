/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A compartment definition that defines how resources are accessed on a
 * server.
 */
public class CompartmentDefinition extends DomainResource {
    public static final String RESOURCE_TYPE = "CompartmentDefinition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public CompartmentDefinition(final JsonObject data) {
        super(data);
    }

    /**
     * An absolute URI that is used to identify this compartment definition
     * when it is referenced in a specification, model, design or an
     * instance; also called its canonical identifier. This SHOULD be
     * globally unique and SHOULD be a literal address at which at which an
     * authoritative instance of this compartment definition is (or will be)
     * published. This URL can be the target of a canonical reference. It
     * SHALL remain the same when the compartment definition is stored on
     * different servers.
     */
    public java.net.URI url() {
        return getUri(FhirPropertyNames.PROPERTY_URL);
    }

    /**
     * The identifier that is used to identify this version of the
     * compartment definition when it is referenced in a specification,
     * model, design or instance. This is an arbitrary value managed by the
     * compartment definition author and is not expected to be globally
     * unique. For example, it might be a timestamp (e.g. yyyymmdd) if a
     * managed version is not available. There is also no expectation that
     * versions can be placed in a lexicographical sequence.
     */
    public String version() {
        return getString(FhirPropertyNames.PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the compartment definition. This
     * name should be usable as an identifier for the module by machine
     * processing applications such as code generation.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * The status of this compartment definition. Enables tracking the
     * life-cycle of the content.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this compartment definition is
     * authored for testing purposes (or education/evaluation/marketing) and
     * is not intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_EXPERIMENTAL);
    }

    /**
     * The date  (and optionally time) when the compartment definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the compartment definition
     * changes.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * The name of the organization or individual that published the
     * compartment definition.
     */
    public String publisher() {
        return getString(FhirPropertyNames.PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_CONTACT);
    }

    /**
     * A free text natural language description of the compartment definition
     * from a consumer's perspective.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate compartment definition
     * instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, FhirPropertyNames.PROPERTY_USE_CONTEXT);
    }

    /**
     * Explanation of why this compartment definition is needed and why it
     * has been designed as it has.
     */
    public String purpose() {
        return getString(FhirPropertyNames.PROPERTY_PURPOSE);
    }

    /**
     * Which compartment this definition describes.
     */
    public String code() {
        return getString(FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * Whether the search syntax is supported,.
     */
    public Boolean search() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_SEARCH);
    }

    /**
     * Information about how a resource is related to the compartment.
     */
    public java.util.List<CompartmentDefinitionResource> resource() {
        return getList(CompartmentDefinitionResource.class, FhirPropertyNames.PROPERTY_RESOURCE);
    }

    public static final class Builder extends DomainResource.Builder<CompartmentDefinition, CompartmentDefinition.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder url(final java.net.URI url) {
            b.add(FhirPropertyNames.PROPERTY_URL, url.toString());
            return this;
        }

        public Builder version(final String version) {
            b.add(FhirPropertyNames.PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(FhirPropertyNames.PROPERTY_EXPERIMENTAL, experimental);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(FhirPropertyNames.PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(FhirPropertyNames.PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(FhirPropertyNames.PROPERTY_USE_CONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder purpose(final String purpose) {
            b.add(FhirPropertyNames.PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder code(final String code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder search(final Boolean search) {
            b.add(FhirPropertyNames.PROPERTY_SEARCH, search);
            return this;
        }

        public Builder resource(final java.util.List<CompartmentDefinitionResource> resource) {
            b.add(FhirPropertyNames.PROPERTY_RESOURCE, FhirObject.toArray(resource));
            return this;
        }

        public CompartmentDefinition build() {
            return new CompartmentDefinition(b.build());
        }
    }

    /**
     * A compartment definition that defines how resources are accessed on a
     * server.
     */
    public static class CompartmentDefinitionResource extends FhirObject {
        public static final String RESOURCE_TYPE = "CompartmentDefinitionResource";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompartmentDefinitionResource(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references).
         * This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(FhirPropertyNames.PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of
         * the basic definition of the element. To make the use of extensions
         * safe and manageable, there is a strict set of governance  applied to
         * the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met
         * as part of the definition of the extension.
         */
        public java.util.List<Extension> extension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_EXTENSION);
        }

        /**
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * The name of a resource supported by the server.
         */
        public String code() {
            return getString(FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The name of a search parameter that represents the link to the
         * compartment. More than one may be listed because a resource may be
         * linked to a compartment in more than one way,.
         */
        public java.util.List<String> param() {
            return getList(String.class, FhirPropertyNames.PROPERTY_PARAM);
        }

        /**
         * Additional documentation about the resource and compartment.
         */
        public String documentation() {
            return getString(FhirPropertyNames.PROPERTY_DOCUMENTATION);
        }

        public static final class Builder extends FhirObject.Builder<CompartmentDefinitionResource, CompartmentDefinitionResource.Builder> {

            private Builder() {
                super();
            }

            private Builder(final JsonObject data) {
                super(data);
            }

            public Builder id(final String id) {
                b.add(FhirPropertyNames.PROPERTY_ID, id);
                return this;
            }

            public Builder extension(final java.util.List<Extension> extension) {
                b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final String code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder param(final java.util.List<String> param) {
                b.add(FhirPropertyNames.PROPERTY_PARAM, FhirObject.toStringArray(param));
                return this;
            }

            public Builder documentation(final String documentation) {
                b.add(FhirPropertyNames.PROPERTY_DOCUMENTATION, documentation);
                return this;
            }

            public CompartmentDefinitionResource build() {
                return new CompartmentDefinitionResource(b.build());
            }
        }
    }
}