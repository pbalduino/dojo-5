(ns spock.core)

(def jogadas 
  {:tesoura [:lagarto :papel]
   :papel   [:spock   :pedra]
   :pedra   [:tesoura :lagarto]
   :spock   [:pedra   :tesoura]
   :lagarto [:spock   :papel]})

(defn jokenpo [jogador1 jogador2]
  (let [jogadas-validas (jogadas jogador1)
  	    jogador1-vence  (some #(= jogador2 %) 
  	    	                    jogadas-validas)]
    (if (= jogador2 jogador1) 
        :empate
        (if jogador1-vence
            :jogador1
            :jogador2))))