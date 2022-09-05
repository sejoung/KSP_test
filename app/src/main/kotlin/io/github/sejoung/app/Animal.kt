package io.github.sejoung.app

import io.github.sejoung.annotation.AutoFactory

@AutoFactory
interface Animal {
  fun sound(): String
}