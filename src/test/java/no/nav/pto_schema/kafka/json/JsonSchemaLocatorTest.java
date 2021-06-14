package no.nav.pto_schema.kafka.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonSchemaLocatorTest {

    @Test
    public void should_create_correct_schema_name_for_class() {
        assertEquals("some-topic-v1-schema.json", JsonSchemaLocator.getSchemaName(SomeTopicV1.class));
    }

    @Test
    public void should_create_correct_resource_path_for_class() {
        assertEquals("kafka/json/topic/some-topic-v1-schema.json", JsonSchemaLocator.createKafkaSchemaResourcePath(SomeTopicV1.class));
    }

    private static class SomeTopicV1 {}

}
