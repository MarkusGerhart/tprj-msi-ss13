package SprayWebSocket;

import java.io.IOException;
import java.util.Map;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

import Ecore.WebToEcoreFactory;
import Ecore.WebToEcoreFactoryImpl;

import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;

@WebSocket
public class SprayWebSocketHandler {

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        System.out.println("Close: statusCode=" + statusCode + ", reason=" + reason);
    }

    @OnWebSocketError
    public void onError(Throwable t) {
        System.out.println("Error: " + t.getMessage());
    }

    @OnWebSocketConnect
    public void onConnect(Session session) {
        System.out.println("Connect: " + session.getRemoteAddress().getAddress());
        try {
            session.getRemote().sendString("Hello Webbrowser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnWebSocketMessage
    public void onMessage(String message) {
        System.out.println("Message: " + message);
        
        JsonParserFactory factory=JsonParserFactory.getInstance();
        JSONParser parser=factory.newJsonParser();

        Map<?, ?> jsonData = parser.parseJson(message);
        String type = (String) jsonData.get("type");
        
        switch (type){
        	case "ecore":
        		this.ecoreCommandHandler(jsonData);
        		break;
        	default: break;
        }
    }
    
    private void ecoreCommandHandler( Map<?, ?> jsonData ){
    	String command = (String) jsonData.get("command");
    	//TODO: send message to client if error
        switch (command){
	    	case "createObj":
	    	{
	    		String domainObj = (String) jsonData.get("domainObj");
	    		WebToEcoreFactory factory = WebToEcoreFactoryImpl.getInstance();
	    		factory.createEObject(domainObj);
	    		break;
	    	}
	    	case "createConnection":
	    	{
	    		String domainObj = (String) jsonData.get("domainObj");
	    		String fromObj = (String) jsonData.get("fromObj");
	    		String toObj = (String) jsonData.get("toObj");
	    		String fromIDStr = (String) jsonData.get("fromID");
	    		String toIDStr = (String) jsonData.get("toID");
	    		Integer fromID = Integer.valueOf(fromIDStr);
	    		Integer toID = Integer.valueOf(toIDStr);
	    		WebToEcoreFactory factory = WebToEcoreFactoryImpl.getInstance();
	    		factory.createEObject(domainObj, fromObj, toObj, fromID, toID);
	    		break;
	    	}
	    	case "createCompartment":
	    	{
	    		String domainObj = (String) jsonData.get("domainObj");
	    		String parentObj = (String) jsonData.get("parentObj");
	    		String parentIDStr = (String) jsonData.get("parentID");
	    		Integer parentID = Integer.valueOf(parentIDStr);
	    		WebToEcoreFactory factory = WebToEcoreFactoryImpl.getInstance();
	    		factory.createEObject(domainObj, parentObj, parentID);
	    		break;
	    	}
	    	case "removeObj":
	    	{
	    		String domainObj = (String) jsonData.get("domainObj");
	    		String IDStr = (String) jsonData.get("ID");
	    		Integer ID = Integer.valueOf(IDStr);
	    		WebToEcoreFactory factory = WebToEcoreFactoryImpl.getInstance();
	    		factory.removeEObject(domainObj, ID);
	    		break;
	    	}
	    	case "removeConnection":
	    	{
	    		String domainObj = (String) jsonData.get("domainObj");
	    		String fromObj = (String) jsonData.get("fromObj");
	    		String toObj = (String) jsonData.get("toObj");
	    		String fromIDStr = (String) jsonData.get("fromID");
	    		String toIDStr = (String) jsonData.get("toID");
	    		Integer fromID = Integer.valueOf(fromIDStr);
	    		Integer toID = Integer.valueOf(toIDStr);
	    		WebToEcoreFactory factory = WebToEcoreFactoryImpl.getInstance();
	    		factory.removeEObject(domainObj, fromObj, toObj, fromID, toID);
	    		break;
	    	}
	    	case "removeObjFromParent":
	    	{
	    		String domainObj = (String) jsonData.get("domainObj");
	    		String IDStr = (String) jsonData.get("ID");
	    		Integer ID = Integer.valueOf(IDStr);
	    		String parentObj = (String) jsonData.get("parentObj");
	    		String parentIDStr = (String) jsonData.get("parentID");
	    		Integer parentID = Integer.valueOf(parentIDStr);
	    		WebToEcoreFactory factory = WebToEcoreFactoryImpl.getInstance();
	    		factory.removeEObject(domainObj, ID, parentObj, parentID);
	    		break;
	    	}
	    	default: break;
        }
    }
}