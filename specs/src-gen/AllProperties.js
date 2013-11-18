var shapedefs = [
	{
		name: "AllShapes",
		shapes: [
			{
				name: "Ellipse",
				params: {
					size: {width: 100, height: 100},
				},
				shapes: [
					{
						name: "Text",
						params: {
							position: {x: 50, y: 25},
							size: {width: 20, height: 10},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
					{
						name: "Polyline",
						params: {
							points: [
								{
									x: 0,
									y: 50,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 50,
									y: 40,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 100,
									y: 50,
									curveBefore: 0,
									curveAfter: 0
								},
							]
						}
					}
					,
					{
						name: "Line",
						params: {
							points: [
								{
									x: 0,
									y: 50,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 100,
									y: 50,
									curveBefore: 0,
									curveAfter: 0
								},
							]
						}
					}
					,
					{
						name: "RoundedRectangle",
						params: {
							position: {x: 25, y: 60},
							size: {width: 50, height: 30},
							curve: {width: 20, height: 20}
						},
						shapes: [
							{
								name: "Polygon",
								params: {
									points: [
										{
											x: 25,
											y: 0,
											curveBefore: 0,
											curveAfter: 0
										},
										{
											x: 0,
											y: 25,
											curveBefore: 40,
											curveAfter: 20
										},
										{
											x: 50,
											y: 25,
											curveBefore: 40,
											curveAfter: 20
										},
									]
								},
							}
							,
						]
					}
					,
				]
			}
			,
		]
	}
	,
	{
		name: "SimpleShape",
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_minmax",
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_streching",
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_streching",
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_all",
		params: {
			minWidth: 50,
			minHeight: 25,
			maxWidth: 150,
			maxHeight: 100,
			stretchH: true,
			stretchV: true,
			proportional: true
		},
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_center_anchor",
		anchors: [
				{type: "center"},
		],
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_corner_anchor",
		anchors: [
				{type: "corners"},
		],
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_fixpoint_anchor",
		anchors: [
				{type: "fixpoint", x: 0, y: 25},
				{type: "fixpoint", x: 100, y: 25},
		],
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
	{
		name: "SimpleShape_relative_anchor",
		anchors: [
				{type: "relative", x: 0.1, y: 0.0},
				{type: "relative", x: 0.8, y: 1.0},
		],
		shapes: [
			{
				name: "Rectangle",
				params: {
					size: {width: 100, height: 50},
				},
			}
			,
		]
	}
	,
]
