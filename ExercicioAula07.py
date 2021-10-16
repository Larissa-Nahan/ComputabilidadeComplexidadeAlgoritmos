def selectionSortOrdenada(lista):
    for i in range(len(lista)):
        aux = i
        for j in range(i+1, len(lista)):
            if lista[aux] > lista[j]:
                aux = j

        lista[i], lista[aux] = lista[aux], lista[i]
    return lista
  
lista = [6, 2, 1, 5, 3]

selectionSortOrdenada(lista)

# Complexidade de tempo: n*2*n*2 = 4n² = n²
# Complexidade de espaço: 1 + 1 + 1 = 1

## 10  | 10^10               = 100
## 100 | 100^100             = 10 mil
## 1k  | 1.000^1.000         = 1 milhão
## 1m  | 1.000.000^1.000.000 = 1 trilhão
