package io.github.sejoung.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class AnimalTest {

  @Test
  @DisplayName("AnimalFactory test")
  internal fun test() {
    val actual = AnimalFactory(AnimalType.DOG)
    assertThat(actual.sound()).isEqualTo("Dog sound")
  }
}