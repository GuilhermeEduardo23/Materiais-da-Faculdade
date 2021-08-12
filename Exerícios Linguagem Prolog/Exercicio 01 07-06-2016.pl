febre(joao,37).
febre(carlos,38).
febre(maria,39).

dor_de_cabeca(joao,menor).
dor_de_cabeca(carlos,intensa).
dor_de_cabeca(maria,intensa).

calafrios(joao,esporadico).
calafrios(carlos,frequente).
calafrios(maria,frequente).

cansaco(joao,moderado).
cansaco(carlos,extremo).
cansaco(maria,extremo).

dores_musculares(joao,moderada).
dores_musculares(carlos,intensa).
dores_musculares(maria,intensa).

dores_olhos(joao,leve).
dores_olhos(carlos,intenso).
dores_olhos(maria,intenso).

manchas(joao,nao).
manchas(carlos,nao).
manchas(maria,sim).

dor_garganta(joao,acentuada).
dor_garganta(carlos,leve).
dor_garganta(maria,nao).

tosse(joao,pouco).
tosse(carlos,seca_e_continua).
tosse(maria,nao).

muco(joao,extremo).
muco(carlos,pouco).
muco(maria,nao).

gripe(X) :- febre(X,Y), Y<38, dor_de_cabeca(X,menor), calafrios(X,esporadico), cansaco(X,moderado), dores_musculares(X,moderada), dores_olhos(X,leve), manchas(X,nao), dor_garganta(X,acentuada), tosse(X,pouco), muco(X,extremo).

influenza(X) :- febre(X,Y), Y==38, dor_de_cabeca(X,intensa), calafrios(X,frequente), cansaco(X,extremo), dores_musculares(X,intensa), dores_olhos(X,intenso), manchas(X,nao), dor_garganta(X,leve), tosse(X,seca_e_continua), muco(X,pouco).

dengue(X) :- febre(X,Y), Y>38, dor_de_cabeca(X,intensa), calafrios(X,frequente), cansaco(X,extremo), dores_musculares(X,intensa), dores_olhos(X,intenso), manchas(X,sim), dor_garganta(X,nao), tosse(X,nao), muco(X,nao).