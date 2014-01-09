npm install ecore

https://github.com/ghillairet/ecore.js
http://ghillairet.github.io/emfjson/

Der Code von readEcore.js ist mit node lauffähig, aber auch im Browser.
(Achtung readFile ist asynchron!)

Wir brauchen noch einen "Glue Code" der das Ecore-Metamodell mit den
Shapes verbindet, also die Zuordnung macht welches Shape zu welem
Metamodell-Element gehört. Dann kann auch den Shapeverbindungen und
dem Metamodell eine Modellinstanz fabriziert werden.