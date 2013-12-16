var Ecore = require('ecore');
var fs = require('fs');
var resourceSet = Ecore.ResourceSet.create();

fs.readFile("Petrinet.ecore", 'utf-8', function (err, data) {
    if (err) throw err;
    resource = resourceSet.create({ uri: "Petrinet.ecore" });
    resource.load(function(resource) {
        console.log(resource.get('uri') + ' loaded');
    }, function() {
        console.log('cannot load ' + "Petrinet.ecore");
    }, { data: data, format: Ecore.XMI });
});


// resource.to(Ecore.JSON)

var Elements = resource._index()

var PetrinetDSL = Elements["/"]
var Place = Elements["//Place"]
var Transition = Elements["//Transition"]
var TPEdge = Elements["//TPEdge"]

var t1 = Ecore.create(Transition)
var p1 = Ecore.create(Place)
var e1 = Ecore.create(TPEdge)
e1.set("fromTransition", t1)
e1.set("toPlace", p1)

// e1.get("fromTransition")

var rset = Ecore.ResourceSet.create();
var res = rset.create({ uri: '/model.json' });

var SamplePackage = Ecore.EPackage.create({
    name: PetrinetDSL.values.name,
    nsURI: PetrinetDSL.values.nsURI,
    nsPrefix: PetrinetDSL.values.nsPrefix,
    eClassifiers: [
        t1, p1, e1
    ]
});

res.add(SamplePackage)
res.to(Ecore.JSON)
// or res.to(Ecore.XMI)

// JSON.stringify(...)