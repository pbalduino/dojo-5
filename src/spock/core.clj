(ns spock.core)

(def jogadas {
  :tesoura {:ganha [:lagarto :papel]
						:perde [:spock :pedra]}
	:papel {:ganha [:spock :pedra]
					:perde [:tesoura :lagarto]}})

(defn jokenpo [jogador1 jogador2]
	(if (and (= jogador2 jogador1))
	; 			:empate
	(cond
		(and (= jogador2 jogador1))
	(if (some #(= jogador2 %) ((jogadas jogador1) :ganha))
		:jogador1
	)
	)
	; (cond
	; (and (= jogador2 jogador1))
	; 		:empate
	; (and (some #(= jogador2 %) ((jogadas jogador1) :ganha))
	; 		:jogador1
	; (and (= jogador1 :papel ) (= jogador2 :tesoura))
	; 	:jogador2
	; (and (= jogador2 :pedra ) (= jogador1 :papel))
	; 	:jogador1
	; (and (= jogador2 :papel) (= jogador1 :pedra))
	; 	:jogador2
	; )
)
