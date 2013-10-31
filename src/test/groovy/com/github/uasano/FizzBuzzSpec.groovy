package com.github.uasano

import spock.lang.Specification


/**
 * FizzBuzzのテストケース.
 */
class FizzBuzzSpec extends Specification {
    def "fizzBuzzに0を渡すと0を返すべき"() {
        given:
        FizzBuzz sut = new FizzBuzz()
        expect:
        sut.fizzBuzz(0) == "0"
    }
}