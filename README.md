# SOAP Demo
Progetto di esempio di un client-server SOAP usando JaxWS.

## Server
Fornisce dei servizi accessibili tramite SOAP: hello e calculate.
Entrambi i servizi sono raggiungibili a partire dalla base_url dell'applicazione. 
Per i test in locale sarà

 - [BASE_URL]: http://localhost:8080 Base Url

### hello service
E' accessibile alla url [$BASE_URL/hello](http://localhost:8080/hello?wsdl)
Offre la operation
- sayhello(name): restituisce la stringa "Hello, %name"

### calculate service
E' accessibile alla url [$BASE_URL/calculate](http://localhost:8080/calculate?wsdl).
Offre le operation:
- getArea(raggio): restituisce il valore dell'area del cerchio partendo dal valore di *raggio*
- getCirconferenza(raggio): restituisce il valore della circonferenza del cerchio partendo dal valore di *raggio*

## Client
Usufriusce del servizio SOAP creato, richiamando le sue operation.

## Dettagli tecnici
Il protocollo di comunicazione fra client e server è [SOAP](https://it.wikipedia.org/wiki/SOAP), un protocollo basato su messaggio XML su HTTP.
La comunicazione è di tipo Contract First, basata sulla definizione precisi messaggi di richiesta (request) e risposta (response).

Il server usa la libreria jaxws-api per 

## Contatti
author: Maurizio Aru
createt: 29/07/2025