Man kann das XMI (hier petrinetdsl) mittels XSD validieren.
Eine solche petrinetdsl Datei kann z.B. von Graphiti produziert werden,
aus der Zeichnung des Benutzers.

Das XSD (PetrinetXMI.xsd) wurde mit EMF aus einem genmodel,
welches wiederum von ecore generiert wurde, generiert.
Dazu wird der XSD Ecore Converter der Teil von EMF ist benötigt.
(separat installierbar)
http://stackoverflow.com/questions/5644722/how-to-convert-ecore-emf-to-xsd
http://www.eclipse.org/modeling/emf/updates/
http://projects.eclipse.org/projects/modeling.emf

Achtung: das automatisch genierierte XSD enthält einen Link auf ein XMI.xsd,
welches irgendwo aus der Eclipse-Platform kommt. Das habe ich umgebogen,
so dass es auf ein Repositiory zeigt, so dass der u.g. Validator auch damit
zurecht kommt. Vorsichtshalber habe ich jedoch das XMI.xsd auch hier
beigelegt. Dieses würde man sonst man in plugins/org.eclipse.emf.ecore/models
finden.


Die Valideriung kann man im Browser schnell mal selbst veranschaulichen:

http://www.utilities-online.info/xsdvalidation

Einfach den Inahlt einer der beiden petrinetdsl als XML setzen,
und den Inhalt des PetrinetXMI.xsd als XSD setzen und
durch die o.g. Webseite validieren lassen.


Achtung: Das XSD validiert aber keine Strings wie z.B.
der von fromPlace="//@mapelements.0". (Zeile 4, valid.petrinetdsl)
Der String "//@mapelements.0" ist quasi eine Referenz auf ein Place, diese
kann aber auch mutwillig z.B. auf ein Transition umgebogen werden und
immer noch validieren!
Es wird also nur validiert ob fromPlace in dem Zusammenhang stimmt,
wenn hier fromTransition
stehen würde, wäre es für den Typ PTEdge invalide.

Das heißt, dass wenn wir ein XMI generieren wollen, wird das der Knackpunkt,
dass alle Argumente sorgfältig und zuverlässig gesetzt werden.
Die Argumente müssen also selbst durch einen Generierungsvorgang
zusammengesetzt sein!

Und hier wird es auch schwierig, da wir in irgendeiner Form die Grammatik von
*.spray zum generieren unseres XMI benötigen, da das XMI eine sehr
abstrakte Form des Modells ist.
Dieses Problem werden wir aber auf jeden Fall haben, spätestens im "Server"!
Auch wenn wir nicht direkt mit XMI arbeiten, irgendwann kommen wir zu dem Punkt,
wo wir irgendwas mit der Grammatik oder einer ihrer Ecore-Repräsentationen
machen müssen, da dies für die Semantikprüfung unausweichlich ist.