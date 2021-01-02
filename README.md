# WeatherApp
#### Minutillo Alessandro, Scaraggi Vito, Nunin Davide

## Descrizione
L'applicazione da noi sviluppata consiste nell'implementazione di un servizio di monitoraggio del meteo mediante l'utilizzo dell'API OpenWeatherMap.

## Funzionamento

![Casi d'uso](link)

|Rotte|Metodo|Descrizione|Campo|
|---------|------------|-------|---------|
|  "/metadata" | Get | Rotta che restituisce tutti i possibili output che si possono incontrare andando ad utilizzare l'applicazione||
|  "/data/city"      | Get  | Rotta che restituisce un'arraylist contenente tutte le città disponibili sull'applicazione||
|  "/data/sampled"    | Get | Rotta che restituisce l'elenco delle città utilizzate per il campionamento dei dati ||
|  "/data/meteo"     | Get | Rotta che restituisce tutti i campionamenti effettuati dall'applicazione ||
|  "/data/meteo/filtered" | Post  | Rotta che restituisce tutti i campionamenti effettuati dall'applicazione filtrati mediante i parametri contenuti nel JSON body| "name", "coord", "period", "freq", "temp", "press"|
|  "/dictionary"     | Get | Rotta che permette di restituire le coordinate di una città mediante l'inserimento di una stringa (che rappresenta il nome della città) o di una sottostringa (contenuta nel nome della città) |"string" |
|  "/now"     | Get | Rotta che permette di visualizzare la situazione meteo corrente di una città date le sue coordinate geografiche |"lat", "lon"|
|  "/stats/temp"     | Post | Rotta che permette di visualizzare le statistiche sulla temperatura dei dati meteo campionati dall'applicazione, filtrati mediante i parametri contenuti nel JSON body |"name", "coord", "period", "freq", "temp", "press"|
|  "/stats/press"     | Post | Rotta che permette di visualizzare le statistiche sulla pressione dei dati meteo campionati dall'applicazione, filtrati mediante i parametri contenuti nel JSON body |"name", "coord", "period", "freq", "temp", "press"|
