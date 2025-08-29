package com.jonasesteves.algasensors.temperatureprocessing.api.model;

import io.hypersistence.tsid.TSID;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class TemperatureLogOutput {
    private UUID id;
    private TSID sensorId;
    private OffsetDateTime registeredAt;
    private Double value;

    private TemperatureLogOutput(){}

    private TemperatureLogOutput(UUID id, TSID sensorId, OffsetDateTime registeredAt, Double value) {
        this.id = id;
        this.sensorId = sensorId;
        this.registeredAt = registeredAt;
        this.value = value;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public TSID getSensorId() {
        return sensorId;
    }

    public void setSensorId(TSID sensorId) {
        this.sensorId = sensorId;
    }

    public OffsetDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(OffsetDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TemperatureLogOutput that = (TemperatureLogOutput) o;
        return Objects.equals(id, that.id) && Objects.equals(sensorId, that.sensorId) && Objects.equals(registeredAt, that.registeredAt) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sensorId, registeredAt, value);
    }

    @Override
    public String toString() {
        return "TemperatureLogOutput{" +
                "id=" + id +
                ", sensorId=" + sensorId +
                ", registeredAt=" + registeredAt +
                ", value=" + value +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private UUID id;
        private TSID sensorId;
        private OffsetDateTime registeredAt;
        private Double value;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder sensorId(TSID sensorId) {
            this.sensorId = sensorId;
            return this;
        }

        public Builder registeredAt(OffsetDateTime registeredAt) {
            this.registeredAt = registeredAt;
            return this;
        }

        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public TemperatureLogOutput build() {
            return new TemperatureLogOutput(this.id, this.sensorId, this.registeredAt, this.value);
        }

        @Override
        public String toString() {
            return "TemperatureLogOutput.Builder{" +
                    "id=" + id +
                    ", sensorId=" + sensorId +
                    ", registeredAt=" + registeredAt +
                    ", value=" + value +
                    '}';
        }
    }
}
