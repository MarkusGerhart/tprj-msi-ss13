1. Eclipse mit JavaEE besorgen.
2. EMF-REST installieren http://emf-rest.com/install.html
3. Import e.g. Petrinet.ecore (Tutorial von EMF REST)
4. Apache Tomee JAX-RS "installieren" (s. Tutorial)
5. Eventuell muss servlet-api.jar zum BuildPath in Eclipse hinzugefügt werden
   http://stackoverflow.com/questions/860022/wheres-javax-servlet


Im Ordner WebContent/models werden die Modellinstanzen als XMI abgelegt.

Um auf die JS Lib zuzugreifen muss man in index.html erst noch die JS-Dateien
einbinden:

<script src="http://localhost:8080/SimpsonsTutorial/scripts/api.js"></script>
<script src="http://codeorigin.jquery.com/jquery-2.0.3.min.js"></script>


var getCallback = function(data) {console.log(data)}
RestApi.callGet("http://localhost:8080/SimpsonsTutorial/app/Family/Simpsons", getCallback, depth=1)

data = {"address":"742 Evergreen Terrace","parents":[{"firstName":"Homer","lastName":"Simpson"},{"firstName":"Marge","lastName":"Bouvier"}],"sons":[{"firstName":"Bart","lastName":"Simpson"}],"daughters":[{"firstName":"Lisa","lastName":"Simpson"},{"firstName":"Maggie","lastName":"Simpson"}],"pets":{"Dog":[{"name":"Knechtruprecht","breed":"Unknown"}],"Cat":[{"name":"Snowball II","breed":"Unknown"}],"RaceDog":[{"name":"Santa's Little Helper","breed":"Greyhound"}],"HuntingDog":[]}}

//RestApi.callPut("http://localhost:8080/SimpsonsTutorial/app/Family/Simpsons/pets/Dog", {"name": "Knechtruprecht", "breed": "Unknown"}, getCallback)

RestApi.callPut("http://localhost:8080/SimpsonsTutorial/app/Family/Simpsons", data, getCallback)