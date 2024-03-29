# Aufgabenstellung

Schreibe eine Klasse „CheckMail“. Diese soll eine Methode „public boolean
isValidMailadress(String address)“ enthalten. Diese Methode prüft ob die
übergebene Mailadresse (z.B. name@server.de) gültig ist und zwar anhand
folgender Kriterien:

• Es muss ein @-Zeichen vorhanden sein, davor muss mindestens ein
Zeichen (Name) stehen.

• Nach dem @ Zeichen muss irgendwo ein Punkt kommen (zur Abtrennung
der Top-Level-Domain).

• Zwischen @ und Punkt muss etwas stehen (Server) und nach dem Punkt
muss auch noch etwas stehen (mindestens 2 Zeichen für Top-Level-Domain).
