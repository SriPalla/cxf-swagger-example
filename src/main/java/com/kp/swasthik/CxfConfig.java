package com.kp.swasthik;

import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;


@Configuration
public class CxfConfig {

	@Bean
	public Swagger2Feature swaggerFeature() {
		Swagger2Feature feature = new Swagger2Feature();
		feature.setDescription("KP Description");
		return feature;

	}

	@Bean
	public JacksonJaxbJsonProvider provider() {
		return new JacksonJaxbJsonProvider();
	}
}
