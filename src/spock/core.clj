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
                              jogadas-validas)
        jogadas-iguais  (= jogador1 jogador2)]

    (cond jogadas-iguais :empate
          jogador1-vence :jogador1
          :else          :jogador2)))