var classdefs = [
	{
		name: "Place",
		shape: "PlaceShape",
		compartments: [
			{
				canContain: "Token",
				atLocationId: "tokensCompartment",
			},
		],
		palette: "Shapes",
	},
	{
		name: "Transition",
		shape: "TransitionShape",
		palette: "Shapes",
	},
	{
		name: "Token",
		shape: "TokenShape",
		palette: "Shapes",
	},
	{
		name: "PTEdge",
		connection: "ArrowConnectionShape",
		from: "Place",
		to: "Transition",
		palette: "Edges",
	},
	{
		name: "TPEdge",
		connection: "ArrowConnectionShape",
		from: "Transition",
		to: "Place",
		palette: "Edges",
	},
]