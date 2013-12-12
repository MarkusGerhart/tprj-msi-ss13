var classdefs = [
    {
        name: "PI_Vessel_Vertical",
        shape: "PI_Vessel_Vertical",
        palette: "Vessels",
        connection:[
            {
                from: "fromElement",
                to: "toElement"
            }
        ]

    },
    {
        name: "PI_Boiler",
        shape: "PI_Boiler",
        palette: "Vessels"
    },
    {
        name: "PI_CentralHeatingUnit",
        shape: "PI_CentralHeatingUnit",
        palette: "Vessels"
    },
    {
        name: "PI_Vessel_Horizontal",
        shape: "PI_Vessel_Horizontal",
        palette: "Vessels"
    },
    {
        name: "PI_HeatExchanger",
        shape: "PI_HeatExchanger",
        palette: "Vessels"
    },
    {
        name: "PI_Valve",
        shape: "PI_Valve",
        palette: "Valves"
    },
    {
        name: "PI_Valve_Manual",
        shape: "PI_Valve_Manual",
        palette: "Valves"
    },
    {
        name: "PI_Valve_Control",
        shape: "PI_Valve_Control",
        palette: "Valves"
    },
    {
        name: "PI_Pump",
        shape: "PI_Pump",
        palette: "Pumps"
    },
    {
        name: "PI_Pump_Vacuum",
        shape: "PI_Pump_Vacuum",
        palette: "Pumps"
    },
    {
        name: "PI_SystemEnd",
        shape: "PI_SystemEnd",
        palette: "Systemend"
    },
    {
        name: "PI_Joint",
        shape: "PI_Joint",
        palette: "Joints"
    },
    {
        name: "PI_Location_NoLine",
        shape: "PI_Location_NoLine",
        palette: "Locations"
    },
    {
        name: "PI_Location_SolidLine",
        shape: "PI_Location_SolidLine",
        palette: "Locations"
    },
    {
        name: "PI_Location_DashLine",
        shape: "PI_Location_DashedLine",
        palette: "Locations"
    },
    {
        name: "PI_Pipe",
        connection: "PI_Pipe",
        palette: "Connections"
    },
    {
        name: "PI_Source_Exhaust_Start",
        connection: "PI_Source_Exhaust",
        palette: "Connections"
    },
    {
        name: "PI_Source_Exhaust_Stop",
        connection: "PI_Source_Exhaust",
        palette: "Connections"
    }

];


