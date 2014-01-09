var classdefs = [
    {
        name: "PI_Vessel_Vertical",
        shape: "PI_Vessel_Vertical",
        palette: "Vessels"
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
        from: "fromElement",
        to: "toElement",
        palette: "Connections"
    },
    {
        name: "PI_Source_Exhaust_Start",
        connection: "PI_Source_Exhaust",
        from: ["PI_HeatExchanger", "PI_CentralHeatingUnit"],
        to: ["PI_HeatExchanger", "PI_CentralHeatingUnit"],
        palette: "Connections"
    },
    {
        name: "PI_Source_Exhaust_Stop",
        connection: "PI_Source_Exhaust",
        from: "fromElement",
        to: "toElement",
        palette: "Connections"
    }

];