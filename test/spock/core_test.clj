(ns spock.core-test
  (:require [clojure.test :refer :all]
            [spock.core :refer :all]))

(deftest pedra-papel-tesoura-spock-lagarto

  (testing "Jogadas iguais causam empate"
    (is(= (jokenpo :pedra   :pedra)   :empate))
    (is(= (jokenpo :tesoura :tesoura) :empate))
    (is(= (jokenpo :papel   :papel)   :empate))
    (is(= (jokenpo :spock   :spock)   :empate))
    (is(= (jokenpo :lagarto :lagarto) :empate)))

  (testing "Tesoura corta papel"
    (is (= (jokenpo :tesoura :papel) :jogador1))
    (is (= (jokenpo :papel :tesoura) :jogador2)))

  (testing "Papel cobre a pedra"
    (is (= (jokenpo :tesoura :papel) :jogador1))
    (is (= (jokenpo :papel :tesoura) :jogador2)))

  (testing "Pedra esmaga o lagarto"
    (is (= (jokenpo :pedra :lagarto) :jogador1))
    (is (= (jokenpo :lagarto :pedra) :jogador2)))

  (testing "Lagarto envenena o Spock"
    (is (= (jokenpo :lagarto :spock) :jogador1))
    (is (= (jokenpo :spock :lagarto) :jogador2)))

  (testing "Spock derrete a tesoura"
    (is (= (jokenpo :spock :tesoura) :jogador1))
    (is (= (jokenpo :tesoura :spock) :jogador2)))

  (testing "Tesoura decapita o lagarto"
    (is (= (jokenpo :tesoura :lagarto) :jogador1))
    (is (= (jokenpo :lagarto :tesoura) :jogador2)))

  (testing "Lagarto come o papel"
    (is (= (jokenpo :lagarto :papel) :jogador1))
    (is (= (jokenpo :papel :lagarto) :jogador2)))

  (testing "Papel contradiz o Spock"
    (is (= (jokenpo :papel :spock) :jogador1))
    (is (= (jokenpo :spock :papel) :jogador2)))

  (testing "Spock vaporiza a pedra"
    (is (= (jokenpo :spock :pedra) :jogador1))
    (is (= (jokenpo :pedra :spock) :jogador2)))

  (testing "Pedra quebra a tesoura"
    (is (= (jokenpo :pedra :tesoura) :jogador1))
    (is (= (jokenpo :tesoura :pedra) :jogador2))))