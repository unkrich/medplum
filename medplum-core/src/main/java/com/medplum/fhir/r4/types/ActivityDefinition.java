/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * This resource allows for the definition of some activity to be
 * performed, independent of a particular patient, practitioner, or other
 * performance context.
 */
public class ActivityDefinition extends DomainResource {
    public static final String RESOURCE_TYPE = "ActivityDefinition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ActivityDefinition(final JsonObject data) {
        super(data);
    }

    /**
     * An absolute URI that is used to identify this activity definition when
     * it is referenced in a specification, model, design or an instance;
     * also called its canonical identifier. This SHOULD be globally unique
     * and SHOULD be a literal address at which at which an authoritative
     * instance of this activity definition is (or will be) published. This
     * URL can be the target of a canonical reference. It SHALL remain the
     * same when the activity definition is stored on different servers.
     */
    public java.net.URI url() {
        return getUri(FhirPropertyNames.PROPERTY_URL);
    }

    /**
     * A formal identifier that is used to identify this activity definition
     * when it is represented in other formats, or referenced in a
     * specification, model, design or an instance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The identifier that is used to identify this version of the activity
     * definition when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the activity
     * definition author and is not expected to be globally unique. For
     * example, it might be a timestamp (e.g. yyyymmdd) if a managed version
     * is not available. There is also no expectation that versions can be
     * placed in a lexicographical sequence. To provide a version consistent
     * with the Decision Support Service specification, use the format
     * Major.Minor.Revision (e.g. 1.0.0). For more information on versioning
     * knowledge assets, refer to the Decision Support Service specification.
     * Note that a version is required for non-experimental active assets.
     */
    public String version() {
        return getString(FhirPropertyNames.PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the activity definition. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * A short, descriptive, user-friendly title for the activity definition.
     */
    public String title() {
        return getString(FhirPropertyNames.PROPERTY_TITLE);
    }

    /**
     * An explanatory or alternate title for the activity definition giving
     * additional information about its content.
     */
    public String subtitle() {
        return getString(FhirPropertyNames.PROPERTY_SUBTITLE);
    }

    /**
     * The status of this activity definition. Enables tracking the
     * life-cycle of the content.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this activity definition is authored
     * for testing purposes (or education/evaluation/marketing) and is not
     * intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_EXPERIMENTAL);
    }

    /**
     * A code or group definition that describes the intended subject of the
     * activity being defined.
     */
    public CodeableConcept subjectCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SUBJECT_CODEABLE_CONCEPT);
    }

    /**
     * A code or group definition that describes the intended subject of the
     * activity being defined.
     */
    public Reference subjectReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT_REFERENCE);
    }

    /**
     * The date  (and optionally time) when the activity definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the activity definition
     * changes.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * The name of the organization or individual that published the activity
     * definition.
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
     * A free text natural language description of the activity definition
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
     * indexing and searching for appropriate activity definition instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, FhirPropertyNames.PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the activity definition is
     * intended to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_JURISDICTION);
    }

    /**
     * Explanation of why this activity definition is needed and why it has
     * been designed as it has.
     */
    public String purpose() {
        return getString(FhirPropertyNames.PROPERTY_PURPOSE);
    }

    /**
     * A detailed description of how the activity definition is used from a
     * clinical perspective.
     */
    public String usage() {
        return getString(FhirPropertyNames.PROPERTY_USAGE);
    }

    /**
     * A copyright statement relating to the activity definition and/or its
     * contents. Copyright statements are generally legal restrictions on the
     * use and publishing of the activity definition.
     */
    public String copyright() {
        return getString(FhirPropertyNames.PROPERTY_COPYRIGHT);
    }

    /**
     * The date on which the resource content was approved by the publisher.
     * Approval happens once when the content is officially approved for
     * usage.
     */
    public java.time.LocalDate approvalDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_APPROVAL_DATE);
    }

    /**
     * The date on which the resource content was last reviewed. Review
     * happens periodically after approval but does not change the original
     * approval date.
     */
    public java.time.LocalDate lastReviewDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_LAST_REVIEW_DATE);
    }

    /**
     * The period during which the activity definition content was or is
     * planned to be in active use.
     */
    public Period effectivePeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_EFFECTIVE_PERIOD);
    }

    /**
     * Descriptive topics related to the content of the activity. Topics
     * provide a high-level categorization of the activity that can be useful
     * for filtering and searching.
     */
    public java.util.List<CodeableConcept> topic() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_TOPIC);
    }

    /**
     * An individiual or organization primarily involved in the creation and
     * maintenance of the content.
     */
    public java.util.List<ContactDetail> author() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_AUTHOR);
    }

    /**
     * An individual or organization primarily responsible for internal
     * coherence of the content.
     */
    public java.util.List<ContactDetail> editor() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_EDITOR);
    }

    /**
     * An individual or organization primarily responsible for review of some
     * aspect of the content.
     */
    public java.util.List<ContactDetail> reviewer() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_REVIEWER);
    }

    /**
     * An individual or organization responsible for officially endorsing the
     * content for use in some setting.
     */
    public java.util.List<ContactDetail> endorser() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_ENDORSER);
    }

    /**
     * Related artifacts such as additional documentation, justification, or
     * bibliographic references.
     */
    public java.util.List<RelatedArtifact> relatedArtifact() {
        return getList(RelatedArtifact.class, FhirPropertyNames.PROPERTY_RELATED_ARTIFACT);
    }

    /**
     * A reference to a Library resource containing any formal logic used by
     * the activity definition.
     */
    public java.util.List<String> library() {
        return getList(String.class, FhirPropertyNames.PROPERTY_LIBRARY);
    }

    /**
     * A description of the kind of resource the activity definition is
     * representing. For example, a MedicationRequest, a ServiceRequest, or a
     * CommunicationRequest. Typically, but not always, this is a Request
     * resource.
     */
    public String kind() {
        return getString(FhirPropertyNames.PROPERTY_KIND);
    }

    /**
     * A profile to which the target of the activity definition is expected
     * to conform.
     */
    public String profile() {
        return getString(FhirPropertyNames.PROPERTY_PROFILE);
    }

    /**
     * Detailed description of the type of activity; e.g. What lab test, what
     * procedure, what kind of encounter.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * Indicates the level of authority/intentionality associated with the
     * activity and where the request should fit into the workflow chain.
     */
    public String intent() {
        return getString(FhirPropertyNames.PROPERTY_INTENT);
    }

    /**
     * Indicates how quickly the activity  should be addressed with respect
     * to other requests.
     */
    public String priority() {
        return getString(FhirPropertyNames.PROPERTY_PRIORITY);
    }

    /**
     * Set this to true if the definition is to indicate that a particular
     * activity should NOT be performed. If true, this element should be
     * interpreted to reinforce a negative coding. For example NPO as a code
     * with a doNotPerform of true would still indicate to NOT perform the
     * action.
     */
    public Boolean doNotPerform() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM);
    }

    /**
     * The period, timing or frequency upon which the described activity is
     * to occur.
     */
    public Timing timingTiming() {
        return getObject(Timing.class, FhirPropertyNames.PROPERTY_TIMING_TIMING);
    }

    /**
     * The period, timing or frequency upon which the described activity is
     * to occur.
     */
    public String timingDateTime() {
        return getString(FhirPropertyNames.PROPERTY_TIMING_DATE_TIME);
    }

    /**
     * The period, timing or frequency upon which the described activity is
     * to occur.
     */
    public Age timingAge() {
        return getObject(Age.class, FhirPropertyNames.PROPERTY_TIMING_AGE);
    }

    /**
     * The period, timing or frequency upon which the described activity is
     * to occur.
     */
    public Period timingPeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_TIMING_PERIOD);
    }

    /**
     * The period, timing or frequency upon which the described activity is
     * to occur.
     */
    public Range timingRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_TIMING_RANGE);
    }

    /**
     * The period, timing or frequency upon which the described activity is
     * to occur.
     */
    public Duration timingDuration() {
        return getObject(Duration.class, FhirPropertyNames.PROPERTY_TIMING_DURATION);
    }

    /**
     * Identifies the facility where the activity will occur; e.g. home,
     * hospital, specific clinic, etc.
     */
    public Reference location() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
    }

    /**
     * Indicates who should participate in performing the action described.
     */
    public java.util.List<ActivityDefinitionParticipant> participant() {
        return getList(ActivityDefinitionParticipant.class, FhirPropertyNames.PROPERTY_PARTICIPANT);
    }

    /**
     * Identifies the food, drug or other product being consumed or supplied
     * in the activity.
     */
    public Reference productReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PRODUCT_REFERENCE);
    }

    /**
     * Identifies the food, drug or other product being consumed or supplied
     * in the activity.
     */
    public CodeableConcept productCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PRODUCT_CODEABLE_CONCEPT);
    }

    /**
     * Identifies the quantity expected to be consumed at once (per dose, per
     * meal, etc.).
     */
    public Quantity quantity() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
    }

    /**
     * Provides detailed dosage instructions in the same way that they are
     * described for MedicationRequest resources.
     */
    public java.util.List<Dosage> dosage() {
        return getList(Dosage.class, FhirPropertyNames.PROPERTY_DOSAGE);
    }

    /**
     * Indicates the sites on the subject's body where the procedure should
     * be performed (I.e. the target sites).
     */
    public java.util.List<CodeableConcept> bodySite() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_BODY_SITE);
    }

    /**
     * Defines specimen requirements for the action to be performed, such as
     * required specimens for a lab test.
     */
    public java.util.List<Reference> specimenRequirement() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SPECIMEN_REQUIREMENT);
    }

    /**
     * Defines observation requirements for the action to be performed, such
     * as body weight or surface area.
     */
    public java.util.List<Reference> observationRequirement() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_OBSERVATION_REQUIREMENT);
    }

    /**
     * Defines the observations that are expected to be produced by the
     * action.
     */
    public java.util.List<Reference> observationResultRequirement() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_OBSERVATION_RESULT_REQUIREMENT);
    }

    /**
     * A reference to a StructureMap resource that defines a transform that
     * can be executed to produce the intent resource using the
     * ActivityDefinition instance as the input.
     */
    public String transform() {
        return getString(FhirPropertyNames.PROPERTY_TRANSFORM);
    }

    /**
     * Dynamic values that will be evaluated to produce values for elements
     * of the resulting resource. For example, if the dosage of a medication
     * must be computed based on the patient's weight, a dynamic value would
     * be used to specify an expression that calculated the weight, and the
     * path on the request resource that would contain the result.
     */
    public java.util.List<ActivityDefinitionDynamicValue> dynamicValue() {
        return getList(ActivityDefinitionDynamicValue.class, FhirPropertyNames.PROPERTY_DYNAMIC_VALUE);
    }

    public static final class Builder extends DomainResource.Builder<ActivityDefinition, ActivityDefinition.Builder> {

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

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
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

        public Builder title(final String title) {
            b.add(FhirPropertyNames.PROPERTY_TITLE, title);
            return this;
        }

        public Builder subtitle(final String subtitle) {
            b.add(FhirPropertyNames.PROPERTY_SUBTITLE, subtitle);
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

        public Builder subjectCodeableConcept(final CodeableConcept subjectCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT_CODEABLE_CONCEPT, subjectCodeableConcept);
            return this;
        }

        public Builder subjectReference(final Reference subjectReference) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT_REFERENCE, subjectReference);
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

        public Builder jurisdiction(final java.util.List<CodeableConcept> jurisdiction) {
            b.add(FhirPropertyNames.PROPERTY_JURISDICTION, FhirObject.toArray(jurisdiction));
            return this;
        }

        public Builder purpose(final String purpose) {
            b.add(FhirPropertyNames.PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder usage(final String usage) {
            b.add(FhirPropertyNames.PROPERTY_USAGE, usage);
            return this;
        }

        public Builder copyright(final String copyright) {
            b.add(FhirPropertyNames.PROPERTY_COPYRIGHT, copyright);
            return this;
        }

        public Builder approvalDate(final java.time.LocalDate approvalDate) {
            b.add(FhirPropertyNames.PROPERTY_APPROVAL_DATE, approvalDate.toString());
            return this;
        }

        public Builder lastReviewDate(final java.time.LocalDate lastReviewDate) {
            b.add(FhirPropertyNames.PROPERTY_LAST_REVIEW_DATE, lastReviewDate.toString());
            return this;
        }

        public Builder effectivePeriod(final Period effectivePeriod) {
            b.add(FhirPropertyNames.PROPERTY_EFFECTIVE_PERIOD, effectivePeriod);
            return this;
        }

        public Builder topic(final java.util.List<CodeableConcept> topic) {
            b.add(FhirPropertyNames.PROPERTY_TOPIC, FhirObject.toArray(topic));
            return this;
        }

        public Builder author(final java.util.List<ContactDetail> author) {
            b.add(FhirPropertyNames.PROPERTY_AUTHOR, FhirObject.toArray(author));
            return this;
        }

        public Builder editor(final java.util.List<ContactDetail> editor) {
            b.add(FhirPropertyNames.PROPERTY_EDITOR, FhirObject.toArray(editor));
            return this;
        }

        public Builder reviewer(final java.util.List<ContactDetail> reviewer) {
            b.add(FhirPropertyNames.PROPERTY_REVIEWER, FhirObject.toArray(reviewer));
            return this;
        }

        public Builder endorser(final java.util.List<ContactDetail> endorser) {
            b.add(FhirPropertyNames.PROPERTY_ENDORSER, FhirObject.toArray(endorser));
            return this;
        }

        public Builder relatedArtifact(final java.util.List<RelatedArtifact> relatedArtifact) {
            b.add(FhirPropertyNames.PROPERTY_RELATED_ARTIFACT, FhirObject.toArray(relatedArtifact));
            return this;
        }

        public Builder library(final java.util.List<String> library) {
            b.add(FhirPropertyNames.PROPERTY_LIBRARY, FhirObject.toStringArray(library));
            return this;
        }

        public Builder kind(final String kind) {
            b.add(FhirPropertyNames.PROPERTY_KIND, kind);
            return this;
        }

        public Builder profile(final String profile) {
            b.add(FhirPropertyNames.PROPERTY_PROFILE, profile);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder intent(final String intent) {
            b.add(FhirPropertyNames.PROPERTY_INTENT, intent);
            return this;
        }

        public Builder priority(final String priority) {
            b.add(FhirPropertyNames.PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder doNotPerform(final Boolean doNotPerform) {
            b.add(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM, doNotPerform);
            return this;
        }

        public Builder timingTiming(final Timing timingTiming) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_TIMING, timingTiming);
            return this;
        }

        public Builder timingDateTime(final String timingDateTime) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_DATE_TIME, timingDateTime);
            return this;
        }

        public Builder timingAge(final Age timingAge) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_AGE, timingAge);
            return this;
        }

        public Builder timingPeriod(final Period timingPeriod) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_PERIOD, timingPeriod);
            return this;
        }

        public Builder timingRange(final Range timingRange) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_RANGE, timingRange);
            return this;
        }

        public Builder timingDuration(final Duration timingDuration) {
            b.add(FhirPropertyNames.PROPERTY_TIMING_DURATION, timingDuration);
            return this;
        }

        public Builder location(final Reference location) {
            b.add(FhirPropertyNames.PROPERTY_LOCATION, location);
            return this;
        }

        public Builder participant(final java.util.List<ActivityDefinitionParticipant> participant) {
            b.add(FhirPropertyNames.PROPERTY_PARTICIPANT, FhirObject.toArray(participant));
            return this;
        }

        public Builder productReference(final Reference productReference) {
            b.add(FhirPropertyNames.PROPERTY_PRODUCT_REFERENCE, productReference);
            return this;
        }

        public Builder productCodeableConcept(final CodeableConcept productCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_PRODUCT_CODEABLE_CONCEPT, productCodeableConcept);
            return this;
        }

        public Builder quantity(final Quantity quantity) {
            b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder dosage(final java.util.List<Dosage> dosage) {
            b.add(FhirPropertyNames.PROPERTY_DOSAGE, FhirObject.toArray(dosage));
            return this;
        }

        public Builder bodySite(final java.util.List<CodeableConcept> bodySite) {
            b.add(FhirPropertyNames.PROPERTY_BODY_SITE, FhirObject.toArray(bodySite));
            return this;
        }

        public Builder specimenRequirement(final java.util.List<Reference> specimenRequirement) {
            b.add(FhirPropertyNames.PROPERTY_SPECIMEN_REQUIREMENT, FhirObject.toArray(specimenRequirement));
            return this;
        }

        public Builder observationRequirement(final java.util.List<Reference> observationRequirement) {
            b.add(FhirPropertyNames.PROPERTY_OBSERVATION_REQUIREMENT, FhirObject.toArray(observationRequirement));
            return this;
        }

        public Builder observationResultRequirement(final java.util.List<Reference> observationResultRequirement) {
            b.add(FhirPropertyNames.PROPERTY_OBSERVATION_RESULT_REQUIREMENT, FhirObject.toArray(observationResultRequirement));
            return this;
        }

        public Builder transform(final String transform) {
            b.add(FhirPropertyNames.PROPERTY_TRANSFORM, transform);
            return this;
        }

        public Builder dynamicValue(final java.util.List<ActivityDefinitionDynamicValue> dynamicValue) {
            b.add(FhirPropertyNames.PROPERTY_DYNAMIC_VALUE, FhirObject.toArray(dynamicValue));
            return this;
        }

        public ActivityDefinition build() {
            return new ActivityDefinition(b.build());
        }
    }

    /**
     * This resource allows for the definition of some activity to be
     * performed, independent of a particular patient, practitioner, or other
     * performance context.
     */
    public static class ActivityDefinitionDynamicValue extends FhirObject {
        public static final String RESOURCE_TYPE = "ActivityDefinitionDynamicValue";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ActivityDefinitionDynamicValue(final JsonObject data) {
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
         * The path to the element to be customized. This is the path on the
         * resource that will hold the result of the calculation defined by the
         * expression. The specified path SHALL be a FHIRPath resolveable on the
         * specified target type of the ActivityDefinition, and SHALL consist
         * only of identifiers, constant indexers, and a restricted subset of
         * functions. The path is allowed to contain qualifiers (.) to traverse
         * sub-elements, as well as indexers ([x]) to traverse
         * multiple-cardinality sub-elements (see the [Simple FHIRPath
         * Profile](fhirpath.html#simple) for full details).
         */
        public String path() {
            return getString(FhirPropertyNames.PROPERTY_PATH);
        }

        /**
         * An expression specifying the value of the customized element.
         */
        public Expression expression() {
            return getObject(Expression.class, FhirPropertyNames.PROPERTY_EXPRESSION);
        }

        public static final class Builder extends FhirObject.Builder<ActivityDefinitionDynamicValue, ActivityDefinitionDynamicValue.Builder> {

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

            public Builder path(final String path) {
                b.add(FhirPropertyNames.PROPERTY_PATH, path);
                return this;
            }

            public Builder expression(final Expression expression) {
                b.add(FhirPropertyNames.PROPERTY_EXPRESSION, expression);
                return this;
            }

            public ActivityDefinitionDynamicValue build() {
                return new ActivityDefinitionDynamicValue(b.build());
            }
        }
    }

    /**
     * This resource allows for the definition of some activity to be
     * performed, independent of a particular patient, practitioner, or other
     * performance context.
     */
    public static class ActivityDefinitionParticipant extends FhirObject {
        public static final String RESOURCE_TYPE = "ActivityDefinitionParticipant";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ActivityDefinitionParticipant(final JsonObject data) {
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
         * The type of participant in the action.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * The role the participant should play in performing the described
         * action.
         */
        public CodeableConcept role() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ROLE);
        }

        public static final class Builder extends FhirObject.Builder<ActivityDefinitionParticipant, ActivityDefinitionParticipant.Builder> {

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

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder role(final CodeableConcept role) {
                b.add(FhirPropertyNames.PROPERTY_ROLE, role);
                return this;
            }

            public ActivityDefinitionParticipant build() {
                return new ActivityDefinitionParticipant(b.build());
            }
        }
    }
}