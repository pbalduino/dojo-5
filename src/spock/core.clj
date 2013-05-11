(ns spock.core)

(def jogadas                                   ; jogadas é um hash/dicionário
  {:tesoura [:lagarto :papel]                  ; que contém as jogadas válidas 
   :papel   [:spock   :pedra]                  ; e as possibilidades que levam
   :pedra   [:tesoura :lagarto]                ; à vitória
   :spock   [:pedra   :tesoura]
   :lagarto [:spock   :papel]})

(defn jokenpo [jogador1 jogador2]
  (let [jogadas-validas (jogadas jogador1)     ; let cria um escopo local onde 
        jogador1-vence  (some #(= jogador2 %)  ; eu crio os valores (bindings)
                              jogadas-validas) ; que podem ser usados como
        jogadas-iguais  (= jogador1 jogador2)] ; constantes no código

    (cond jogadas-iguais :empate               ; assim o cond fica fácil de ler
          jogador1-vence :jogador1             ; =)
          :else          :jogador2)))