progenitor(jose, joao_paulo).
progenitor(jose, mara).
progenitor(jose, paulo_cezar).
progenitor(madalena, joao_paulo).
progenitor(madalena, mara).
progenitor(madalena, paulo_cezar).
progenitor(sebastiao, luciene).
progenitor(sebastiao, lucimar).
progenitor(sebastiao, luizmar).
progenitor(maria_eduarda, luciene).
progenitor(maria_eduarda, lucimar).
progenitor(maria_eduarda, luizmar).
progenitor(paulo_cezar, guilherme).
progenitor(lucimar, guilherme).
progenitor(joao_paulo, pietra).
progenitor(marisa, pietra).
progenitor(mara, mariane).
progenitor(fernando, mariane).
progenitor(luciene, jose_neto).
progenitor(luciene, pedro_henrique).
progenitor(eliezer, jose_neto).
progenitor(eliezer, pedro_henrique).
progenitor(luizmar, rodrigo).
progenitor(luizmar, rogerio).
progenitor(maria_dilma, rodrigo).
progenitor(maria_dilma, rogerio).

homem(jose).
homem(joao_paulo).
homem(paulo_cezar).
homem(sebastiao).
homem(luizmar).
homem(rodrigo).
homem(rogerio).
homem(guilherme).
homem(fernando).
homem(jose_neto).
homem(pedro_henrique).
homem(eliezer).

mulher(mara).
mulher(madalena).
mulher(maria_eduarda).
mulher(luciene).
mulher(lucimar).
mulher(pietra).
mulher(marisa).
mulher(mariane).
mulher(maria_dilma).

avô(X,Z) :- progenitor(X,Y), progenitor(Y,Z), homem(X).
avó(X,Z) :- progenitor(X,Y), progenitor(Y,Z), mulher(X).
pai(X,Y) :- progenitor(X,Y), homem(X).
mae(X,Y) :- progenitor(X,Y), mulher(X).
filho(Y,X) :- progenitor(X,Y), homem(Y).
filha(Y,X) :- progenitor(X,Y), mulher(Y).
irmao(X,Y) :- progenitor(W,X), progenitor(W,Y), homem(X).
irma(X,Y) :- progenitor(W,X), progenitor(W,Y), mulher(X).
tio(A,G) :- homem(A), irmao(A,F), progenitor(F,G).
tia(B,D) :- mulher(B), irma(B,C), progenitor(C,D).
primo(X,Y) :- irmao(F,G), progenitor(F,X), progenitor(G, Y), homem(X), X\==Y; irma(F,G), progenitor(F,X), progenitor(G, Y), homem(X), X\==Y.
prima(X,Y) :- irmao(F,G), progenitor(F,X), progenitor(G, Y), mulher(X), X\==Y; irma(F,G), progenitor(F,X), progenitor(G, Y), mulher(X), X\==Y.