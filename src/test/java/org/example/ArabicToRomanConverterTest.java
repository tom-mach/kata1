package org.example;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ArabicToRomanConverterTest {

	ArabicToRomanConverter converter = new ArabicToRomanConverter();
	
	@Test
	public void shouldRepeatASymbol() {
		assertThat(converter.convert(3)).isEqualTo("III");
		assertThat(converter.convert(20)).isEqualTo("XX");
	}
	
	@Test
	public void shouldConvertSingleSymbol() {
		assertThat(converter.convert(1)).isEqualTo("I");
		assertThat(converter.convert(5)).isEqualTo("V");
		assertThat(converter.convert(10)).isEqualTo("X");
		assertThat(converter.convert(50)).isEqualTo("L");
		assertThat(converter.convert(100)).isEqualTo("C");
		assertThat(converter.convert(500)).isEqualTo("D");
		assertThat(converter.convert(1000)).isEqualTo("M");
	}
}
