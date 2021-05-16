/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * The resource ChargeItem describes the provision of healthcare provider
 * products for a certain patient, therefore referring not only to the
 * product, but containing in addition details of the provision, like
 * date, time, amounts and participating organizations and persons. Main
 * Usage of the ChargeItem is to enable the billing process and internal
 * cost allocation.
 */
public class ChargeItem extends FhirResource {
    public static final String RESOURCE_TYPE = "ChargeItem";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_DEFINITION_URI = "definitionUri";
    public static final String PROPERTY_DEFINITION_CANONICAL = "definitionCanonical";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_PART_OF = "partOf";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_CONTEXT = "context";
    public static final String PROPERTY_OCCURRENCE_DATE_TIME = "occurrenceDateTime";
    public static final String PROPERTY_OCCURRENCE_PERIOD = "occurrencePeriod";
    public static final String PROPERTY_OCCURRENCE_TIMING = "occurrenceTiming";
    public static final String PROPERTY_PERFORMER = "performer";
    public static final String PROPERTY_PERFORMING_ORGANIZATION = "performingOrganization";
    public static final String PROPERTY_REQUESTING_ORGANIZATION = "requestingOrganization";
    public static final String PROPERTY_COST_CENTER = "costCenter";
    public static final String PROPERTY_QUANTITY = "quantity";
    public static final String PROPERTY_BODYSITE = "bodysite";
    public static final String PROPERTY_FACTOR_OVERRIDE = "factorOverride";
    public static final String PROPERTY_PRICE_OVERRIDE = "priceOverride";
    public static final String PROPERTY_OVERRIDE_REASON = "overrideReason";
    public static final String PROPERTY_ENTERER = "enterer";
    public static final String PROPERTY_ENTERED_DATE = "enteredDate";
    public static final String PROPERTY_REASON = "reason";
    public static final String PROPERTY_SERVICE = "service";
    public static final String PROPERTY_PRODUCT_REFERENCE = "productReference";
    public static final String PROPERTY_PRODUCT_CODEABLE_CONCEPT = "productCodeableConcept";
    public static final String PROPERTY_ACCOUNT = "account";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_SUPPORTING_INFORMATION = "supportingInformation";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ChargeItem(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public java.net.URI implicitRules() {
        return getUri(PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource and that modifies the
     * understanding of the element that contains it and/or the understanding
     * of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe
     * and manageable, there is a strict set of governance applied to the
     * definition and use of extensions. Though any implementer is allowed to
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension. Applications processing a
     * resource are required to check for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * Identifiers assigned to this event performer or other systems.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * References the (external) source of pricing information, rules of
     * application for the code this ChargeItem uses.
     */
    public java.util.List<java.net.URI> definitionUri() {
        return getList(java.net.URI.class, PROPERTY_DEFINITION_URI);
    }

    /**
     * References the source of pricing information, rules of application for
     * the code this ChargeItem uses.
     */
    public java.util.List<String> definitionCanonical() {
        return getList(String.class, PROPERTY_DEFINITION_CANONICAL);
    }

    /**
     * The current state of the ChargeItem.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * ChargeItems can be grouped to larger ChargeItems covering the whole
     * set.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, PROPERTY_PART_OF);
    }

    /**
     * A code that identifies the charge, like a billing code.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * The individual or set of individuals the action is being or was
     * performed on.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The encounter or episode of care that establishes the context for this
     * event.
     */
    public Reference context() {
        return getObject(Reference.class, PROPERTY_CONTEXT);
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
     */
    public String occurrenceDateTime() {
        return getString(PROPERTY_OCCURRENCE_DATE_TIME);
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
     */
    public Period occurrencePeriod() {
        return getObject(Period.class, PROPERTY_OCCURRENCE_PERIOD);
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
     */
    public Timing occurrenceTiming() {
        return getObject(Timing.class, PROPERTY_OCCURRENCE_TIMING);
    }

    /**
     * Indicates who or what performed or participated in the charged
     * service.
     */
    public java.util.List<ChargeItemPerformer> performer() {
        return getList(ChargeItemPerformer.class, PROPERTY_PERFORMER);
    }

    /**
     * The organization requesting the service.
     */
    public Reference performingOrganization() {
        return getObject(Reference.class, PROPERTY_PERFORMING_ORGANIZATION);
    }

    /**
     * The organization performing the service.
     */
    public Reference requestingOrganization() {
        return getObject(Reference.class, PROPERTY_REQUESTING_ORGANIZATION);
    }

    /**
     * The financial cost center permits the tracking of charge attribution.
     */
    public Reference costCenter() {
        return getObject(Reference.class, PROPERTY_COST_CENTER);
    }

    /**
     * Quantity of which the charge item has been serviced.
     */
    public Quantity quantity() {
        return getObject(Quantity.class, PROPERTY_QUANTITY);
    }

    /**
     * The anatomical location where the related service has been applied.
     */
    public java.util.List<CodeableConcept> bodysite() {
        return getList(CodeableConcept.class, PROPERTY_BODYSITE);
    }

    /**
     * Factor overriding the factor determined by the rules associated with
     * the code.
     */
    public Double factorOverride() {
        return data.getJsonNumber(PROPERTY_FACTOR_OVERRIDE).doubleValue();
    }

    /**
     * Total price of the charge overriding the list price associated with
     * the code.
     */
    public Money priceOverride() {
        return getObject(Money.class, PROPERTY_PRICE_OVERRIDE);
    }

    /**
     * If the list price or the rule-based factor associated with the code is
     * overridden, this attribute can capture a text to indicate the  reason
     * for this action.
     */
    public String overrideReason() {
        return getString(PROPERTY_OVERRIDE_REASON);
    }

    /**
     * The device, practitioner, etc. who entered the charge item.
     */
    public Reference enterer() {
        return getObject(Reference.class, PROPERTY_ENTERER);
    }

    /**
     * Date the charge item was entered.
     */
    public java.time.Instant enteredDate() {
        return getInstant(PROPERTY_ENTERED_DATE);
    }

    /**
     * Describes why the event occurred in coded or textual form.
     */
    public java.util.List<CodeableConcept> reason() {
        return getList(CodeableConcept.class, PROPERTY_REASON);
    }

    /**
     * Indicated the rendered service that caused this charge.
     */
    public java.util.List<Reference> service() {
        return getList(Reference.class, PROPERTY_SERVICE);
    }

    /**
     * Identifies the device, food, drug or other product being charged
     * either by type code or reference to an instance.
     */
    public Reference productReference() {
        return getObject(Reference.class, PROPERTY_PRODUCT_REFERENCE);
    }

    /**
     * Identifies the device, food, drug or other product being charged
     * either by type code or reference to an instance.
     */
    public CodeableConcept productCodeableConcept() {
        return getObject(CodeableConcept.class, PROPERTY_PRODUCT_CODEABLE_CONCEPT);
    }

    /**
     * Account into which this ChargeItems belongs.
     */
    public java.util.List<Reference> account() {
        return getList(Reference.class, PROPERTY_ACCOUNT);
    }

    /**
     * Comments made about the event by the performer, subject or other
     * participants.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * Further information supporting this charge.
     */
    public java.util.List<Reference> supportingInformation() {
        return getList(Reference.class, PROPERTY_SUPPORTING_INFORMATION);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCE_TYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final java.net.URI implicitRules) {
            b.add(PROPERTY_IMPLICIT_RULES, implicitRules.toString());
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder definitionUri(final java.util.List<java.net.URI> definitionUri) {
            b.add(PROPERTY_DEFINITION_URI, FhirObject.toUriArray(definitionUri));
            return this;
        }

        public Builder definitionCanonical(final java.util.List<String> definitionCanonical) {
            b.add(PROPERTY_DEFINITION_CANONICAL, FhirObject.toStringArray(definitionCanonical));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder partOf(final java.util.List<Reference> partOf) {
            b.add(PROPERTY_PART_OF, FhirObject.toArray(partOf));
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder context(final Reference context) {
            b.add(PROPERTY_CONTEXT, context);
            return this;
        }

        public Builder occurrenceDateTime(final String occurrenceDateTime) {
            b.add(PROPERTY_OCCURRENCE_DATE_TIME, occurrenceDateTime);
            return this;
        }

        public Builder occurrencePeriod(final Period occurrencePeriod) {
            b.add(PROPERTY_OCCURRENCE_PERIOD, occurrencePeriod);
            return this;
        }

        public Builder occurrenceTiming(final Timing occurrenceTiming) {
            b.add(PROPERTY_OCCURRENCE_TIMING, occurrenceTiming);
            return this;
        }

        public Builder performer(final java.util.List<ChargeItemPerformer> performer) {
            b.add(PROPERTY_PERFORMER, FhirObject.toArray(performer));
            return this;
        }

        public Builder performingOrganization(final Reference performingOrganization) {
            b.add(PROPERTY_PERFORMING_ORGANIZATION, performingOrganization);
            return this;
        }

        public Builder requestingOrganization(final Reference requestingOrganization) {
            b.add(PROPERTY_REQUESTING_ORGANIZATION, requestingOrganization);
            return this;
        }

        public Builder costCenter(final Reference costCenter) {
            b.add(PROPERTY_COST_CENTER, costCenter);
            return this;
        }

        public Builder quantity(final Quantity quantity) {
            b.add(PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder bodysite(final java.util.List<CodeableConcept> bodysite) {
            b.add(PROPERTY_BODYSITE, FhirObject.toArray(bodysite));
            return this;
        }

        public Builder factorOverride(final Double factorOverride) {
            b.add(PROPERTY_FACTOR_OVERRIDE, factorOverride);
            return this;
        }

        public Builder priceOverride(final Money priceOverride) {
            b.add(PROPERTY_PRICE_OVERRIDE, priceOverride);
            return this;
        }

        public Builder overrideReason(final String overrideReason) {
            b.add(PROPERTY_OVERRIDE_REASON, overrideReason);
            return this;
        }

        public Builder enterer(final Reference enterer) {
            b.add(PROPERTY_ENTERER, enterer);
            return this;
        }

        public Builder enteredDate(final java.time.Instant enteredDate) {
            b.add(PROPERTY_ENTERED_DATE, enteredDate.toString());
            return this;
        }

        public Builder reason(final java.util.List<CodeableConcept> reason) {
            b.add(PROPERTY_REASON, FhirObject.toArray(reason));
            return this;
        }

        public Builder service(final java.util.List<Reference> service) {
            b.add(PROPERTY_SERVICE, FhirObject.toArray(service));
            return this;
        }

        public Builder productReference(final Reference productReference) {
            b.add(PROPERTY_PRODUCT_REFERENCE, productReference);
            return this;
        }

        public Builder productCodeableConcept(final CodeableConcept productCodeableConcept) {
            b.add(PROPERTY_PRODUCT_CODEABLE_CONCEPT, productCodeableConcept);
            return this;
        }

        public Builder account(final java.util.List<Reference> account) {
            b.add(PROPERTY_ACCOUNT, FhirObject.toArray(account));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder supportingInformation(final java.util.List<Reference> supportingInformation) {
            b.add(PROPERTY_SUPPORTING_INFORMATION, FhirObject.toArray(supportingInformation));
            return this;
        }

        public ChargeItem build() {
            return new ChargeItem(b.build());
        }
    }

    /**
     * The resource ChargeItem describes the provision of healthcare provider
     * products for a certain patient, therefore referring not only to the
     * product, but containing in addition details of the provision, like
     * date, time, amounts and participating organizations and persons. Main
     * Usage of the ChargeItem is to enable the billing process and internal
     * cost allocation.
     */
    public static class ChargeItemPerformer extends FhirObject {
        public static final String RESOURCE_TYPE = "ChargeItemPerformer";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_FUNCTION = "function";
        public static final String PROPERTY_ACTOR = "actor";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ChargeItemPerformer(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references).
         * This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
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
            return getList(Extension.class, PROPERTY_EXTENSION);
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
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Describes the type of performance or participation(e.g. primary
         * surgeon, anesthesiologiest, etc.).
         */
        public CodeableConcept function() {
            return getObject(CodeableConcept.class, PROPERTY_FUNCTION);
        }

        /**
         * The device, practitioner, etc. who performed or participated in the
         * service.
         */
        public Reference actor() {
            return getObject(Reference.class, PROPERTY_ACTOR);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder extension(final java.util.List<Extension> extension) {
                b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder function(final CodeableConcept function) {
                b.add(PROPERTY_FUNCTION, function);
                return this;
            }

            public Builder actor(final Reference actor) {
                b.add(PROPERTY_ACTOR, actor);
                return this;
            }

            public ChargeItemPerformer build() {
                return new ChargeItemPerformer(b.build());
            }
        }
    }
}