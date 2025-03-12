# WeatherApp

**WeatherApp** ist eine einfache CLI-Anwendung, die aktuelle Wetterdaten von der OpenWeather API abruft und in der Konsole anzeigt.


---


## Features
- Abruf von Wetterdaten für eine beliebige Stadt
- Anzeige von Temperatur, Wetterbeschreibung
- API-Schlüssel-Management mit `config.properties`


---


## Nutzung
Nach dem Starten der Anwendung wirst du aufgefordert, eine Stadt einzugeben:
```sh
Enter city: Berlin
City: Berlin
Temperature: 15°C
Description: Clear sky
```
Falls ein Fehler auftritt (z. B. falscher API-Key oder Stadt nicht gefunden), wird eine entsprechende Fehlermeldung ausgegeben.


---


## Technologien
- **Java 17** 
- **Guice** (Dependency Injection) 
- **Gson** (JSON Verarbeitung) 
- **Lombok** (Automatisierte Getter, Setter & Boilerplate-Reduktion) 
- **JetBrains Annotations** (Code-Qualität) 
- **Maven** (Build-Tool) 


---


## Fehlerbehebung
### `Error fetching weather data: Server returned HTTP response code: 401`
**Lösung:** Prüfe deinen API-Key in `config.properties`. Falls der Key korrekt ist, warte 15–30 Minuten oder erstelle einen neuen Key auf [OpenWeather](https://home.openweathermap.org/api_keys).

### `Cannot find city`
**Lösung:** Versuche eine andere Schreibweise (z. B. `Berlin,DE`). Falls das nicht hilft, nutze die [City-ID](https://openweathermap.org/current#cityid).