var shapedefs = [
    {
        name: "PI_Pipe",
        connectionType: "freeform",
        placings: [
            {
                offset: 0.5,
                distance: 10,
                angle: 90,
                shape: {
                    name: "Text",
                    params: {
                        size: {width: 60, height: 20},
                        align: {
                            horizontal: "left",
                            vertical: "top"
                        },
                    }
                }
                ,
            },
        ]
    }
    ,
    {
        name: "PI_Source_Exhaust",
        connectionType: "freeform",
        placings: [
            {
                offset: 1.0,
                shape: {
                    name: "Polygon",
                    params: {
                        points: [
                            {
                                x: -10,
                                y: -5,
                                curveBefore: 0,
                                curveAfter: 0
                            },
                            {
                                x: -10,
                                y: 5,
                                curveBefore: 0,
                                curveAfter: 0
                            },
                            {
                                x: 0,
                                y: 0,
                                curveBefore: 0,
                                curveAfter: 0
                            },
                        ]
                    },
                }
                ,
            },
            {
                offset: 0.3,
                distance: 30,
                angle: 45,
                shape: {
                    name: "Text",
                    params: {
                        size: {width: 150, height: 25},
                        align: {
                            horizontal: "left",
                            vertical: "top"
                        },
                    }
                }
                ,
            },
        ]
    },
	{
		name: "PI_Vessel_Vertical",
        params:{
            width: 120,
            height: 60
        },
		shapes: [
			{
				name: "RoundedRectangle",
				params: {
					size: {width: 120, height: 60},
					curve: {width: 50, height: 50}
				},
				shapes: [
					{
						name: "Text",
						params: {
							position: {x: 3, y: 20},
							size: {width: 100, height: 20},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
				]
			}
			,
		]
	}
	,
	{
		name: "PI_Boiler",
        params:{
            width: 160,
            height: 100
        },
		anchors: [
				{type: "fixpoint", x: 0, y: 30},
				{type: "fixpoint", x: 0, y: 70},
				{type: "fixpoint", x: 90, y: 30},
				{type: "fixpoint", x: 90, y: 70},
		],
		shapes: [
			{
				name: "RoundedRectangle",
				params: {
					position: {x: 0, y: 0},
					size: {width: 60, height: 100},
					curve: {width: 30, height: 30}
				},
			}
			,
			{
				name: "Polyline",
				params: {
					points: [
						{
							x: 90,
							y: 70,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 30,
							y: 70,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 50,
							y: 50,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 30,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 90,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				}
			}
			,
			{
				name: "Text",
				params: {
					position: {x: 60, y: 0},
					size: {width: 100, height: 20},
					align: {
						horizontal: "left",
						vertical: "top"
					},
				}
			}
			,
		]
	}
	,
	{
		name: "PI_CentralHeatingUnit",
        params:{
            width: 200,
            height: 130
        },
		anchors: [
				{type: "fixpoint", x: 30, y: 0},
				{type: "fixpoint", x: 70, y: 0},
				{type: "fixpoint", x: 25, y: 110},
				{type: "fixpoint", x: 75, y: 110},
		],
		shapes: [
			{
				name: "RoundedRectangle",
				params: {
					position: {x: 0, y: 30},
					size: {width: 100, height: 100},
					curve: {width: 20, height: 20}
				},
			}
			,
			{
				name: "Polyline",
				params: {
					points: [
						{
							x: 30,
							y: 0,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 30,
							y: 70,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 50,
							y: 50,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 70,
							y: 70,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 70,
							y: 0,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				}
			}
			,
			{
				name: "Text",
				params: {
					position: {x: 100, y: 0},
					size: {width: 100, height: 20},
					align: {
						horizontal: "left",
						vertical: "top"
					},
				}
			}
			,
			{
				name: "Rectangle",
				params: {
					position: {x: 25, y: 100},
					size: {width: 50, height: 20},
				},
			}
			,
		]
	}
    ,
    {
        name: "SIMON_TEST",
        params:{
            width: 100,
            height: 130,
            proportional: false,
        },
        anchors: [
            {type: "fixpoint", x: 30, y: 0},
            {type: "fixpoint", x: 70, y: 0},
            {type: "fixpoint", x: 25, y: 110},
            {type: "fixpoint", x: 75, y: 110},
        ],
        shapes: [
            {
                name: "RoundedRectangle",
                params: {
                    position: {x: 0, y: 30},
                    size: {width: 100, height: 100},
                    curve: {width: 20, height: 20}
                },
            }
            ,
            {
                name: "Polyline",
                params: {
                    points: [
                        {
                            x: 30,
                            y: 0,
                            curveBefore: 0,
                            curveAfter: 0
                        },
                        {
                            x: 30,
                            y: 70,
                            curveBefore: 0,
                            curveAfter: 0
                        },
                        {
                            x: 50,
                            y: 50,
                            curveBefore: 0,
                            curveAfter: 0
                        },
                        {
                            x: 70,
                            y: 70,
                            curveBefore: 0,
                            curveAfter: 0
                        },
                        {
                            x: 70,
                            y: 0,
                            curveBefore: 0,
                            curveAfter: 0
                        },
                    ]
                }
            }
            ,
            {
                name: "Text",
                params: {
                    position: {x: 0, y: 0},
                    size: {width: 100, height: 20},
                    align: {
                        horizontal: "left",
                        vertical: "top"
                    },
                }
            }
            ,
            {
                name: "Rectangle",
                params: {
                    position: {x: 25, y: 100},
                    size: {width: 50, height: 20},
                },
            }
            ,
        ]
    }
	,
	{
		name: "PI_Vessel_Horizontal",
        params:{
            width: 63,
            height: 120
        },
		shapes: [
			{
				name: "RoundedRectangle",
				params: {
					size: {width: 60, height: 120},
					curve: {width: 50, height: 50}
				},
				shapes: [
					{
						name: "Text",
						params: {
							position: {x: 3, y: 50},
							size: {width: 60, height: 20},
							align: {
								horizontal: "left",
								vertical: "top"
							},
						}
					}
					,
				]
			}
			,
		]
	}
	,
	{
		name: "PI_HeatExchanger",
        params:{
            width: 100,
            height: 80
        },
		anchors: [
				{type: "fixpoint", x: 0, y: 50},
				{type: "fixpoint", x: 90, y: 30},
				{type: "fixpoint", x: 90, y: 70},
		],
		shapes: [
			{
				name: "Ellipse",
				params: {
					position: {x: 0, y: 20},
					size: {width: 60, height: 60},
				},
			}
			,
			{
				name: "Polyline",
				params: {
					points: [
						{
							x: 90,
							y: 70,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 30,
							y: 70,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 50,
							y: 50,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 30,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 90,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				}
			}
			,
			{
				name: "Text",
				params: {
					size: {width: 100, height: 20},
					align: {
						horizontal: "left",
						vertical: "top"
					},
				}
			}
			,
		]
	}
	,
	{
		name: "PI_Valve",
        params:{
            width: 120,
            height: 60
        },
		shapes: [
			{
				name: "Polygon",
				params: {
					points: [
						{
							x: 0,
							y: 0,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 120,
							y: 60,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 120,
							y: 0,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 0,
							y: 60,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				},
			}
			,
			{
				name: "Text",
				params: {
					position: {x: 30, y: 0},
					size: {width: 60, height: 20},
					align: {
						horizontal: "left",
						vertical: "top"
					},
				}
			}
			,
		]
	}
	,
	{
		name: "PI_Valve_Manual",
        params:{
            width: 120,
            height: 120
        },
		shapes: [
			{
				name: "Polygon",
				params: {
					points: [
						{
							x: 0,
							y: 60,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 120,
							y: 120,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 120,
							y: 60,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 0,
							y: 120,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				},
			}
			,
			{
				name: "Line",
				params: {
					points: [
						{
							x: 60,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 60,
							y: 90,
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
							x: 40,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 80,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				}
			}
			,
			{
				name: "Text",
				params: {
					position: {x: 30, y: 100},
					size: {width: 60, height: 20},
					align: {
						horizontal: "left",
						vertical: "top"
					},
				}
			}
			,
		]
	}
	,
	{
		name: "PI_Valve_Control",
        params:{
            width: 120,
            height: 120
        },
		shapes: [
			{
				name: "Polygon",
				params: {
					points: [
						{
							x: 0,
							y: 60,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 120,
							y: 120,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 120,
							y: 60,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 0,
							y: 120,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				},
			}
			,
			{
				name: "Line",
				params: {
					points: [
						{
							x: 60,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 60,
							y: 90,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				}
			}
			,
			{
				name: "Polygon",
				params: {
					points: [
						{
							x: 40,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 60,
							y: 0,
							curveBefore: 30,
							curveAfter: 30
						},
						{
							x: 80,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				},
			}
			,
			{
				name: "Text",
				params: {
					position: {x: 30, y: 100},
					size: {width: 60, height: 20},
					align: {
						horizontal: "left",
						vertical: "top"
					},
				}
			}
			,
		]
	}
	,
	{
		name: "PI_Pump",
        params:{
            width: 65,
            height: 60
        },
		shapes: [
			{
				name: "Ellipse",
				params: {
					size: {width: 60, height: 60},
				},
				shapes: [
					{
						name: "Line",
						params: {
							points: [
								{
									x: 8,
									y: 10,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 60,
									y: 30,
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
									x: 8,
									y: 50,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 60,
									y: 30,
									curveBefore: 0,
									curveAfter: 0
								},
							]
						}
					}
					,
					{
						name: "Text",
						params: {
							position: {x: 5, y: 20},
							size: {width: 60, height: 20},
							align: {
								horizontal: "left",
								vertical: "top"
							},
						}
					}
					,
				]
			}
			,
		]
	}
	,
	{
		name: "PI_Pump_Vacuum",
        params:{
            width: 65,
            height: 60
        },
		shapes: [
			{
				name: "Ellipse",
				params: {
					size: {width: 60, height: 60},
				},
				shapes: [
					{
						name: "Line",
						params: {
							points: [
								{
									x: 8,
									y: 10,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 57,
									y: 20,
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
									x: 8,
									y: 50,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 57,
									y: 40,
									curveBefore: 0,
									curveAfter: 0
								},
							]
						}
					}
					,
					{
						name: "Text",
						params: {
							position: {x: 5, y: 20},
							size: {width: 60, height: 20},
							align: {
								horizontal: "left",
								vertical: "top"
							},
						}
					}
					,
				]
			}
			,
		]
	}
	,
	{
		name: "PI_SystemEnd",
        params:{
            width: 20,
            height: 90
        },
		shapes: [
			{
				name: "Polyline",
				params: {
					points: [
						{
							x: 10,
							y: 30,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 20,
							y: 45,
							curveBefore: 30,
							curveAfter: 30
						},
						{
							x: 10,
							y: 60,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 0,
							y: 75,
							curveBefore: 30,
							curveAfter: 30
						},
						{
							x: 10,
							y: 90,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				}
			}
			,
		]
	}
	,
	{
		name: "PI_Joint",
        params:{
            width: 10,
            height: 10
        },
		shapes: [
			{
				name: "Ellipse",
				params: {
					size: {width: 10, height: 10},
				},
			}
			,
		]
	}
	,
	{
		name: "PI_Location_NoLine",
        params:{
            width: 50,
            height: 50
        },
		shapes: [
			{
				name: "Ellipse",
				params: {
					size: {width: 50, height: 50},
				},
				shapes: [
					{
						name: "Text",
						params: {
							position: {x: 0, y: 5},
							size: {width: 50, height: 20},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
					{
						name: "Text",
						params: {
							position: {x: 0, y: 30},
							size: {width: 50, height: 20},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
				]
			}
			,
		]
	}
	,
	{
		name: "PI_Location_SolidLine",
        params:{
            width: 50,
            height: 55
        },
		shapes: [
			{
				name: "Ellipse",
				params: {
					size: {width: 50, height: 50},
				},
				shapes: [
					{
						name: "Line",
						params: {
							points: [
								{
									x: 0,
									y: 25,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 50,
									y: 25,
									curveBefore: 0,
									curveAfter: 0
								},
							]
						}
					}
					,
					{
						name: "Text",
						params: {
							position: {x: 0, y: 5},
							size: {width: 50, height: 20},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
					{
						name: "Text",
						params: {
							position: {x: 0, y: 30},
							size: {width: 50, height: 20},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
				]
			}
			,
		]
	}
	,
	{
		name: "PI_Location_DashedLine",
        params:{
            width: 50,
            height: 50
        },
		shapes: [
			{
				name: "Ellipse",
				params: {
					size: {width: 50, height: 50},
				},
				shapes: [
					{
						name: "Line",
						params: {
                            style:{ lineStyle: "dash" },
							points: [
								{
									x: 0,
									y: 25,
									curveBefore: 0,
									curveAfter: 0
								},
								{
									x: 50,
									y: 25,
									curveBefore: 0,
									curveAfter: 0
								},
							]
						}
					}
					,
					{
						name: "Text",
						params: {
							position: {x: 0, y: 5},
							size: {width: 50, height: 20},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
					{
						name: "Text",
						params: {
							position: {x: 0, y: 30},
							size: {width: 50, height: 20},
							align: {
								horizontal: "center",
								vertical: "middle"
							},
						}
					}
					,
				]
			}
			,
		]
	},
];
