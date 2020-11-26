---
title: Übungsblatt 09
author: Zuletzt bearbeitet von Alexander Bazo
documentclass: scrartcl
classoption:
  - a4paper
header-includes: |
    \usepackage{german} 
    \usepackage[a4paper,left=2.5cm, right=2.5cm,top=2.5cm, bottom=3cm]{geometry}
    \usepackage{fancyhdr}
    \usepackage{graphicx}
    \pagestyle{fancy}
    \fancyhf{}
    \rhead{OOP WS 2020/21}
    \lhead{U09 | Übungsblatt 09}
    \cfoot{\includegraphics[height=2cm]{docs/footer.png}}
    \fancypagestyle{plain}{
      \fancyhf{}
      \rhead{OOP WS 2020/21}
      \lhead{U09 | Übungsblatt 09}
      \cfoot[C]{\includegraphics[height=2cm]{docs/footer.png}}}
---


# Template für Übungsaufgaben 

## Wichtige Informationen zur Bearbeitung der Aufgabe 
- [Informationen zur Entwicklungsumgebung *IntelliJ IDEA*](https://elearning.uni-regensburg.de/mod/book/view.php?id=1480675)
- [Informationen zum Im- und Export von Projekten](https://elearning.uni-regensburg.de/mod/book/view.php?id=1480675&chapterid=51551)
- [GraphicsApp](https://elearning.uni-regensburg.de/mod/url/view.php?id=1482162)

## Starterpaket

Ein vorbereitetes Starterpaket zur selbständigen Implementierung der Aufgabe finden Sie [hier](https://github.com/OOP-Ubungen-WS2020-21/U09-GraphicsApp/archive/Starterpaket.zip).

## SpeedDialApp

In diesem Übungsblatt implementieren Sie eine kleine App auf Basis der *GraphicsApp*, die der Schnellanruffunktion (SpeedDial) von Smartphones nachempfunden ist.

![SpeedDialApp](docs/SpeedDialApp1.png){ width=25% }

Überlegen Sie sich, in welche Komponenten Sie diese Applikation aufteilen wollen (z.B. Telefonbuch, Eintrag).
Trennen Sie die Daten von Einträgen von den Komponenten, mit denen diese in der App dargestellt werden sollen.
Legen Sie demnach entsprechende **packages** und **classes** an.
Erweitern Sie die gegebene Klasse `SpeedDialApp` im **SpeedDial-Package** und Ihre neu angelegten Klassen, um die `SpeedDialApp` zu implementieren.

Die SpeedDialApp soll folgende Funktionalitäten haben:
* Einlesen und Verarbeitung der Datei `contacts.csv` im Ordner `data`, um Telefonbucheinträge zu erstellen
  * Jeder Kontakt ist in einer Zeile gespeichert, bestehend aus **Name**, **AreaCode**, **Number** und der **Pfad zur Bilddatei**, die den Kontakt darstellt (Bilder sind im Ordner `data/assets` abgelegt)
  * Achten Sie auf die Formatierung und ignorieren Sie die erste Zeile (Header)
  
  `Vorname Nachname,12345,0987654321,mensch.jpg`
  
  * Das OOP-Team ist bereits in `contacts.csv` eingetragen
  * Neue Kontakte können hinzugefügt werden, in dem entsprechend eine neue Zeile zur `contacts.csv` hinzugefügt wird
* Implementieren der SpeedDialApp (siehe Bild oben)
  * Anpassung des Canvas
  * Verwendung von entsprechenden Datenstrukturen (z.B. **HashMap**, ArrayList)
  * Werfen Sie einen Blick auf die Klasse `Compound` in der *GraphicsApp* zur Erstellung von Einträgen
* Implementieren der Interaktion mit der SpeedDialApp
  * Wird ein Eintrag (blauer Hintergrund im Bild oben) angeklickt, sollen weitere Daten zur Person angezeigt werden (siehe Bild unten) 
  * Verwenden Sie den `GraphicsAppMouseListener`, um Maus-Events verarbeiten zu können
  * Schauen Sie sich die Methode `public bool hitTest(float x, float y)` in der Dokumentation der *GraphicsApp* an und verwenden Sie diese Methode, um festzustellen, ob ein Eintrag angeklickt wurde
  * Nach einem Klick sollen nur die Daten der Person angezeigt werden, die Sie angeklickt haben.
  
![SpeedDialApp nach Klick](docs/SpeedDialApp2.png){ width=25% }


