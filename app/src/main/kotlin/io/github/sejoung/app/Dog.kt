package io.github.sejoung.app

import io.github.sejoung.annotation.AutoElement

@AutoElement
class Dog : Animal {
  override fun sound() = "Dog sound"
}