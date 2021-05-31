/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Indicates an actual or potential clinical issue with or between one or
 * more active or proposed clinical actions for a patient; e.g. Drug-drug
 * interaction, Ineffective treatment frequency, Procedure-condition
 * conflict, etc.
 */
public class DetectedIssue extends DomainResource {
    public static final String RESOURCE_TYPE = "DetectedIssue";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public DetectedIssue(final JsonObject data) {
        super(data);
    }

    /**
     * Business identifier associated with the detected issue record.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates the status of the detected issue.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Identifies the general type of issue identified.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * Indicates the degree of importance associated with the identified
     * issue based on the potential impact on the patient.
     */
    public String severity() {
        return getString(FhirPropertyNames.PROPERTY_SEVERITY);
    }

    /**
     * Indicates the patient whose record the detected issue is associated
     * with.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * The date or period when the detected issue was initially identified.
     */
    public String identifiedDateTime() {
        return getString(FhirPropertyNames.PROPERTY_IDENTIFIED_DATE_TIME);
    }

    /**
     * The date or period when the detected issue was initially identified.
     */
    public Period identifiedPeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_IDENTIFIED_PERIOD);
    }

    /**
     * Individual or device responsible for the issue being raised.  For
     * example, a decision support application or a pharmacist conducting a
     * medication review.
     */
    public Reference author() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_AUTHOR);
    }

    /**
     * Indicates the resource representing the current activity or proposed
     * activity that is potentially problematic.
     */
    public java.util.List<Reference> implicated() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_IMPLICATED);
    }

    /**
     * Supporting evidence or manifestations that provide the basis for
     * identifying the detected issue such as a GuidanceResponse or
     * MeasureReport.
     */
    public java.util.List<DetectedIssueEvidence> evidence() {
        return getList(DetectedIssueEvidence.class, FhirPropertyNames.PROPERTY_EVIDENCE);
    }

    /**
     * A textual explanation of the detected issue.
     */
    public String detail() {
        return getString(FhirPropertyNames.PROPERTY_DETAIL);
    }

    /**
     * The literature, knowledge-base or similar reference that describes the
     * propensity for the detected issue identified.
     */
    public java.net.URI reference() {
        return getUri(FhirPropertyNames.PROPERTY_REFERENCE);
    }

    /**
     * Indicates an action that has been taken or is committed to reduce or
     * eliminate the likelihood of the risk identified by the detected issue
     * from manifesting.  Can also reflect an observation of known mitigating
     * factors that may reduce/eliminate the need for any action.
     */
    public java.util.List<DetectedIssueMitigation> mitigation() {
        return getList(DetectedIssueMitigation.class, FhirPropertyNames.PROPERTY_MITIGATION);
    }

    public static final class Builder extends DomainResource.Builder<DetectedIssue, DetectedIssue.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder severity(final String severity) {
            b.add(FhirPropertyNames.PROPERTY_SEVERITY, severity);
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder identifiedDateTime(final String identifiedDateTime) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIED_DATE_TIME, identifiedDateTime);
            return this;
        }

        public Builder identifiedPeriod(final Period identifiedPeriod) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIED_PERIOD, identifiedPeriod);
            return this;
        }

        public Builder author(final Reference author) {
            b.add(FhirPropertyNames.PROPERTY_AUTHOR, author);
            return this;
        }

        public Builder implicated(final java.util.List<Reference> implicated) {
            b.add(FhirPropertyNames.PROPERTY_IMPLICATED, FhirObject.toArray(implicated));
            return this;
        }

        public Builder evidence(final java.util.List<DetectedIssueEvidence> evidence) {
            b.add(FhirPropertyNames.PROPERTY_EVIDENCE, FhirObject.toArray(evidence));
            return this;
        }

        public Builder detail(final String detail) {
            b.add(FhirPropertyNames.PROPERTY_DETAIL, detail);
            return this;
        }

        public Builder reference(final java.net.URI reference) {
            b.add(FhirPropertyNames.PROPERTY_REFERENCE, reference.toString());
            return this;
        }

        public Builder mitigation(final java.util.List<DetectedIssueMitigation> mitigation) {
            b.add(FhirPropertyNames.PROPERTY_MITIGATION, FhirObject.toArray(mitigation));
            return this;
        }

        public DetectedIssue build() {
            return new DetectedIssue(b.build());
        }
    }

    /**
     * Indicates an actual or potential clinical issue with or between one or
     * more active or proposed clinical actions for a patient; e.g. Drug-drug
     * interaction, Ineffective treatment frequency, Procedure-condition
     * conflict, etc.
     */
    public static class DetectedIssueEvidence extends FhirObject {
        public static final String RESOURCE_TYPE = "DetectedIssueEvidence";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DetectedIssueEvidence(final JsonObject data) {
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
         * A manifestation that led to the recording of this detected issue.
         */
        public java.util.List<CodeableConcept> code() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Links to resources that constitute evidence for the detected issue
         * such as a GuidanceResponse or MeasureReport.
         */
        public java.util.List<Reference> detail() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_DETAIL);
        }

        public static final class Builder extends FhirObject.Builder<DetectedIssueEvidence, DetectedIssueEvidence.Builder> {

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

            public Builder code(final java.util.List<CodeableConcept> code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, FhirObject.toArray(code));
                return this;
            }

            public Builder detail(final java.util.List<Reference> detail) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL, FhirObject.toArray(detail));
                return this;
            }

            public DetectedIssueEvidence build() {
                return new DetectedIssueEvidence(b.build());
            }
        }
    }

    /**
     * Indicates an actual or potential clinical issue with or between one or
     * more active or proposed clinical actions for a patient; e.g. Drug-drug
     * interaction, Ineffective treatment frequency, Procedure-condition
     * conflict, etc.
     */
    public static class DetectedIssueMitigation extends FhirObject {
        public static final String RESOURCE_TYPE = "DetectedIssueMitigation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DetectedIssueMitigation(final JsonObject data) {
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
         * Describes the action that was taken or the observation that was made
         * that reduces/eliminates the risk associated with the identified issue.
         */
        public CodeableConcept action() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ACTION);
        }

        /**
         * Indicates when the mitigating action was documented.
         */
        public java.time.Instant date() {
            return getInstant(FhirPropertyNames.PROPERTY_DATE);
        }

        /**
         * Identifies the practitioner who determined the mitigation and takes
         * responsibility for the mitigation step occurring.
         */
        public Reference author() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_AUTHOR);
        }

        public static final class Builder extends FhirObject.Builder<DetectedIssueMitigation, DetectedIssueMitigation.Builder> {

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

            public Builder action(final CodeableConcept action) {
                b.add(FhirPropertyNames.PROPERTY_ACTION, action);
                return this;
            }

            public Builder date(final java.time.Instant date) {
                b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
                return this;
            }

            public Builder author(final Reference author) {
                b.add(FhirPropertyNames.PROPERTY_AUTHOR, author);
                return this;
            }

            public DetectedIssueMitigation build() {
                return new DetectedIssueMitigation(b.build());
            }
        }
    }
}