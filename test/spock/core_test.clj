(ns spock.core-test
  (:require [clojure.test :refer :all]
            [spock.core :refer :all]))

(deftest a-test
  (testing "Tesoura ganha do papel."
    (
    	is (= ( jokenpo :tesoura :papel) :jogador1)
  	)
	)
	(testing "Papel perde da Tesoura"
		(
			is (= ( jokenpo :papel :tesoura) :jogador2)
		)
	)
	(testing "Papel ganha da pedra"
		(
			is (= ( jokenpo :papel :pedra) :jogador1)
		)
	)
	(testing "Pedra perde de Papel"
		(
			is(= (jokenpo :pedra :papel) :jogador2 )
		)
	)
	(testing "empata"
		(
			is(= (jokenpo :pedra :pedra) :empate )
		)
	)
	(testing "retorna um hash de jogadas"
	)
)
