/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * This resource provides the status of the payment for goods and
 * services rendered, and the request and response resource references.
 */
public class PaymentNotice extends DomainResource {
    public static final String RESOURCE_TYPE = "PaymentNotice";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public PaymentNotice(final JsonObject data) {
        super(data);
    }

    /**
     * A unique identifier assigned to this payment notice.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The status of the resource instance.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Reference of resource for which payment is being made.
     */
    public Reference request() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUEST);
    }

    /**
     * Reference of response to resource for which payment is being made.
     */
    public Reference response() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_RESPONSE);
    }

    /**
     * The date when this resource was created.
     */
    public java.time.Instant created() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATED);
    }

    /**
     * The practitioner who is responsible for the services rendered to the
     * patient.
     */
    public Reference provider() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PROVIDER);
    }

    /**
     * A reference to the payment which is the subject of this notice.
     */
    public Reference payment() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PAYMENT);
    }

    /**
     * The date when the above payment action occurred.
     */
    public java.time.LocalDate paymentDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_PAYMENT_DATE);
    }

    /**
     * The party who will receive or has received payment that is the subject
     * of this notification.
     */
    public Reference payee() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PAYEE);
    }

    /**
     * The party who is notified of the payment status.
     */
    public Reference recipient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_RECIPIENT);
    }

    /**
     * The amount sent to the payee.
     */
    public Money amount() {
        return getObject(Money.class, FhirPropertyNames.PROPERTY_AMOUNT);
    }

    /**
     * A code indicating whether payment has been sent or cleared.
     */
    public CodeableConcept paymentStatus() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PAYMENT_STATUS);
    }

    public static final class Builder extends DomainResource.Builder<PaymentNotice, PaymentNotice.Builder> {

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

        public Builder request(final Reference request) {
            b.add(FhirPropertyNames.PROPERTY_REQUEST, request);
            return this;
        }

        public Builder response(final Reference response) {
            b.add(FhirPropertyNames.PROPERTY_RESPONSE, response);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(FhirPropertyNames.PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder provider(final Reference provider) {
            b.add(FhirPropertyNames.PROPERTY_PROVIDER, provider);
            return this;
        }

        public Builder payment(final Reference payment) {
            b.add(FhirPropertyNames.PROPERTY_PAYMENT, payment);
            return this;
        }

        public Builder paymentDate(final java.time.LocalDate paymentDate) {
            b.add(FhirPropertyNames.PROPERTY_PAYMENT_DATE, paymentDate.toString());
            return this;
        }

        public Builder payee(final Reference payee) {
            b.add(FhirPropertyNames.PROPERTY_PAYEE, payee);
            return this;
        }

        public Builder recipient(final Reference recipient) {
            b.add(FhirPropertyNames.PROPERTY_RECIPIENT, recipient);
            return this;
        }

        public Builder amount(final Money amount) {
            b.add(FhirPropertyNames.PROPERTY_AMOUNT, amount);
            return this;
        }

        public Builder paymentStatus(final CodeableConcept paymentStatus) {
            b.add(FhirPropertyNames.PROPERTY_PAYMENT_STATUS, paymentStatus);
            return this;
        }

        public PaymentNotice build() {
            return new PaymentNotice(b.build());
        }
    }
}