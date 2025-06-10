package com.multimodule.common.types;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTypeTest {

		@Test
		void valueOf() {
				// Given
				String sampleTypeString = "S";

				// When
				var result = SampleType.valueOf( sampleTypeString );

				// Then
				Assertions.assertThat( result ).isNotNull()
								.isEqualTo( SampleType.S );
		}
}